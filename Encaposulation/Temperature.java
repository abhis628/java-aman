package Encaposulation;

import java.util.Scanner;

public class Temperature {
    private double celcius;

    public Temperature(double value,char unit){
        switch(Character.toUpperCase(unit)){
            case 'C':
                setCelcius(value);
                break;
            case 'F':
                setFahrenheit(value);
                break;
            case 'K':
                setKelvin(value);
                break;
            default:
                System.out.println("invalid unit use 'C','F','K'");
        }
    }
    public void setCelcius(double temp){
        if(temp<-273.15){
            System.out.println("temperature can't be absolute zero (-273.15)");
        }
        else{
            this.celcius=temp;
        }
    }
    public void setFahrenheit(double temp){
        double c=(temp-32)*9/5;
        setCelcius(c);
    }
    public void setKelvin(double temp){
        double c=temp-273.15;
        setCelcius(c);
    }
    public double getClecius(){
        return celcius;
    }
    public double getFahrenheit(){
        return (celcius*9/5)+32;
    }
    public double getKelvin(){
        return celcius+273.15;
    }
    public String toString(){
        return String.format("temperature:\nCelcius: %.2f\nfahrenheit: %.2f\nkelvin: %.2f",getClecius(),getFahrenheit(),getKelvin());
    }
public static void main(String[] as){
    Scanner s=new Scanner(System.in);
    System.out.printf("enter temp:-");
    double value=s.nextDouble();
    System.out.printf("enter unit (C/F/K):-");
    char unit=s.next().toUpperCase().charAt(0);
    Temperature s1=new Temperature(value,unit);
    s1.setCelcius(value);
    s1.setFahrenheit(value);
    s1.setKelvin(value);
    System.out.println(s1.toString());
}
}
