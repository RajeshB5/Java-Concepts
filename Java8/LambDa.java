interface A{
    void show(int i);
}

//class Xyz implements A{
//    public void show(int i){
//        System.out.println("Show "+i);
//    }
//}

public class LambDa {
    public static void main(String[] a){

        // Implementation using class
//     A obj = new Xyz();
//        obj.show(6);

        // Implementation using Anonymous inner class
//        A obj = new A() {
//            public void show(int i) {
//                System.out.println("Show "+i);
//            }
//        };
//        obj.show(6);

//        A obj = (int i) -> {
//            System.out.println("Show "+i);
//        };
//        A obj = (i) -> System.out.println("Show "+i); // if one line code
        A obj = i -> System.out.println("Show "+i); // if one parameter
        obj.show(6);
    }

}
