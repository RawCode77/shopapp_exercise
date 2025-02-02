/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaseStudy1;

/**
 *
 * @author Utilisateur
 */
public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        return "Employee:" + getId() + " " + getName() + " " + getSalary() + " " ;
//    }

//    @Override
//    public String toString() {
//        return "Employee{" + "id=" + getId() + ", name=" + getName() + ", salary=" + getSalary() + '}';
//    }

   @Override
    public String toString() {
        return "Employee:" + "id=" + getId() + ", name=" + getName() + ", salary=" + getSalary();
    }



}
