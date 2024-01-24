import java.util.Scanner;

public class Project_Matthew_Viegelmann 
{   
   public static void main(String[] args)
   {
      //variables
      int policyNum;
      String providerName;
      String userFirst;
      String userLast;
      int userAge;
      String smokingStatus;
      double userHeight;
      double userWeight;
      Scanner keyboard = new Scanner(System.in);
   
      //get info 
      System.out.print("Please enter the Policy Number: ");
      policyNum = keyboard.nextInt();
      keyboard.nextLine();
            
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s First Name: ");
      userFirst = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Last Name: ");
      userLast = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Age: ");
      userAge = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      userHeight = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      userWeight = keyboard.nextDouble();
      
      //setup policy
      Policy policy = new Policy(policyNum, providerName, userFirst, userLast, userAge, smokingStatus, userHeight, userWeight);
      System.out.println();
      
      //display info
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy.getWeight() + " lbs");
      System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
   }
}