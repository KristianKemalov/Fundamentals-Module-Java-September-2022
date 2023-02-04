package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
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

        public String getTown() {
            return this.town;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        List<Student> studentList=new ArrayList<>();

        while (!inputLine.equals("end")) {
            String[] arrStudentData=inputLine.split(" ");
            String firstName=arrStudentData[0];
            String lastName=arrStudentData[1];
            int age=Integer.parseInt(arrStudentData[2]);
            String town=arrStudentData[3];

            Student currentStudent=new Student(firstName,lastName,age,town);
            studentList.add(currentStudent);

            inputLine = sc.nextLine();
        }

        String homeTown = sc.nextLine();

        for (Student item:studentList) {
            if (item.getTown().equals(homeTown)){
                System.out.printf("%s %s is %d years old%n",item.getFirstName(),item.getLastName(),item.getAge());
            }

        }
    }
}
