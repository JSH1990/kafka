package com.expis.kafka.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/kafka")
public class KafkaController {
    private final KafkaProducerService producerService;

    public KafkaController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/send")
    public void sendMessage(@RequestParam(name = "message") String message) {
        producerService.sendMessage(message);
//        log.error("test");
    }
}
