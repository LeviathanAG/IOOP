/*Define a class EMPLOYEE having following members: Ename, Eid, Basic, DA, 
Gross_Sal, Net_Sal and following methods: 
a. read(): to read N employee details 
b. display(): to display employee details 
c. compute_net_sal(): to compute net salary 
Write a Java program to read data of N employee and compute and display net salary 
of each employee Note: (DA = 52% of Basic, gross_Sal = Basic + DA; IT = 30% of 
the gross salary)  */

import java.util.Scanner;

public class wrp2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        EMPLOYEE e[] = new EMPLOYEE[n];
        for (int i = 0; i < n; i++) {
            e[i] = new EMPLOYEE();
            e[i].read();
        }
        for (int i = 0; i < n; i++) {
            e[i].display();
            e[i].compute_net_sal();
        }
        sc.close();
    }

}

class EMPLOYEE {
    String Ename;
    int Eid;
    float Basic, DA, Gross_Sal, Net_Sal;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee: ");
        Ename = sc.nextLine();
        System.out.println("Enter the ID of the employee: ");
        Eid = sc.nextInt();
        System.out.println("Enter the basic salary of the employee: ");
        Basic = sc.nextFloat();
        sc.close();
    }

    void display() {
        System.out.println("Name: " + Ename);
        System.out.println("ID: " + Eid);
        System.out.println("Basic Salary: " + Basic);
    }

    void compute_net_sal() {
        DA = (float) (0.52 * Basic);
        Gross_Sal = Basic + DA;
        Net_Sal = Gross_Sal - (float) (0.3 * Gross_Sal);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }
}