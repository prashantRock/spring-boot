package com.service;


import com.src.Subscription;
import com.src.SubscriptionFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotification(String plan, String data){


        SubscriptionFactory factory = new SubscriptionFactory();
        Subscription subscription = factory.sendNotifications(plan);
        subscription.sendEmailNotifications(data);
        subscription.sendSMSNotifications("data");
        subscription.sendPushNotifications("data");
    }
}
