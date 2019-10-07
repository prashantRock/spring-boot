package com.src;

class Silverplan extends Subscription {
 
 int totalNotifications = 1000000;
int totalNotificationSent;

    public void getTotNotificationsPerDay(){
   System.out.println("Notifications allowed per Day "+totalNotifications);
   System.out.println("Charges : $49");
 }

    public void sendEmailNotifications(String data){
   ++totalNotificationSent;
   int response=200;
   if(totalNotificationSent<totalNotifications)
     { encryptData( data);
      System.out.println("send Email Notifications");
      // set response value;
     }
   else
      System.out.println("you have reached the limit");
    
   if(response==400){
        System.out.println("save in DB");
    }
   }

  
}