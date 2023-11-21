package arraysPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Students {
    String firstName;
    String lastName;
    double grade;

    public Students(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + String.format("%.2f",grade);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
    int n = Integer.parseInt(inp.nextLine());
    double maxGrade=Double.MIN_VALUE;
        List<Students> listStudents=new ArrayList<Students>();
        for(int i=0;i<n;i++){
        String studentInfo = inp.nextLine();
        String[]studentStringArr=studentInfo.split(" ");
        Students student = new Students(studentStringArr[0],studentStringArr[1],Double.parseDouble(studentStringArr[2]));
listStudents.add(student);
    }
        while(!listStudents.isEmpty()) {
            for (Students student : listStudents) {
                if (student.getGrade() > maxGrade) maxGrade = student.getGrade();
            }
            Iterator<Students> iterator = listStudents.iterator();

            while (iterator.hasNext()) {
                Students student = iterator.next();
                if (student.getGrade() == maxGrade) {
                    System.out.println(student.toString());
                    iterator.remove();
                    maxGrade=Double.MIN_VALUE;
                    break;
                }
            }
        }

    }
}
