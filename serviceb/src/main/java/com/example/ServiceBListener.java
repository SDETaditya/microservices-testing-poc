package com.example;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ServiceBListener {
    @RabbitListener(queues = "queue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
        // Process the message (e.g., save to database).
    }
}
