package generics;

public class Main {

    public static void main(String[] args) {

        NoGenericMethods object = new NoGenericMethods("Tres", "Uno", "Dos");

        System.out.println(object.getElement1());
        System.out.println(object.getElement2());
        System.out.println(object.getElement3());

        Person person = new Person("Arnau", "Casals", 33);

        GenericMethods.printElements(person, "Hola", 25);

        GenericMethods.printElements("Java", 100, person);

        GenericMethods.printElements(3.14, person, "Generics");
    }
}