package com.src;

import com.src.GoldPlan;
import com.src.PlatinumPlan;
import com.src.Silverplan;

public class SubscriptionFactory{

  public Subscription sendNotifications(String plan){
    if(plan == null){  
      return null;  
    }  
    if(plan.equalsIgnoreCase("GOLD")) {  
      return new GoldPlan();
    }   
    else if(plan.equalsIgnoreCase("SILVER")){  
      return new Silverplan();
    }   
    else if(plan.equalsIgnoreCase("PLATINUM")){  
      return new PlatinumPlan();
    }  
    return null; 
   }

}