public class Swap {
//    int a;
//    int b;
    String swap(int a,int b){
     int temp=a;
     a=b;
     b=temp;
     return "swap" + a +" swap " + b;
    }
    public static void main(String[] agrs){
        Swap s1=new Swap();
        int a=12;
        int b=15;
      String result= s1.swap(a,b);
     System.out.printf("swapped " + result);
    }
}
