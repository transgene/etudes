package net.transgene.kafka.baeldungtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producers")
public class ProducerController {

    private BasicProducer basicProducer;

    private DtoProducer dtoProducer;

    @Autowired
    public ProducerController(BasicProducer basicProducer, DtoProducer dtoProducer) {
        this.basicProducer = basicProducer;
        this.dtoProducer = dtoProducer;
    }

    @PostMapping("/basic")
    public ResponseEntity<String> sendToBasic(@RequestParam("msg") String msg) {
        basicProducer.sendMessage(msg);
        return ResponseEntity.ok("Message sent to basic producer");
    }

    @PostMapping("/dto")
    public ResponseEntity<String> sendToDto(@RequestBody KafkaDto dto) {
        dtoProducer.sendMessage(dto);
        return ResponseEntity.ok("Message sent to DTO producer");
    }
}
