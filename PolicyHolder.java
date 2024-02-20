public class PolicyHolder{
   //attributes
   private int policyNum;
   private String providerName;
   private String userFirst;
   private String userLast;
   private int userAge;
   private String smokingStatus;
   private double userHeight;
   private double userWeight;
   
   
   
   
   /**
   * toString method
   * @return a String representation of a PolicyHolder
   */
   public String toString()
   {
      return String.format(  "Policyholder's First Name: " + userFirst + "\n" +
               "Policyholder's Last Name: " + userLast + "\n" +
               "Policyholder's Age: " + userAge + "\n" +
               "Policyholder's Smoking Status: " + smokingStatus + "\n" +
               "Policyholder's Height: " + userHeight + " inches" + "\n" +
               "Policyholder's Weight: " + userWeight + " lbs" + "\n" +
               "Policyholder's BMI: %.2f" + "\n",getBMI());
   }
   
   
   
   
   //constructors
   /**
   *  This constructor is used to create a blank PolicyHolder object
   */
   public PolicyHolder()
   {
      userFirst = "";
      userLast = "";
      userAge = 0;
      smokingStatus = "";
      userHeight = 0;
      userWeight = 0;
   }
   
   /**
   *  This constructor is used to create a PolicyHolder object
   *  @param useFirst   This is the user's first name
   *  @param useLast    This is the user's last name
   *  @param aNum       This is the user's age
   *  @param sStat      This is the user's smoking status
   *  @param height     This is the user's height in inches
   *  @param weight     This is the user's weight in pounds
   */
   public PolicyHolder(String useFirst, String useLast,int aNum, String sStat, double height, double weight)
   {
      userFirst = useFirst;
      userLast = useLast;
      userAge = aNum;
      smokingStatus = sStat;
      userHeight = height;
      userWeight = weight;
   }
   
   
   
   ////////////////////////////////////////////////////////////////////////////////
   
   
   
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
   
   
   
   
   ////////////////////////////////////////////////////////////////////////////////
   
   
   
   
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
   
   
   
   ////////////////////////////////////////////////////////////////////////////////
   
   
   
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

}