package com.streaming.data.processor.springboot;

import com.streaming.data.processor.springboot.entity.WikiMediaData;
import com.streaming.data.processor.springboot.repository.WikiMediaDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ChangesConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChangesConsumer.class);
    private WikiMediaDataRepository wikiMediaDataRepository;

    public ChangesConsumer(WikiMediaDataRepository wikiMediaDataRepository) {
        this.wikiMediaDataRepository = wikiMediaDataRepository;
    }



    @KafkaListener(topics = "wikimedia_recentchange", groupId = "wikiMediaGroup")
    public void consumer(String eventMessage){
        LOGGER.info(String.format("Event Message Received -> %s",eventMessage));

        WikiMediaData wikiMediaData = new WikiMediaData();
        wikiMediaData.setWikiEventData(eventMessage);

        wikiMediaDataRepository.save(wikiMediaData);
    }
}
