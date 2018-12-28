package com.example.demo.rabbit;

//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.core.*;
//import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
//import org.springframework.amqp.rabbit.connection.ConnectionFactory;
//import org.springframework.amqp.rabbit.core.RabbitAdmin;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

//@Configuration
//@Slf4j
public class RabbitConfiguration {

//    @Bean
//    public ConnectionFactory connectionFactory() {
//	CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost");
//	return connectionFactory;
//    }
//
//    @Bean
//    public AmqpAdmin amqpAdmin() {
//	return new RabbitAdmin(connectionFactory());
//    }
//
//    @Bean
//    public RabbitTemplate rabbitTemplate() {
//	RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
//	rabbitTemplate.setExchange("exchange-example-3");
//	return rabbitTemplate;
//    }
//
//    @Bean
//    public Queue myQueue1() {
//	return new Queue("queue1");
//    }
//
//    @Bean
//    public Queue myQueue2() {
//	return new Queue("queue2");
//    }
//
//    @Bean
//    public Binding binding1(){
//	return BindingBuilder.bind(myQueue1()).to(fanoutExchangeA()).with("#even#");
//    }
//
//    @Bean
//    public Binding binding2(){
//	return BindingBuilder.bind(myQueue2()).to(fanoutExchangeA()).with("#odd#");
//    }
//
//    @Bean
//    public TopicExchange fanoutExchangeA(){
//	return new TopicExchange("exchange-example-3");
//    }

}
