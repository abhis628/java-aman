package Poliymoephism;

public class Empolyee {
    int getbonus(){
        return  1000;
    }
}
class Manager extends Empolyee{
    int getbonus(){
        return 3000;
    }
}
class Developer extends Manager{
    int getbonus(){

        return 2000;
    }
 public static void main(String[] as){
       Empolyee s1=new Empolyee();
       Manager s2=new Manager();
       Developer s3=new Developer();
       int result=s1.getbonus();
       System.out.println("empolyee bonus: " + result);
       int result1=s2.getbonus();
       System.out.println("manager bonus: " + result1);
       int result2=s3.getbonus();
       System.out.println("developer bonus: " + result2);
 }
}
