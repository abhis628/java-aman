package classobject;

import java.util.Scanner;

public class Account {
    String username;
    String password;
    boolean loginstatus;
    Account(String username,String password){
        this.username=username;
        this.password=password;
        this.loginstatus=false;
    }
    public void login(String inputpassword){
        if(password.equals(inputpassword)){
            loginstatus=true;
            System.out.println("login successfuly");
        }else{
            System.out.println("incorrect password");
        }
    }
    public void logout(){
        loginstatus=false;
        System.out.println("you logout");
    }
    void displaystatus(){
        if(loginstatus){
            System.out.println(username + "corrently login");
        }else{
            System.out.println(username + "not login ");
        }
    }
    public static void main(String[] arws){
        Scanner a=new Scanner(System.in);
        System.out.printf("enter Account username:-");
        String username=a.nextLine();
        System.out.printf("enter Account password:-");
        String password=a.nextLine();

        Account s1=new Account(username,password);
        System.out.printf("enter password to login:-");
        String inputpassword=a.nextLine();
        s1.login(inputpassword);
        s1.logout();
        s1.displaystatus();
    }
}
