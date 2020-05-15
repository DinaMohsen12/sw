/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangementsystem;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author dina
 */
public class Mangementsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int ch=1;
     String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path: " + projectPath);
        File currentDir = new File(projectPath); // current directory				
	checkDirectoryContents(currentDir);
       
        Scanner input = new Scanner(System.in);

    /* singel */
        Admin n= Admin.getInstance();
       
        String userName, Pass, Fname, Lname, Hours;
        int id, oldID, age, level;
        double salary, GPA;
        System.out.print("\n\nWelecome Admin ... !\n\nUser Name : ");
        userName = input.next();
        System.out.print("Password  : ");
        Pass = input.next();
        if (n.login(userName, Pass)) {

            while (ch != 0) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\n\t ________________________________\n\t"
                        + " Enter 1: Add New Student.       \n\t Enter 2: search student.    \n\t Enter 3:update student.        \n\t Enter 4: delete.               \n        "
                        + " Enter 5: Add New employee.      \n\t Enter 6: search employee.   \n\t Enter 7:update employee.       \n\t Enter 8: delete employee       \n        "
                        + " Enter 9: Add New teacher.       \n\t Enter 10: search teacher.   \n\t Enter 11:update teacher.        \n\t Enter 12 :delete teacher       \n       "
                          );
                ch = input.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter Student Info ... ");
                        System.out.print("Student First Name : ");
                        Fname = input.next();
                        System.out.print("Student Last Name : ");
                        Lname = input.next();
                        System.out.print("Student ID : ");
                        id = input.nextInt();
                        System.out.print("Student Age : ");
                        age = input.nextInt();
                        System.out.print("Student Level : ");
                        level = input.nextInt();
                        System.out.print("Student GPA : ");
                        GPA = input.nextDouble();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        Pass = input.next();
                        n.addNewStudent( level,GPA,  userName, Pass, id,  Fname,  Lname,age);
                        break;
                        
                        
                        case 2:
                        System.out.print("\nSearch for Student ...!\nEnter Student ID : ");
                        id = input.nextInt();
                        n.searchForStudent(id);
                        break;
                  
                    
                           case 3:
                        System.out.print("\nUpdate Student info ...!\nEnter Student OldID : ");
                        oldID = input.nextInt();
                        System.out.println("\nEnter Student New Info ... ");
                        System.out.print("Student First Name : ");
                        Fname = input.next();
                        System.out.print("Student Last Name : ");
                        Lname = input.next();
                        System.out.print("Student ID : ");
                        id = input.nextInt();
                        System.out.print("Student Age : ");
                        age = input.nextInt();
                        System.out.print("Student Level : ");
                        level = input.nextInt();
                        System.out.print("Student GPA : ");
                        GPA = input.nextDouble();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        Pass = input.next();
                        Student x = new Student(level,GPA,  userName, Pass, id,  Fname,  Lname,age);

                        n.updateStudent(oldID, x);
                        break;
                            case 4:
                        System.out.print("\nDelete Student info ...!\nEnter Student ID : ");
                        id = input.nextInt();
                        n.deleteStudent(id);
                        break;
