package ru.pupov.tcp_server_example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageService {

    public byte[] processMessage(byte[] message) {
        String messageContent = new String(message);
        log.info("received message: {}", messageContent);
        String responseContent = String.format("message \"%s\" is processed", messageContent);
        return responseContent.getBytes();
    }

}
