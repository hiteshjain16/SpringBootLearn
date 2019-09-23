package com.hitesh.Scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@EnableScheduling
@Component
public class ScheduleTask {
    //This class is to demonstrate task scheduling ability in Spring
    private static final Logger log = LoggerFactory.getLogger(ScheduleTask.class);
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 10000)
    public void reportCurrentTime(){
        log.info("Current time is -> " + sdf.format(new Date()));
    }
}
