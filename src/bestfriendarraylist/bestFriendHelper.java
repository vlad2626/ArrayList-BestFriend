/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfriendarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author valmi
 */
public class bestFriendHelper {
     static ArrayList< BestFriend> bff = new ArrayList<BestFriend>();
     static Scanner sc= new Scanner(System.in);
     
      /*
     do while loop with as the user for the info and will run until the user does not want to add anymore 
     
     */   
     public static void bffAdd()
     {
         
         int userAnswer;
         do{
         String fName1 , lName1, nName1, email2;
         String cPhone1;
         System.out.println("FirstName");
         fName1= sc.nextLine();
         
         System.out.println("LastName ");
         lName1 = sc.nextLine();
         
         System.out.println("Nick Name ?");
         nName1 = sc.nextLine();
         
         System.out.println(" Cell ?");
         cPhone1 = sc.nextLine();
         
         
         System.out.println("Email?");
         email2 = sc.nextLine();
         
         
         
         BestFriend bFriend = new BestFriend(fName1, lName1, nName1, cPhone1, email2);
         bff.add(bFriend);
             System.out.println("Would you like to enter another one");
             System.out.println("yes =1 , no = 2");
           userAnswer = sc.nextInt();
           sc.nextLine();
         }while (userAnswer != 2);
         
         
     }
     /*
     
     @param index- initialized to a nuumber outside the of the bff araay, if it is still -1 after the loop is ran, no mathcing info was found
     */
     public static void bffChange()
     {
        
         System.out.println("enter the first name of bff you would like to change .");
         String fName = sc.nextLine();
         
         int index=-1;
         // loop to find the matching first name.
         for(int i=0; i< bff.size(); i++)
         {
             if( fName.equalsIgnoreCase(bff.get(i).getfName()))
             {
                     index=i;
             }
         }
         if(index == -1)
            {
                System.out.println("Friend not found ");  
            }
             else
                 {
                System.out.println("what would you like to change ?");
                String userAnswer = sc.nextLine();
                System.out.println("first name, last name, nick name, email, phone ");
                do
                {
                    if (userAnswer.equalsIgnoreCase("first Name"))
                    {
                        System.out.println(" Enter the new First Name");
                        String fName2 = sc.nextLine();
                        bff.get(index).setfName(fName2);
                    }
                    else if(userAnswer.equalsIgnoreCase("last name"))
                    {
                        System.out.println("Enter the new last name");
                        String lName2 = sc.nextLine();
                        bff.get(index).setlName(lName2);
                    }
                    else if(userAnswer.equalsIgnoreCase("nick Name"))
                    {
                        System.out.println("Enter the new nick name");
                        String nName2 = sc.nextLine();
                        bff.get(index).setnName(nName2);
                    }
                    else if(userAnswer.equalsIgnoreCase("email"))
                    {
                        System.out.println("enter the new email.");
                        String email2 = sc.nextLine();
                        bff.get(index).setEmail(email2);
                    }
                    else if( userAnswer.equalsIgnoreCase("phone "))
                    {
                        System.out.println("Enter the new phone number, ");
                        String num1 = sc.nextLine();
                        bff.get(index).setcPhone(num1);
                        sc.nextLine();
                    }
                    else
                    {
                        System.out.println("Incorect type entered");
                        System.out.println("Please enter a correct field");
                        userAnswer = sc.nextLine();
                    }

                }while(!userAnswer.equalsIgnoreCase(" first name") || !userAnswer.equalsIgnoreCase(" last name") || !userAnswer.equalsIgnoreCase("nick name")|| !userAnswer.equalsIgnoreCase(" email") || !userAnswer.equalsIgnoreCase("phone"));
                        
                            
                        
                }
     }
             
           
             
         
     
         
        
       
     
         
     
     
     public static void bffRemove()
     {
         System.out.println("Enter the first name of the BFf you wish to remove");
         String fName2= sc.nextLine();
         int index=0;
         boolean found =false;
         // this will lopp to find the  match for the name the user wish to remove
         for(int i=0; i< bff.size(); i++)
         {
             if(fName2.equalsIgnoreCase(bff.get(i).getfName()))
             {
                 index =i;
                 found =true;
             }
             else
             {
                 found = false;
             }
             
            
         }
         // if the info is not found, then the user will get a no found message and will get booted back to the main menu
         if(found == true)
         {
            System.out.println("The Info being removed is: " + bff.get(index).toString());

            System.out.println("are you sure you wish to remove ?" +  "(yes / no)");
            String userConfirm = sc.nextLine();

            if (userConfirm.equalsIgnoreCase("yes"))
            {
                bff.remove(index);
            }
            else
            {
                System.out.println("the info wasnt removed.");
            }
         }
         else
         {
             System.out.println(" no bbf match the info entered");
         }
         
         
     }
     //@param index- will be passed to the search method and will return the index of the matching info enterend by the user
     /*
     @param userAnswer- stroe the user answer
     
     
     
     
     */
     public static void displayBff()
     {
         
         System.out.println("1. display phoneBook");
         System.out.println("2. display 1 person ");
         System.out.println("3. end");
         String fName;
         int userAnswer = sc.nextInt();
         sc.nextLine();
         
         int index=-1;
         
         
         
         
         if( userAnswer ==1)
         {
          for( BestFriend val : bff)
          {
              System.out.println(val);
          }
         }
         else if(userAnswer ==2)
         {
             search(index);
             
         }
         else if(userAnswer== 3)
         {
             System.out.println("EndingProgram");
         }
         
         
     }
     
     public static void end()
     {
         System.out.println("Thank you for using the program.");
     }
     
     public static int search( int index)
     {
         sc.nextLine();
         System.out.println("enter the first name ?");
         String fName12 = sc.nextLine();
         
         System.out.println("Enter the last name ");
         String lName12= sc.nextLine();
         
         System.out.println("Enter the nickname ");
         String nName12 = sc.nextLine();
         
         //BestFriend search = new BestFriend(fName12, lName12, nName12);
         // the loop will compare the users entered info and find the matching info within the array.
         for(int i=0; i <bff.size(); i++)
         {
           
             if(fName12.equalsIgnoreCase(bff.get(i).getfName()) && lName12.equalsIgnoreCase(bff.get(i).getlName()) && nName12.equalsIgnoreCase(bff.get(i).getnName()))
                     {
                         index = i;
                     }
            
         }
         
         if (index==-1)
         {
             System.out.println("Sorry Friend not found.");
         }
         else
         {
             System.out.println(bff.get(index).toString());
         }
        
         
         
         
             
           return index;  
         
         
     }
    
}
