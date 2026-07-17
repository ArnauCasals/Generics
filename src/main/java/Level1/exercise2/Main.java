package Level1.exercise2;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Arnau", "Casals", 33);

        GenericMethods.printElements(person, "Hola", 25);

        GenericMethods.printElements("Java", 100, person);

        GenericMethods.printElements(3.14, person, "Generics");
    }
}