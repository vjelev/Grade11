package arraysPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<Person> peopleList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            String[] people = input.split(" ");
            Person person = new Person(people[0], Integer.parseInt(people[1]));
            peopleList.add(person);

        }
        for (Person person : peopleList) {
            if (person.getAge() > 30) System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
