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
public class BestFriendArrayList {

    /**
     * @param args the command line arguments
     */
   
    static Scanner sc = new Scanner(System.in);
    static bestFriendHelper helper = new bestFriendHelper();
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
       
        int menOp;
        
        
        do
        {
             mainMenu();
             menOp = sc.nextInt();
            switch (menOp)
            {
                case 1: helper.bffAdd();
                break;

                case 2: helper.bffChange();
                break;

                case 3: helper.bffRemove();
                break;

                case 4: helper.displayBff();
                break;

                case 5: helper.end();
                break;
                
                default: System.out.println("please enter a valid opion");
               

                    
                      
            
            }
        } while (menOp != 5);   
    }
    // this is a display of the main menu to the user.
    public static void mainMenu()
    {
        
        System.out.println("Main Menu");
        System.out.println("1. add a new entry");
        System.out.println("2. Change a user ");
        System.out.println("3. remove a best friend ");
        System.out.println("4. Display ");
        System.out.println("5. end");
        
    }
            
            
    
    
}
