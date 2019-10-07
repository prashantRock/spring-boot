package com.service;

import com.src.Subscription;
import com.src.SubscriptionFactory;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

    public void runScheduler(String plan){

        SubscriptionFactory factory = new SubscriptionFactory();
            Subscription subscription = factory.sendNotifications(plan);
            subscription.retrySendNotifications();

    }
}
