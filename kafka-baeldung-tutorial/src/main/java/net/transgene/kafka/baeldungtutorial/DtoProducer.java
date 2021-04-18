package net.transgene.kafka.baeldungtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Component
public class DtoProducer {

    @Value("${kafka.topics.dto}")
    //@Value("${kafka.topics.basic}")
    private String topic;

    private KafkaTemplate<String, KafkaDto> kafkaTemplate;

    @Autowired
    public DtoProducer(KafkaTemplate<String, KafkaDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(KafkaDto val) {
        kafkaTemplate.send(topic, val).addCallback(new ListenableFutureCallback<>() {
            @Override
            public void onFailure(Throwable ex) {
                System.out.printf("Unable to send message '%s'\n", val);
            }

            @Override
            public void onSuccess(SendResult<String, KafkaDto> result) {
                System.out.printf("Sent message '%s' to the topic '%s' with offset '%d'\n", val, topic, result.getRecordMetadata().offset());
            }
        });
    }
}
