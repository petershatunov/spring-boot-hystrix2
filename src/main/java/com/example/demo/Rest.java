package com.example.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@RequestMapping("/api2")
@Slf4j
public class Rest {


    @Autowired
    private Tracer tracer;

    @GetMapping(path = "/test/{millisec}")
    @HystrixCommand(
                    commandProperties=
                                    {@HystrixProperty(
                                                    name="execution.isolation.thread.timeoutInMilliseconds",
                                                    value="5050")},
                    fallbackMethod = "hystrixFall")
    public String testHystrix(@PathVariable int millisec) {

        log.info("span:");
        log.info(tracer.getCurrentSpan().traceIdString());

        try {
            Thread.sleep(millisec);
        } catch (InterruptedException e) {
            log.info("ex:");
            log.info("e", e);
        }

        URI uri = URI.create("https://jsonplaceholder.typicode.com/posts?userId=1");

        String service2 = new RestTemplate().getForObject(uri, String.class);

        return service2;

    }

    private String hystrixFall(int millisec) {
        return "Sorry service2 is down at " + millisec + ". Please try again later";
    }

}
