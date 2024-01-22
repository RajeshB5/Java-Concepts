package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ImpConsumer implements Consumer<Integer>{
    public void accept(Integer i){
        System.out.print(i);
    }
}
public class ConsumerInterface {

    public static void main(String[] a){
        List<Integer> data = Arrays.asList(1,5,2,8,6,7);

        //Using Concrete class
        System.out.println("Using Concrete class");
        Consumer<Integer> c = new ImpConsumer();
        data.forEach(c);

        //Using Anonymous inner class
        System.out.println("\n\nUsing Anonymous inner class");
        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        };
        data.forEach(con);

        //Using Lambda
        System.out.println("\n\nUsing Lambda");
        Consumer<Integer> lam = i -> System.out.print(i);
        data.forEach(lam);

        //Using foreach
        System.out.println("\n\nUsing foreach");
        data.forEach(i -> System.out.print(i));

    }

}
