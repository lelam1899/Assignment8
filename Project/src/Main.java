import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();

        do {
            System.out.println("----------Menu----------");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Sort Student by Gpa");
            System.out.println("5. Sort Student by Name");
            System.out.println("6. Show all Student");
            System.out.println("------------------------");

            Scanner scanner = new Scanner(System.in);

            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1: {
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Address: ");
                    String add = scanner.nextLine();
                    System.out.println("Gpa: ");
                    float gpa = scanner.nextFloat();
                    manageStudent.addStudent(new Student(manageStudent.listStudent.size()+ 1, name, age, add, gpa));
                    break;

                }
                case 2: {
                    System.out.println("Input ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Address: ");
                    String add = scanner.nextLine();
                    System.out.println("Gpa: ");
                    float gpa = scanner.nextFloat();
                    manageStudent.editStudentById(id, new Student(id, name, age, add, gpa));
                    break;
                }
                case 3: {
                    System.out.println("Input ID: ");
                    int id = scanner.nextInt();
                    manageStudent.deleteStudent(id);
                    break;
                }
                case 4: {
                    manageStudent.sortStudentByGpa();
                    System.out.println("Students List is sorted by GPA ");
                    break;
                }
                case 5: {
                    manageStudent.sortStudentByName();
                    System.out.println("Students list is sorted by Name");
                    break;
                }
                case 6: {
                    manageStudent.showAllStudent();
                    break;
                }
                case 7: {
                    return;
                }
            }

        } while(true);



    }
}
