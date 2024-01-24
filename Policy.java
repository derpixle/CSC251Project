public class Policy
{
   //attributes
   private int policyNum;
   private String providerName;
   private String userFirst;
   private String userLast;
   private int userAge;
   private String smokingStatus;
   private double userHeight;
   private double userWeight;
   
   
   
   
   
   
   //constructors
   public Policy()
   {
      policyNum = 0;
      providerName = "";
      userFirst = "";
      userLast = "";
      userAge = 0;
      smokingStatus = "";
      userHeight = 0;
      userWeight = 0;
   }
   
   public Policy(int polNum, String proName, String useFirst, String useLast,int aNum, String sStat, double height, double weight)
   {
      policyNum = polNum;
      providerName = proName;
      userFirst = useFirst;
      userLast = useLast;
      userAge = aNum;
      smokingStatus = sStat;
      userHeight = height;
      userWeight = weight;
   }
   
   
   
   
   
   //setters
   public void setPolicyNumber(int polNum)
   {
      policyNum = polNum;
   }
   
   public void setProviderName(String proName)
   {
      providerName = proName;
   }
   
   public void setFirstName(String useFirst)
   {
      userFirst = useFirst;
   }
   
   public void setLastName(String useLast)
   {
      userLast = useLast;
   }
   
   public void setAge(int aNum)
   {
      userAge = aNum;
   }
   
   public void setSmokingStatus(String sStat)
   {
      smokingStatus = sStat;
   }
   
   public void setHeight(double height)
   {
      userHeight = height;
   }
   
   public void setWeight(double weight)
   {
      userWeight = weight;
   }

   
   
   
   
   
   //getters
   public int getPolicyNumber()
   {
      return policyNum;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public String getFirstName()
   {
      return userFirst;
   }
   
   public String getLastName()
   {
      return userLast;
   }
   
   public int getAge()
   {
      return userAge;
   }
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   public double getHeight()
   {
      return userHeight;
   }
   
   public double getWeight()
   {
      return userWeight;
   }
   
   
   
   
   
   
   
   //calculate BMI
   public double getBMI()
   {
      final double factor = 703;
      
      return (userWeight * factor)/(userHeight * userHeight);
   }
   
   //calculate price
   public double getPrice()
   {
      double price = 600;
      final double oldFee = 75;
      final double smokerFee = 100;
      final double bmiFee = 20;
      
      final int oldAge = 50;
      final int bmiMin = 35;
      
      if(userAge > oldAge) //old fee
         price = price + oldFee;
         
      if(smokingStatus.equalsIgnoreCase("smoker")) //smoker fee
         price = price + smokerFee;
            
      //bmi fee
      if(getBMI() > bmiMin)
         price = price + ((getBMI() - bmiMin) * bmiFee);
         
      return price;
   }
}