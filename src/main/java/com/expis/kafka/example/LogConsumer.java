//package com.expis.kafka.example;
//
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class LogConsumer {
//
//    @KafkaListener(topics = "app-logs", groupId = "log-group")
//    public void consume(ConsumerRecord<String, String> record) {
//        System.out.println("✅ Received message from Kafka:");
//        System.out.println("Key: " + record.key());
//        System.out.println("Value: " + record.value());
//        System.out.println("Partition: " + record.partition());
//        System.out.println("Offset: " + record.offset());
//    }
//}
