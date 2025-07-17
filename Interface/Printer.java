package Interface;

public interface Printer {
    void print();

}

 interface scanner{
    void scan();
}
class MultiFucationDevice implements Printer,scanner{
    public void print(){
        System.out.println("printing doucoment");
    }
    public void scan(){
        System.out.println("scanning document");
    }
}
class Multiple{
   public static void main(String[] as){
       MultiFucationDevice s=new MultiFucationDevice();
       s.print();
       s.scan();
   }
}