/*-----------------------------*/

                            case 5:
                        System.out.println("Enter Emp Info ... ");
                        System.out.print("Emp First Name : ");
                        Fname = input.next();
                        System.out.print("Emp Last Name : ");
                        Lname = input.next();
                        System.out.print("Emp ID : ");
                        id = input.nextInt();
                        System.out.print("Emp Age : ");
                        age = input.nextInt();
                        System.out.print("Emp Salary : ");
                        salary = input.nextDouble();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        Pass = input.next();
                        
                       n.addNewEmp(userName, Pass, id, Fname, Lname, age, salary);
                        break;
                    case 6:
                        System.out.print("\nSearch for Emp ...!\nEnter Emp ID : ");
                        id = input.nextInt();
                        n.searchForEmp(id);
                        break;
                   
                  case 7:
                        System.out.print("\nUpdate employee info ...!\nEnter employee OldID : ");
                       oldID = input.nextInt();
                        System.out.println("\nEnter employee New Info ... ");
                        System.out.print("employee First Name : ");
                        Fname = input.next();
                        System.out.print("employee Last Name : ");
                        Lname = input.next();
                        System.out.print("employee ID : ");
                        id = input.nextInt();
                        System.out.print("employee Age : ");
                        age = input.nextInt();
                        System.out.print("employee Salary : ");
                        salary = input.nextDouble();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        Pass = input.next();
                         Employee z = new Employee(userName, Pass, id, Fname, Lname, age, salary);
                        n.updateEmp(oldID, z);
                        break;
                   
                    case 8:
                     System.out.print("\nDelete employee info ...!\nEnter employee ID : ");
                        id = input.nextInt();
                        n.deleteEmp(id);
                        break;

                   /*********************************************/
                      case 9:
                        System.out.println("Enter teacher Info ... ");
                        System.out.print("teacher First Name : ");
                        Fname = input.next();
                        System.out.print("teacher Last Name : ");
                        Lname = input.next();
                        System.out.print("teacher ID : ");
                        id = input.nextInt();
                        System.out.print("teacher Age : ");
                        age = input.nextInt();
                        System.out.print("teacher Salary : ");
                        salary = input.nextDouble();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        Pass = input.next();
                        System.out.print("academicHours : ");
                        Hours = input.next();
                       n.addNewT(Hours,  salary,  userName,  Pass,  id,  Fname,  Lname,  age);
                        break;
                   case 10:
                        System.out.print("\nSearch for Emp ...!\nEnter Emp ID : ");
                        id = input.nextInt();
                        n.searchForT(id);
                        break;
                   
                  case 11:
                          System.out.print("\nUpdate teacher info ...!\nEnter employee OldID : ");
                       oldID = input.nextInt();
                        System.out.println("\nEnter teacher New Info ... ");
                        System.out.print("teacher First Name : ");
                        Fname = input.next();
                        System.out.print("teacher Last Name : ");
                        Lname = input.next();
                        System.out.print("teacher ID : ");
                        id = input.nextInt();
                        System.out.print("teacher Age : ");
                        age = input.nextInt();
                        System.out.print("teacher Salary : ");
                        salary = input.nextDouble();
                        System.out.print("Username : ");
                        userName = input.next();
                        System.out.print("Password : ");
                        Pass = input.next();
                        System.out.print("academicHours : ");
                        Hours = input.next();
                       teatcher t=new teatcher(Hours,  salary,  userName,  Pass,  id,  Fname,  Lname,  age);
                        n.updateTA(oldID, t);
                        break;
                    case 12:
                     System.out.print("\nDelete teacher info ...!\nEnter employee ID : ");
                        id = input.nextInt();
                        n.deleteEmp(id);
                        break;
                        
                     case 13:
                        n.displayStudents();
                        break;
                    default:
                        System.out.println("Enter vaild Option :(");

                }
                /* end of switvh*/
                
            }
            /*end of while */
            
        }
        
/*ShapMarker shap=new ShapMarker();
Staff s1=shap.getstaff("Employee");
s1.display();*/
    }

    public static void checkDirectoryContents(File dir){
        File[] files = dir.listFiles();
        boolean studentFile = true;
   
        boolean TAFile = true;
        boolean EmpFile = true;
      

        for (File file : files) {

            if (file.getName().contains("Students.bin")) {
                studentFile = false;
            } else if (file.getName().contains("TA.bin")) {
                TAFile = false;
            } else if (file.getName().contains("Employee.bin")) {
                EmpFile = false;
            } 
        }
        if (studentFile) {
            Student x = new Student();
            x.commitToFile();
        } 
        
      
        if (TAFile) {
            teatcher x = new teatcher();
            x.commitToFile();
        } 
        
        if (EmpFile) {
            Employee x = new Employee();
            x.commitToFile();
        } 
        
       
    }
    
}
