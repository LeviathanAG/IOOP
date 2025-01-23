/*Define a class Mixer to merge two sorted integer arrays in ascending order with 
OOP LAB MANUAL 
the following instance variables and methods: 
instance variables: 
int arr[] 
//to store the elements of an array 
Methods: 
void accept() 
// to accept the elements of the array in ascending order 
without any duplicates 
Mixer mix(Mixer A) // to merge the current object array elements with the 
parameterized array elements and return the resultant object 
void display() 
// to display the elements of the 
array Define the main() method to test the class.  */

import java.util.Scanner;

public class wrp3 {
    
    public static void main(String[] args) {
        Mixer m1 = new Mixer();
        Mixer m2 = new Mixer();
        m1.accept();
        m2.accept();
        Mixer m3 = m1.mix(m2);
        m3.display();
    }

}

class Mixer {
    int arr[] = new int[10];

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    Mixer mix(Mixer A) {
        Mixer m = new Mixer();
        int i = 0, j = 0, k = 0;
        while (i < 10 && j < 10) {
            if (arr[i] < A.arr[j]) {
                m.arr[k] = arr[i];
                i++;
            } else {
                m.arr[k] = A.arr[j];
                j++;
            }
            k++;
        }
        while (i < 10) {
            m.arr[k] = arr[i];
            i++;
            k++;
        }
        while (j < 10) {
            m.arr[k] = A.arr[j];
            j++;
            k++;
        }
        return m;
    }

    void display() {
        System.out.println("Merged array: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(arr[i]);
        }
    }
}