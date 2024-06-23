package com.streaming.data.processor.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProducerApplication implements CommandLineRunner {

    public static void main(String[] args){

        SpringApplication.run(SpringProducerApplication.class);
    }

    @Autowired
    private ChangesProducer changesProducer;

    @Override
    public void run(String... args) throws Exception {
    changesProducer.sendMessage();
    }
}

