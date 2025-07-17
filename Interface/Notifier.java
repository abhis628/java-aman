package Interface;

public interface Notifier {
    void sendNotification(String msg);
}
class EmailNotifier implements Notifier{

    public void sendNotification(String msg){
        System.out.println("Email notifier " + msg);
    }
}
class SMSNotifier implements Notifier{

    public void sendNotification(String msg){
        System.out.println("sms Notifier " + msg);
    }
}
class PushNotifier implements Notifier{

    public void sendNotification(String msg){
        System.out.println("push notifier " + msg);
    }
}
class msg{
    public static void main(String[] as){
        String msg="welcome!";

        EmailNotifier s1=new EmailNotifier();
        SMSNotifier s2=new SMSNotifier();
        PushNotifier s3=new PushNotifier();
        s1.sendNotification(msg);
        s2.sendNotification(msg);
        s3.sendNotification(msg);
    }
}
