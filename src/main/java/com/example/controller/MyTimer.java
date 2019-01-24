package com.example.controller;

import com.example.utils.IdWorkerUtilss;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class MyTimer {

    Logger logger = LoggerFactory.getLogger(MyTimer.class);
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 3000)
    public void getTime(){

        System.out.println(sdf.format(new Date()));
        System.out.println(IdWorkerUtilss.getIdStr());
    }


    @Scheduled(initialDelay = 3000,fixedRate = 3000)
    public void getTime2(){
        System.out.println("init:"+sdf.format(new Date()));
    }

    //每分钟的第六秒
    @Scheduled(cron = "6 * * * * ?")
    public void getTime3(){
        System.out.println("currentTime:"+sdf.format(new Date()));

    }

}
