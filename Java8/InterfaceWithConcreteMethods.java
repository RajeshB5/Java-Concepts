package Java8;

//In java8 we can use concrete methods in interface using default and static methods but it will create
//multiple inheritance problem so be carefull about it
interface I{
    public abstract void a();
    public default void b(){
        System.out.println("Interface default method b()");
    }
    public static void c(){
        System.out.println("Interface static method c()");
    }
}

class test implements I{
    @Override
    public void a() {
        System.out.println("test abstract method a()");
    }
}
public class InterfaceWithConcreteMethods{

    public static void main(String[] arg){
        I.c();

        I testData = new test();
        testData.b();
        testData.a();

    }

}
