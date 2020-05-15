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
public class teatcher extends Person implements Serializable ,Staff {
 private String academicHours;
 private double salary;

    private final String TAFileName = "TA.bin";

    public static ArrayList<teatcher> TAs = new ArrayList<teatcher>();    

    public teatcher() {
    }

    public teatcher(String academicHours, double salary, String user, String pass, int id, String fname, String lname, int age) {
        super(user, pass, id, fname, lname, age);
        this.academicHours = academicHours;
        this.salary = salary;
    }

  

    public String getAcademicHours() {
        return academicHours;
    }

    public double getSalary() {
        return salary;
    }

    public void setAcademicHours(String academicHours) {
        this.academicHours = academicHours;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
 public String display() {
        loadFromFile();
        String S = "\nAll teatcher Data:\n";
        for (teatcher x : TAs) {
            S = S + x.toString();
        }
        return S;
    }
    
/* templet design pattern */
    @Override
    public String toString() {
        return "teatcher{" + "academicHours=" + academicHours + ", TAFileName=" + TAFileName + '}';
    }

     public boolean commitToFile() {
        return FManger.write(TAFileName, TAs);
    }

    public void loadFromFile() {
        TAs = (ArrayList<teatcher>) FManger.read(TAFileName);
    }
    /* Add */
    public boolean addT() {
        loadFromFile();
        TAs.add(this);
        return commitToFile();
    }
    /* index */
     private int getTAIndex(int id) {
        for (int i = 0; i < TAs.size(); i++) {
            if (TAs.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }
    /*update*/
     public boolean updateT(int oldID, teatcher x) {
        loadFromFile();
        int index = getTAIndex(oldID);

        if (index != -1) {
            TAs.set(index, x);

            return commitToFile();
        }

        return false;
    }
     /*delet*/
     public boolean deleteT(int id) {
        loadFromFile();
        int index = getTAIndex(id);

        if (index != -1) {
            TAs.remove(index);

            return commitToFile();
        }

        return false;
    }
/*search*/
       public String searcht(int id) {
        loadFromFile();
        int index = getTAIndex(id);
        if (index != -1) {
            return "\nFound ...!" + TAs.get(index).toString();
        } else {
            return "\nNot Found ...!";
        }
    }
    
}
