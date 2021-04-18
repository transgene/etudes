package net.transgene.kafka.baeldungtutorial;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class BasicConsumer {

    @KafkaListener(topics = "boot-baeldung", groupId = "basic")
    public void listenBasicGroup(String message) {
        System.out.printf("Got message '%s' from topic 'boot-baeldung'\n", message);
    }
}
