package Arrays.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicOperation {
    public static void main(String[] as){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> language= new ArrayList<>();

        System.out.print("enter 3 language:-");
        for(int i=0;i<3;i++){
            String lang=sc.nextLine();
            language.add(lang);
        }
        System.out.print("list of language " + language + "\n");

        System.out.print("enter language to remove:-");
        String Remove=sc.nextLine();
        language.remove(Remove);
        System.out.print("after remove:- " + language + "\n");

        System.out.print("enter old laguage to update:-");
        String oldLang=sc.nextLine();
        int index=language.indexOf(oldLang);
        if(index!=-1){
                System.out.print("enter new language to replace:- ' " + oldLang + "':");
                String newLang=sc.nextLine();
                language.set(index,newLang);
        }else{
            System.out.print("language " + oldLang + " not found");
        }
        System.out.println("final list " + language);
    }

}
