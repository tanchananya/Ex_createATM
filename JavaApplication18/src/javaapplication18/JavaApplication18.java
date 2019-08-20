
package javaapplication18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaApplication18 {
    
    public static void main(String[] args) {
        
        String name;
        String pass;
        
        Scanner scan = new Scanner(System.in);
        Users users = new Users();
        ATM atm = new ATM();
        
        /*System.out.print("Enter your name : ");
        name = scan.next();
        System.out.print("Enter your password : ");
        pass = scan.next();
        
        users.checkUser(name,pass);
        */
        users.changePass("ATM1","6789");
        
        for (int i = 0 ;i<users.Uname.length ;i++){
            System.out.println(users.Uname[i]+" "+users.Upass[i]+" "+users.Umoney[i]);
        }

    }
    
}

