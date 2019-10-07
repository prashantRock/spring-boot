package com.src;

public abstract class Subscription {
 
  protected int totalNotifications;  
  protected int totalNotificationSent;  

  public abstract void sendEmailNotifications(String data);

  public void  sendSMSNotifications(String data){
    System.out.println("******** Plan does not consist of SMS Notification ********");
  };

  public void  sendPushNotifications(String data){
    System.out.println("******** Plan does not consist of Push Notification *******");
  };

  public abstract void getTotNotificationsPerDay();

  public void retrySendNotifications(){
    //Fetch from DB and again send notification for fail Events
  }
  void encryptData(String data){

      System.out.println("****** Encrypt Data ********");
  }

}