package com.malik.ithar.elk.microservice.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication

public class ApplicationMicroserviceA {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationMicroserviceA.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMicroserviceA.class, args);
        dummyLogging();
    }

    private static void dummyLogging() {

        logger.info(" >>>>>> Micro service 'A' up and running  <<<< ");

        TimerTask task = new TimerTask() {

            private int count = 0;

            @Override
            public void run() {
                logger.warn("Micro service 'A': ping  " + count);
                count++;
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, new Date(), 27000);

    }
}
