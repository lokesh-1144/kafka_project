package com.kafka.springboot.kafkaspringboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic cricketTopic(){
        return TopicBuilder.name("cricket").build();
    }


    @Bean
    public NewTopic cricketJSONTopic(){
        return TopicBuilder.name("cricket_player").build();
    }

}
