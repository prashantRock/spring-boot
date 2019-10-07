package com.controller;

import com.service.NotificationService;
import com.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    NotificationService notificationService;

    @Autowired
    SchedulerService schedulerService;

    @RequestMapping("/home")
    public String index() {
        return "We have 3 Packages - PLATINUM, GOLD, SILVER";
    }

    @RequestMapping("/plan/{planName}")
    public String choosePlan(@PathVariable(value="planName")  String planName) {
        return "We have added "+ planName +" Package with your subscription.";
    }

    @RequestMapping("/sendNotification")
    public String sendNotification(@RequestParam(name="data", required=false, defaultValue="World") String data) {
        String plan = "";
        notificationService.sendNotification(plan, data);
        return "We have sent notifications to the users with data ="+ data;
    }

    @RequestMapping("/scheduler")
    public String scheduler(@RequestParam(name="data", required=false, defaultValue="World") String data) {
        String plan = "";
        schedulerService.runScheduler(plan);
        return "We have sent notifications to the users which were not sent earlier ="+ data;
    }
}
