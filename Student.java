public class Student {
    int id;
    String name;
    Student(int id,String name) {
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "Student{id=" + id + ",name='" + name + "'}";
    }

    public static void main(String[] asdf){
        Student s1=new Student(1,"aman");
        Student s2=new Student(2,"komal");
        System.out.println(s1);
        System.out.println(s2);
    }
}
