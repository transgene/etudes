package net.transgene.kafka.baeldungtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Component
public class BasicProducer {

    @Value("${kafka.topics.basic}")
    private String topic;

    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public BasicProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String msg) {
        kafkaTemplate.send(topic, msg).addCallback(new ListenableFutureCallback<>() {
            @Override
            public void onFailure(Throwable ex) {
                System.out.printf("Unable to send message '%s'\n", msg);
            }
            @Override
            public void onSuccess(SendResult<String, String> result) {
                System.out.printf("Sent message '%s' to the topic '%s' with offset '%d'\n", msg, topic, result.getRecordMetadata().offset());
            }
        });
    }
}
