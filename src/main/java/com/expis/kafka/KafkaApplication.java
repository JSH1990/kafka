package com.expis.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        log.info(">>> Kafka 로그 테스트: 애플리케이션 시작됨 <<<");
        SpringApplication.run(KafkaApplication.class, args);
    }

}
