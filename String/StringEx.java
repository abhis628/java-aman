package String;

import java.util.Scanner;

public class StringEx {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);

        String name="aman";
        String name1="AMAN";
        String name2=new String(" aman");
        System.out.println(name==name2);
        System.out.println(name.length());
        System.out.println(name.charAt(1));
        System.out.println(name.concat(name2));
        System.out.println(name.equalsIgnoreCase(name1));
        System.out.println(name.compareTo(name1));
        System.out.println(name.toUpperCase());
        System.out.println(name1.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name1.substring(0,3));
        System.out.println(name1.replace('M','m'));
        System.out.println("java,c++".split(","));
        System.out.println(name.contains("an"));
        System.out.println(name.startsWith("a"));
        System.out.println(name.endsWith("n"));
    }
}
