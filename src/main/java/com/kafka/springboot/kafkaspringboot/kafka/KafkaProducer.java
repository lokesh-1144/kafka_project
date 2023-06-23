package com.kafka.springboot.kafkaspringboot.kafka;

import com.kafka.springboot.kafkaspringboot.model.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String, Player> kafkaPlayerTemplate;

//    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }


    public void sendMessage(String msg){
        LOGGER.info("message sent "+msg);
        kafkaTemplate.send("cricket",msg);
    }

    public void sendJSONMessage(Player player){
        Message<Player> msg = MessageBuilder.withPayload(player)
                .setHeader(KafkaHeaders.TOPIC,"cricket_player")
                .build();
       kafkaPlayerTemplate.send(msg);
    }

}
