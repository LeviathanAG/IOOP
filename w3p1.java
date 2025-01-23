/* Define a Class STUDENT having following 
Members: sname, marks_array, total, avg and provide the following methods: 
a. assign(): to assign initial values to the STUDENT object 
b. display(): to display the STUDENT object 
c. compute(): to Compute Total, Average marks 
Write a Java program Illustrating Class Declarations, Definition, and Accessing Class 
Members to test the class defined. */

import java.util.Scanner;

public class w3p1 {
    
    public static void main(String[] args) {
        STUDENT s = new STUDENT();
        s.assign();
        s.display();
        s.compute();
    }

}

class STUDENT {
    String sname;
    int marks_array[] = new int[5];
    int total;
    float avg;

    void assign() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        sname = sc.nextLine();
        System.out.println("Enter the marks of the student: ");
        for (int i = 0; i < 5; i++) {
            marks_array[i] = sc.nextInt();
        }
        sc.close();
    }

    void display() {
        System.out.println("Name: " + sname);
        System.out.println("Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(marks_array[i]);
        }
    }

    void compute() {
        total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks_array[i];
        }
        avg = total / 5;
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}