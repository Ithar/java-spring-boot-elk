package com.malik.ithar.elk.microservice.b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication

public class ApplicationMicroserviceB {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationMicroserviceB.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMicroserviceB.class, args);
        dummyLogging();
    }

    private static void dummyLogging() {

        logger.info(" >>>>>> Micro service 'B' up and running  <<<< ");

        TimerTask task = new TimerTask() {

            private int count = 0;

            @Override
            public void run() {
                logger.warn("Micro service 'B': ping  " + count);
                count++;
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, new Date(), 36000);
    }
}
