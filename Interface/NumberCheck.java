package Interface;

import java.util.Scanner;
@FunctionalInterface
public interface NumberCheck {
    boolean check(int num);
}
class Numberchecktest{
 public static void main(String[] as){
     Scanner sc=new Scanner(System.in);


     NumberCheck toeven = (num)->num%2==0;

     NumberCheck toprime=(num)->{
         if(num<=1)return false;
         for(int i=2;i<Math.sqrt(num);i++){
             if(num%i==0){
                 return false;
             }
         }
         return true;
     };
     NumberCheck topalindrom=(num)->{
       int original=num,reverse=0;
       while(num!=0){
           int digit=num%10;
           reverse=reverse*10+digit;
           num/=10;
       }
       return original==reverse;
     };

     System.out.print("enter num:-");
     int num=sc.nextInt();

     System.out.println("even " + toeven.check(num));
     System.out.println("prime " + toprime.check(num));
     System.out.println("palinderom " + topalindrom.check(num));
 }
}