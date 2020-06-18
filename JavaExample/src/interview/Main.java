package interview;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Person person = new Person("1", "Duong", new Person("3", "Nam", new Person("4", "Tuấn", new Person("5", "Quân", null))));
        System.out.println(person.getPerson().getPerson().getName());

        while (true){
            String id = scanner.nextLine();
            String name = scanner.nextLine();
            Person person1 = new Person(id, name, null);
        }
    }

    static Person input(){
        String id = scanner.nextLine();
        String name = scanner.nextLine();
        Person person = new Person(id, name, input());
        return person;
    }

}
