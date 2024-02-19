import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Project_Matthew_Viegelmann 
{   
   public static void main(String[] args) throws IOException
   {
      //declare file
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      if(!file.exists()) //checks for file
      {
         System.out.println("File not found!");
         System.exit(0); //ends program if not found
      }
      
      
      //variables
      int policyNum;
      String providerName;
      String userFirst;
      String userLast;
      int userAge;
      String smokingStatus;
      double userHeight;
      double userWeight;
      int numSmokers = 0;
      int numNonSmokers = 0;
      
      //array
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      //read from file
      while(inputFile.hasNext())
      {
         //read new policy variables
         policyNum = inputFile.nextInt();
         inputFile.nextLine();
         providerName = inputFile.nextLine();
         userFirst = inputFile.nextLine();
         userLast = inputFile.nextLine();
         userAge = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         userHeight = inputFile.nextDouble();
         userWeight = inputFile.nextDouble();
         
         if(inputFile.hasNext())
         {
            inputFile.nextLine(); //skip blank line
            inputFile.nextLine();
         }
         
         
         
         //Add to Policy Array
         policies.add(new Policy(policyNum, providerName, userFirst, userLast, userAge, smokingStatus, userHeight, userWeight));
         
         if (smokingStatus.equals("smoker"))
         {
            numSmokers = numSmokers + 1;
         }
         else
         {
            numNonSmokers = numNonSmokers + 1;
         }
      }
      
      //Policy Array Loop
      for (int i = 0; i < policies.size(); i++){
         //display info
         System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
         System.out.println("Provider Name: " + policies.get(i).getProviderName());
         System.out.println("Policyholder's First Name: " + policies.get(i).getFirstName());
         System.out.println("Policyholder's Last Name: " + policies.get(i).getLastName());
         System.out.println("Policyholder's Age: " + policies.get(i).getAge());
         System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus());
         System.out.println("Policyholder's Height: " + policies.get(i).getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policies.get(i).getWeight() + " lbs");
         System.out.printf("Policyholder's BMI: %.2f\n", policies.get(i).getBMI());
         System.out.printf("Policy Price: $%.2f\n", policies.get(i).getPrice());
         
         System.out.println();
      }
      
      //display smoker counts
      System.out.printf("The number of policies with a smoker is: %s\n",numSmokers);
      System.out.printf("The number of policies with a non-smoker is: %s\n",numNonSmokers);
      
      
      inputFile.close();
      
      
      /** Manual input Code Block
      Scanner keyboard = new Scanner(System.in);
   
      //get info 
      System.out.print("Please enter the Policy Number: ");
      policyNum = keyboard.nextInt();
      keyboard.nextLine();
            
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      userFirst = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      userLast = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      userAge = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      userHeight = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      userWeight = keyboard.nextDouble();
      */
      
      
   }
}