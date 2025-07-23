package Interface;

import java.util.Scanner;

@FunctionalInterface
public interface StringProcessor {
    String process(String input);
}
 class StringProcessortest{
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string");
        String input=sc.nextLine();
        StringProcessor toUpperCase=(str)->str.toUpperCase();
        StringProcessor reverse=(str)->new StringBuilder(str).reverse().toString();
        StringProcessor removespace=(str)->str.replaceAll(" ","");
        System.out.println("origanal " + input);
        System.out.println("uppercase " + toUpperCase.process(input));
        System.out.println("reverse " + reverse.process(input));
        System.out.println("no space " + removespace.process(input));
    }
}
