package Level1.exercise1;

public class Main {

    public static void main(String[] args) {

        NoGenericMethods elements = new NoGenericMethods(
                "Third",
                "First",
                "Second"
        );

        System.out.println("Element 1: " + elements.getElement1());
        System.out.println("Element 2: " + elements.getElement2());
        System.out.println("Element 3: " + elements.getElement3());
    }
}