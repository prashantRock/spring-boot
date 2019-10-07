package com.src;

class PlatinumPlan extends Subscription {
 
int totalNotificationSent;

 void getTotNotificationsPerDay(){
   System.out.println("Notifications allowed  per Day Unlimited");
   System.out.println("Charges : $500");

 }

 void sendEmailNotifications(String data){
     ++totalNotificationSent;
     int response=200;
     encryptData( data);
      System.out.println("send Email Notifications");
      // set response value;
  
   if(response==400){
        System.out.println("save in DB");
    }
  }

   void sendSMSNotifications(String data){
     ++totalNotificationSent;
     int response=200;
     encryptData( data);
      System.out.println("send SMS Notifications");
      // set response value;
  
   if(response==400){
        System.out.println("save in DB");
    }
  }

  void sendPushNotifications(String data){
     ++totalNotificationSent;
     int response=200;
     encryptData( data);
      System.out.println("send Push Notifications");
      // set response value;
  
   if(response==400){
        System.out.println("save in DB");
    }
  }

}