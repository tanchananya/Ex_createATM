
package javaapplication18;

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

  
}
