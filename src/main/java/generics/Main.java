package generics;

public class Main {

    public static void main(String[] args) {

        NoGenericMethods object =
                new NoGenericMethods("Tres", "Uno", "Dos");

        System.out.println(object.getElement1());
        System.out.println(object.getElement2());
        System.out.println(object.getElement3());
    }
}