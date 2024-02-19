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
   /**
   *  This constructor is used to create a blank Policy object
   */
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
   
   /**
   *  This constructor is used to create a Policy object
   *  @param polNum     This is the policy number
   *  @param proName    This is the provider name
   *  @param useFirst   This is the user's first name
   *  @param useLast    This is the user's last name
   *  @param aNum       This is the user's age
   *  @param sStat      This is the user's smoking status
   *  @param height     This is the user's height in inches
   *  @param weight     This is the user's weight in pounds
   */
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
   /**
   *  This setter is used to set the Policy Number
   *  @param polNum     This is the policy number
   */
   public void setPolicyNumber(int polNum)
   {
      policyNum = polNum;
   }
   
   /**
   *  This setter is used to set the Provider Name
   *  @param proName    This is the provider name
   */
   public void setProviderName(String proName)
   {
      providerName = proName;
   }
   
   /**
   *  This setter is used to set the User's First Name
   *  @param useFirst   This is the user's first name
   */
   public void setFirstName(String useFirst)
   {
      userFirst = useFirst;
   }
   
   /**
   *  This setter is used to set the User's Last Name
   *  @param useLast    This is the user's last name
   */
   public void setLastName(String useLast)
   {
      userLast = useLast;
   }
   
   /**
   *  This setter is used to set the User's Age
   *  @param aNum       This is the user's age
   */
   public void setAge(int aNum)
   {
      userAge = aNum;
   }
   
   /**
   *  This setter is used to set the User's Smoking Status
   *  @param sStat      This is the user's smoking status
   */
   public void setSmokingStatus(String sStat)
   {
      smokingStatus = sStat;
   }
   
   /**
   *  This setter is used to set the User's Height
   *  @param height     This is the user's height in inches
   */
   public void setHeight(double height)
   {
      userHeight = height;
   }
   
   /**
   *  This setter is used to set the User's Weight
   *  @param weight     This is the user's weight in pounds
   */
   public void setWeight(double weight)
   {
      userWeight = weight;
   }

   
   
   
   
   
   //getters
   /**
   *  This getter is used to get the Policy Number
   */
   public int getPolicyNumber()
   {
      return policyNum;
   }
   
   /**
   *  This getter is used to get the Provider Name
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
   *  This getter is used to get the User's First Name
   */
   public String getFirstName()
   {
      return userFirst;
   }
   
   /**
   *  This getter is used to get the User's Last Name
   */
   public String getLastName()
   {
      return userLast;
   }
   
   /**
   *  This getter is used to get the User's Age
   */
   public int getAge()
   {
      return userAge;
   }
   
   /**
   *  This getter is used to get the User's Smoking Status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
   *  This getter is used to get the User's Height
   */
   public double getHeight()
   {
      return userHeight;
   }
   
   /**
   *  This getter is used to get the User's Weight
   */
   public double getWeight()
   {
      return userWeight;
   }
   
   
   
   
   
   
   
   //calculate BMI
   /**
   *  This method is used to calculate the User's BMI
   *  @param userWeight This is the stored weight in pounds
   *  @param userHeight This is the stored height in inches
   *  @return double BMI calculation
   */
   public double getBMI()
   {
      final double factor = 703;
      
      return (userWeight * factor)/(userHeight * userHeight);
   }
   
   //calculate price
   /**
   *  This method is used to calculate the Policy's Price using the User's Calculated BMI
   *  @param getBMI() This is the calculated BMI
   *  @return double Price calculation
   */
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