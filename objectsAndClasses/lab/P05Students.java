package objectsAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;
        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public String getTown(){
            return this.town;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")){
            String[] studentDataArr = inputLine.split("\\s+");
            String firstName = studentDataArr[0];
            String lastName = studentDataArr[1];
            int age = Integer.parseInt(studentDataArr[2]);
            String town = studentDataArr[3];

            Student currentStudent = new Student(firstName, lastName, age, town);
            studentsList.add(currentStudent);

            inputLine = scanner.nextLine();
        }
        String homeTown = scanner.nextLine();

        for (Student item : studentsList) {
            if (item.getTown().equals(homeTown)) {
                System.out.printf("%s %s is %d years old%n",item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }
}
