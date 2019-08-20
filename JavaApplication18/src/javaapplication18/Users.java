
package javaapplication18;

import java.util.Scanner;

public class Users {
    
    String[] Uname = {"ATM1","ATM2"};
    String[] Upass = {"1234","5678"};
    int[]   Umoney = {100000,100000};
    
    
    public static boolean checkUser(String name,String pass) {
        
        Users user = new Users();
        
        for (int i=0 ; i<user.Uname.length ; i++){
            if (name == null ? user.Uname[i] == null : name.equals(user.Uname[i]) && pass == null ? user.Upass[i] == null : pass.equals(user.Upass[i])){
                System.out.println("Name : "+name+" || Pass : "+pass+" || Money : "+user.Umoney[i]);  
                return true;
            }
            else{
                System.out.println("Name or Password incorrect.");
                break;
            }
                
        }
        return false;
    }
    
    public String[] getName(){
        return Uname;
    }
    public void setName(String[] newName){
        this.Uname = newName;
    }
    public String[] getPass(){
        return Upass;
    }
    public void setPass(String[] newPass){
        this.Upass = newPass;
    }
    public int[] getMoney(){
        return Umoney;
    }
    public void setMoney(int[] newMoney){
        this.Umoney = newMoney;
    }
    
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
