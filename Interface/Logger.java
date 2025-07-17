package Interface;

import java.util.Scanner;

public interface Logger {
    void log(String massage);
}
class ConsoleLogger implements Logger{

    public void log(String massage){
        System.out.println("console logger " + massage);
    }
}
class FileLogger implements Logger{

    public void log(String massage){
        System.out.println("file logger " + massage);
    }
}
class DatabaseLogger implements Logger{

    public void log(String massage){
        System.out.println("database logger " + massage);
    }
 public static void main(String[] as){
     String massage="system error";

     ConsoleLogger s1=new ConsoleLogger();
     FileLogger s2=new FileLogger();
     DatabaseLogger s3=new DatabaseLogger();
     s1.log(massage);
     s2.log(massage);
     s3.log(massage);
 }
}
