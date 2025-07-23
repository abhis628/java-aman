package Abstraction;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract  class Logger {

 abstract void log(String masg);
     public String getTimestamp(){
         DateTimeFormatter dtf=DateTimeFormatter.ofPattern("YYYY-mm-dd");
         return dtf.format(LocalDateTime.now());
     }
}
class FileLogger extends Logger{

    public void log(String masg){
        System.out.println("[file][" + getTimestamp() + "]" + masg);
    }
}
class ConsoleLogger extends Logger{
    public void log(String masg){
        System.out.println("[console][" + getTimestamp() + "]" + masg);
    }
}
class DatabaseLogger extends Logger{
    public void log(String masg){
        System.out.println("[database][" + getTimestamp() + "]" + masg);
    }

  public static void main(String[] as){
        FileLogger s=new FileLogger();
        ConsoleLogger s1=new ConsoleLogger();
        DatabaseLogger s2=new DatabaseLogger();
        s.log("this is file massage");
        s1.log("this is console massage");
        s2.log("this is database massage");

  }
}