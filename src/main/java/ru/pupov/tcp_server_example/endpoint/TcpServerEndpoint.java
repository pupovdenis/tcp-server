package ru.pupov.tcp_server_example.endpoint;

import lombok.RequiredArgsConstructor;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import ru.pupov.tcp_server_example.service.MessageService;

@MessageEndpoint
@RequiredArgsConstructor
public class TcpServerEndpoint {

    private final MessageService messageService;

    @ServiceActivator(inputChannel = "inboundChannel")
    public byte[] process(byte[] message) {
        return messageService.processMessage(message);
    }
}
