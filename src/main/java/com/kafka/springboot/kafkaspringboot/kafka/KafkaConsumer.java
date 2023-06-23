package com.kafka.springboot.kafkaspringboot.kafka;

import com.kafka.springboot.kafkaspringboot.model.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "cricket", groupId = "myGroup")
    public void consume(String msg){
            LOGGER.info("Message Received: "+msg);
    }

    @KafkaListener(topics = "cricket_player", groupId = "myGroup")
    public void consumeJSON(Player player){
        LOGGER.info("JSON Message Received: "+player.toString());
    }

}
