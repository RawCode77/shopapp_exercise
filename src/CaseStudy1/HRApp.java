/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaseStudy1;

/**
 *
 * Design and code a basic set of APIs to support basic requirements like creating and managing collections of objects used by other programs.
 */
public class HRApp {

    public static void main(String[] args) {
        System.out.println("HRApp Starts");

        Employee e1 = new Employee(230, "Jerry Springer", 333998);
        Employee e2 = new Employee(420, "Grace Jones", 3392823);

        System.out.println("Emp " + e1);
        System.out.println("Emp " + e2);
    }

}
