package ud0_presentation;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        boolean continueLoop = true;
        StudentRegistry dam2 = new StudentRegistry();

        while(continueLoop){

            // Print the menu
            System.out.println("Menu: ");
            System.out.println("1. Add student");
            System.out.println("2. Show students");
            System.out.println("3. Exit");
            System.out.println("Type an option: ");

            // Gather information from user
            Scanner scanner = new Scanner(System.in);
            int userOption = scanner.nextInt();

            switch (userOption){
                case 1:
                    System.out.println("Name: ");
                    String userName = scanner.next();
                    System.out.println("Age: ");
                    int userAge = scanner.nextInt();
                    System.out.println("ID: ");
                    String userId = scanner.next();
                    dam2.addStudent(new Student(userName, userAge, userId));
                    break;
                case 2:
                    dam2.showStudents();
                    break;
                case 3:
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Incorrect option");
            }


        }

     /*

        // First way to add a student
        ud0_presentation.Student s1 = new ud0_presentation.Student("Julian Perez", 19, "s1");
        dam2.addStudent(s1);
        // Alternative way to add a student (anonymous class)
        dam2.addStudent(new ud0_presentation.Student("Andres Miel", 20, "s2"));

        dam2.showStudents();*/
    }
}