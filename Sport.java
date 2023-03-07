
package fitnessapp;


public class Sport {
     private String Type;
    private static double Calories;
    private static  double HeartRate =80; 
    private int Time;
    private  double HeartRateIncrease;                      
    private int CaloriesRate;                              
    private double TotalHeartRateOfThisSport;                           
    private int   TotalCaloriesOfThisSport;
  
    
    
     public Sport(String SN )
    {
        Type = SN;
       if ( Type == "SWIMMING" )
        {
           HeartRateIncrease = 0.2/100 ;
           CaloriesRate = 4 ;
        }
         if ( Type == "RUNNING" )
        {
           HeartRateIncrease = 0.3/100 ;
           CaloriesRate = 5 ;
        }
          if ( Type == "KICK_BOXING" )
        {
           HeartRateIncrease = 0.5/100 ;
           CaloriesRate = 3 ;
        }
           if ( Type == "STRENGTH_TRAINING" )
        {
           HeartRateIncrease = 0.6/100 ;
           CaloriesRate = 5 ;
        }
    }
 
     public void CalculateHR()
    {
       HeartRate = HeartRate + ( HeartRate * Time * HeartRateIncrease );
       TotalHeartRateOfThisSport+=( HeartRate * Time * HeartRateIncrease );
    }
     public void CalculateCalories()
    {
        Calories =Calories+ ( CaloriesRate * Time );
        TotalCaloriesOfThisSport += CaloriesRate * Time;
    }

 

    public static double getCalories() {
        return Calories;
    }

    public static double getHeartRate() {
        return HeartRate;
    }
    
          public void setType(String Type) {
        this.Type = Type;
    }

    public void setCalories(double Calories) {
        this.Calories = Calories;
    }

    public void setHeartRate(double HeartRate) {
        this.HeartRate = HeartRate;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }

    public double getTotalHeartRateOfThisSport() {
        return TotalHeartRateOfThisSport;
    }
       public int getTotalCaloriesOfThisSport() {
        return TotalCaloriesOfThisSport;
    }
    
}
