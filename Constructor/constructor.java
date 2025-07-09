package Constructor;



public class constructor {
    int id;
    String name;
    String adderss;
   constructor name(int id, String name, String adderss){
       this.id=id;
       this.name=name;
       this.adderss=adderss;
       return this;
   }
   void display(){
       System.out.println("id " + id + " name " + name);
   }
   void show(){
       System.out.println("adderss " +adderss);
   }
    public static void main(String[] asdf){
       new constructor().name(1,"aman" ,"nilkanthpur").display();
//       new Student().name("nilkanthpur").show();


    }
}
