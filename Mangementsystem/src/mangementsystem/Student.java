/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangementsystem;

import java.io.Serializable;
import java.util.ArrayList;

public class Student extends Person implements Serializable  ,Staff {
     private int level;
    private double GPA;

    private final String studentFileName = "Students.bin";

    public static ArrayList<Student> Students = new ArrayList<Student>();

    public Student() {
    }

    public Student(int level, double GPA, String user, String pass, int id, String fname, String lname, int age) {
        super(user, pass, id, fname, lname, age);
        this.level = level;
        this.GPA = GPA;
    }

    public int getLevel() {
        return level;
    }

    public double getGPA() {
        return GPA;
    }

    

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

   
   
    @Override
    public String toString() {
        return "\nI'm Eng : " + fname + " " + lname + "\n" + "ID : " + id + " Age : " + age + "\n"
                + "Level : " + level + " GPA : " + GPA + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }
     public String display() {
        loadFromFile();
        String S = "\nAll Student Data:\n";
        for (Student x : Students) {
            S = S + x.toString();
        }
        return S;
    }
    
  public boolean addStudent() {
        loadFromFile();
        Students.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(studentFileName, Students);
    }

    public void loadFromFile() {
        Students = (ArrayList<Student>) FManger.read(studentFileName);
    }

    private int getStudentIndex(int id) {
        for (int i = 0; i < Students.size(); i++) {
            if (Students.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }

    public String displayAllStudents() {
        loadFromFile();
        String S = "\nAll Student Data:\n";
        for (Student x : Students) {
            S = S + x.toString();
        }
        return S;
    }

    public String searchStudent(int id) {
        loadFromFile();
        int index = getStudentIndex(id);
        if (index != -1) {
            return "\nFound ...!" + Students.get(index).toString();
        } else {
            return "\nNot Found ...!";
        }
    }

    public boolean updateStudent(int oldID, Student x) {
        loadFromFile();
        int index = getStudentIndex(oldID);

        if (index != -1) {
            Students.set(index, x);

            return commitToFile();
        }

        return false;
    }
 

    public boolean deleteStudent(int id) {
        loadFromFile();
        int index = getStudentIndex(id);

        if (index != -1) {
            Students.remove(index);

            return commitToFile();
        }

        return false;
    }
}
