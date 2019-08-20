
package javaapplication18;

import java.util.Scanner;

public class ATM {
    int[] money = {1000,500,100};
    int[] count = {10,10,10};

    public static void changePass(String name, String newPass){
        Scanner s = new Scanner(System.in);
        Users users = new Users();
        String bo;
        String[] newP = users.Upass;
        
        System.out.print("Do You want to change Password (y/n): ");
        bo = s.next();
        System.out.println(bo);
        
        if("y".equals(bo)){
            for(int i = 0 ; i < users.Uname.length ; i++){
                if (name == users.Uname[i]){
                    newP[i] = newPass; 
                    System.out.println("Your new pass : "+ users.Upass[i]);
                }
                users.setPass(newP);
                System.out.println("New Pass "+users.Upass[i]); 
            }
        }
        else{
            System.out.println("cancel complete");        
        }
        


    }/*changPass*/
}
