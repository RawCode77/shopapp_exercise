/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaseStudy1;

/**
 *
 * @author Utilisateur
 */
public class Department {

    private String name;
    private Employee[] employees = new Employee[10];

    private int lastAddedEmployeeIndex = -1;

    // employees [0 1 2 3 4 5 6 7 8 9]

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmp(Employee anEmployee) {
        /*

        */
        if (lastAddedEmployeeIndex < employees.length) {
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = anEmployee;
        }
    }



}
