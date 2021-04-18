package net.transgene.kafka.baeldungtutorial;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DtoConsumer {

    @KafkaListener(topics = "boot-kafka-dto", groupId = "dto")
    //@KafkaListener(topics = "boot-baeldung", groupId = "dto")
    public void listenDtoGroup(KafkaDto val) {
        System.out.printf("Got message '%s' from topic 'boot-kafka-dto'\n", val);
        //System.out.printf("Got message '%s' from topic 'boot-baeldung'\n", val);
    }
}
