package com.src;

class GoldPlan extends Subscription {

int totalNotifications = 10000000;
int totalNotificationSent;
    public void getTotNotificationsPerDay(){
   System.out.println("Notifications allowed per Day "+totalNotifications);
   System.out.println("Charges : $99");
 }

    public void sendEmailNotifications(String data){
   ++totalNotificationSent;
   int response=200;
   if(totalNotificationSent<totalNotifications)
   { 
    encryptData( data);
    System.out.println("send Email Notifications");
    // set response value;
   }
   else
    System.out.println("you have reached the limit");
    
   if(response==400){
        System.out.println("save in DB");
    }
   }

    public void sendSMSNotifications(String data){
   ++totalNotificationSent;
   int response=200;
   if(totalNotificationSent<totalNotifications)
   { 
    encryptData( data);
    System.out.println("send SMS Notifications");
    // set response value;
   }
   else
    System.out.println("you have reached the limit");
    
   if(response==400){
        System.out.println("save in DB");
    }
   }
}