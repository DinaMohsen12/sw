/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangementsystem;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author dina
 */
public class Employee extends Person implements Serializable ,Staff  {
    private final String EmpFileName = "Employee.bin";
private double salary;
    public static ArrayList<Employee> Employees = new ArrayList<Employee>();

    public Employee() {
    }

    public Employee(String user, String pass, int id, String fname, String lname, int age, double salary) {
        super(user, pass, id, fname, lname, age);
    }
    
/* templet design pattern*/

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String display() {
        loadFromFile();
        String S = "\nAll Employee Data:\n";
        for (Employee x : Employees) {
            S = S + x.toString();
        }
        return S;
    }
    
    /* add*/
     public boolean addEmp() {
        loadFromFile();
        Employees.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(EmpFileName, Employees);
    }

    public void loadFromFile() {
        Employees = (ArrayList<Employee>) FManger.read(EmpFileName);
    }

    private int getEmpIndex(int id) {
        for (int i = 0; i < Employees.size(); i++) {
            if (Employees.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }
    /* udate*/
    public boolean updateEmp(int oldID, Employee x) {
        loadFromFile();
        int index = getEmpIndex(oldID);

        if (index != -1) {
            Employees.set(index, x);

            return commitToFile();
        }

        return false;
    }
/*delet */
    public boolean deleteEmp(int id) {
        loadFromFile();
        int index = getEmpIndex(id);

        if (index != -1) {
            Employees.remove(index);

            return commitToFile();
        }

        return false;
    }
    /*search */
     public String searchEmp(int id) {
        loadFromFile();
        int index = getEmpIndex(id);
        if (index != -1) {
            return "\nFound ...!" + Employees.get(index).toString();
        } else {
            return "\nNot Found ...!";
        }
    }
 @Override
    public String toString() {
        return "\nI'm  Emp : " + fname + " " + lname + "\n" + "ID : " + id + " Age : " + age + " Salary : " + salary  + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }

    
}
