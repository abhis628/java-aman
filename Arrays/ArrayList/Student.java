package Arrays.ArrayList;

public class Student {

    String name;
    int id;
    Student (String name,int id){
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.print("name " + name + " id" + id);
    }
    public static void main(String[] as){
        Student[] s=new Student[2];
        s[0]=new Student("aman",1);
        s[1]=new Student("abhi",2);
        for(Student sc:s){
            sc.display();
        }
    }
}
