package com.example.simple.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class MemoryPrinter {
    Logger logger = LoggerFactory.getLogger(MemoryPrinter.class);
    @Scheduled(fixedRate = 5, timeUnit = TimeUnit.SECONDS)
    public void print()
    {
        long max = Runtime.getRuntime().maxMemory()/(1024*1024);
        long total =Runtime.getRuntime().totalMemory()/(1024*1024);
        long free =Runtime.getRuntime().freeMemory()/(1024*1024);

        logger.info("Max {}M, Total {}M, Free {}M",max,total,free);


    }
}
