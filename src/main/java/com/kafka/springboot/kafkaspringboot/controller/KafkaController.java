package com.kafka.springboot.kafkaspringboot.controller;

import com.kafka.springboot.kafkaspringboot.kafka.KafkaProducer;
import com.kafka.springboot.kafkaspringboot.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KafkaController {
    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("msg") String msg){
        kafkaProducer.sendMessage(msg);
        return ResponseEntity.ok("Message sent topic");

    }

    @PostMapping("/publish/player")
    public ResponseEntity<String> publishJSON(@RequestBody Player msg){
        kafkaProducer.sendJSONMessage(msg);
        return ResponseEntity.ok("Player info sent to topic");
    }
}
