import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Project_Matthew_Viegelmann 
{   
   private static int numPolicies = 0;
   
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
         
         //Create Policy Holder
         PolicyHolder holder = new PolicyHolder(userFirst, userLast, userAge, smokingStatus, userHeight, userWeight);
         
         //Add to Policy Array
         policies.add(new Policy(policyNum, providerName, holder));
         numPolicies = numPolicies + 1;
         
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
         System.out.print(policies.get(i));
         System.out.println();
      }
      
      //display policy/smoker counts
      System.out.printf("There were %s%s\n",numPolicies," Policy objects created.");
      System.out.printf("The number of policies with a smoker is: %s\n",numSmokers);
      System.out.printf("The number of policies with a non-smoker is: %s\n",numNonSmokers);
      
      
      
      inputFile.close();
   }
}