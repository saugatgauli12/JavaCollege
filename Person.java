import java.util.Scanner;

public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Mainy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person[] a = new Person[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Age: ");
            int age = scan.nextInt();
            System.out.print("Gender: ");
            String gender = scan.next();

            a[i] = new Person(name, age, gender);
        }

        System.out.println("Information of all persons:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Name: " + a[i].name);
            System.out.println("Age: " + a[i].age);
            System.out.println("Gender: " + a[i].gender);
            System.out.println();
        }
    }
}