package generics;

public class GenericMethods {
    public static <T, U, V> void printElements(T element1, U element2, V element3) {

        System.out.println(element1);
        System.out.println(element2);
        System.out.println(element3);
    }
}
