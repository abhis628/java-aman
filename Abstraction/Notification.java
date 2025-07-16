package Abstraction;

import java.util.Scanner;

public interface Notification {
     void NotifyUser(String massage);
}
class EmailNotificatin implements Notification{
    private String recipient;

    public EmailNotificatin(String recipient){
        if(recipient.contains("@")){
            this.recipient=recipient;
        }
        else{
            System.out.println("email must be contain @");
        }
    }
    public void NotifyUser(String massage){
        System.out.println("email sent to recipient " + recipient + ":" + massage);
    }
}
class SmsNotification implements Notification{
    private String recipient;

    public SmsNotification(String recipient){
        if (recipient.matches("\\d{10}")){
            this.recipient=recipient;
        }
        else{
            System.out.println("phone no must be 10 digit");
        }
    }

    public void NotifyUser(String massage){
        System.out.println("sms sent to recipient " + recipient + ":" + massage);
    }
}
class Notifications{
    public static void main(String[] as){
        Scanner s=new Scanner(System.in);

        System.out.printf("enter email:-");
        String recipient=s.nextLine();
        System.out.printf("enter massage");
        String massage=s.nextLine();

        System.out.printf("enter phone no:-");
        String recipient1=s.nextLine();
        System.out.printf("enter massage");
        String massage1=s.nextLine();
        EmailNotificatin s1=new EmailNotificatin(recipient);
        SmsNotification s2=new SmsNotification(recipient1);

        s1.NotifyUser(massage);
        s2.NotifyUser(massage1);
    }

}