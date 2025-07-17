package Interface;

public interface Operation {
    int operation(int a,int b);
}
class Add implements Operation{

    public int operation(int a, int b){
        int add=a+b;
        return add;
    }
}
class Subtract implements Operation{

    public int operation(int a,int b){
        int sub=a-b;
        return sub;
    }
}
class Multiply implements Operation{

    public int operation(int a,int b){
        int multi=a*b;
        return multi;
    }
}
class Divide implements Operation{

    public int operation(int a,int b){
        int div=a/b;
        return div;
    }
}
class arithmetic{
    public static void main(String[] as){
        int a=10;int b=5;

        Add s=new Add();
        Subtract s1=new Subtract();
        Multiply s2=new Multiply();
        Divide s3=new Divide();
        System.out.println("add " + s.operation(a,b));
        System.out.println("subtract " + s1.operation(a,b));
        System.out.println("multiply " + s2.operation(a,b));
        System.out.println("divide " + s3.operation(a,b));

    }
}