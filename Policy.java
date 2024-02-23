public class Policy
{
   //aggregation
   private PolicyHolder holder;
   
   
   //attributes
   private int policyNum;
   private String providerName;
   
   
   
   
   
   
   
   /**
   * toString method
   * @return a String representation of a Policy
   */
   public String toString()
   {
      return String.format(  "Policy Number: " + policyNum + "\n" +
               "Provider Name: " + providerName + "\n" +
               holder.toString() +
               "Policy Price: $%.2f" + "\n",getPrice());
   }
   
   
   
   ////////////////////////////////////////////////////////////////////////////////

   
   
   //constructors
   /**
   *  This constructor is used to create a blank Policy object
   */
   public Policy()
   {
      policyNum = 0;
      providerName = "";
      holder = new PolicyHolder();
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
   public Policy(int polNum, String proName, PolicyHolder pHolder)
   {
      policyNum = polNum;
      providerName = proName;
      //security
      holder = new PolicyHolder(pHolder);
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
   
   
   //security
   public void setHolder(PolicyHolder holder)
   {
      holder = new PolicyHolder(holder);
   }
   
   
   ////////////////////////////////////////////////////////////////////////////////
   
   
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
   
   
   //security
   public PolicyHolder getHolder()
   {
      return new PolicyHolder(holder);
   }
      
   
   ////////////////////////////////////////////////////////////////////////////////
   
   
   
   
      
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
      
      if(holder.getAge() > oldAge) //old fee
         price = price + oldFee;
         
      if(holder.getSmokingStatus().equalsIgnoreCase("smoker")) //smoker fee
         price = price + smokerFee;
            
      //bmi fee
      if(holder.getBMI() > bmiMin)
         price = price + ((holder.getBMI() - bmiMin) * bmiFee);
         
      return price;
   }
}