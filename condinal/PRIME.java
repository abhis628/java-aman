package condinal;

import java.util.Scanner;

public class PRIME {
    public static void main(String[] agrs){

        Scanner bipin= new Scanner(System.in);
        System.out.println("enter no");
        int a=bipin.nextInt();
        int flag=1;
        for(int i=2;i<a;i++){
            if(a%i==0){
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("prime no " + a);
        }
        else{
            System.out.println("not prime no " + a);
        }
        }
    }

