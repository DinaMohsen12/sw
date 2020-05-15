/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangementsystem;

/**
 *
 * @author dina
 */
public class Admin extends Person {
  private static Admin A=new Admin();
   

    public Admin(String user, String pass, int id, String fname, String lname, int age) {
        super(user, pass, id, fname, lname, age);
    }  
    /* singeltoon*/
    private Admin(){}

   //Get the only object available
   public static Admin getInstance(){
      return A;
   }
   /* ------------------*/
    public boolean login(String userName, String Pass) {
        if (userName.equals("Admin") && Pass.equals("123")) {
            return true;
        }
        return false;
    }

       @Override
    public String toString() {
        return "I'm Manager : " + fname + " " + lname + "\n" + "ID : " + id + " Age : " + age + "\n"  + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }
    /* for student -------------------------------------*/
    
   
    public void addNewStudent(int level, double GPA, String user, String pass, int id, String fname, String lname, int age) {
        Student x = new Student(  level,  GPA,  user,  pass,  id,  fname,  lname,  age);
        if (x.addStudent()) {
            System.out.println(x.toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }

 

    public void searchForStudent(int id) {
        Student x = new Student();
        System.out.println(x.searchStudent(id));
    }

    public void updateStudent(int oldID, Student newStudentValues) {
        Student x = new Student();
        if (x.updateStudent(oldID, newStudentValues)) {
            System.out.println(newStudentValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void deleteStudent(int Id) {
        Student x = new Student();
        if (x.deleteStudent(Id)) {
           System.out.println("Student: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }
    /* emplyee ------------------------------------*/

  public void addNewEmp(String user, String pass, int id, String fname, String lname, int age, double salary) {
        Employee x = new Employee(user, pass, id, fname, lname, age, salary);
        if (x.addEmp()) {
            System.out.println(x.toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }


    public void searchForEmp(int id) {
        Employee x = new Employee();
        System.out.println(x.searchEmp(id));
    }

    public void updateEmp(int oldID, Employee newEmpValues) {
        Employee x = new Employee();
        if (x.updateEmp(oldID, newEmpValues)) {
            System.out.println(newEmpValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void deleteEmp(int Id) {
        Employee x = new Employee();
        if (x.deleteEmp(Id)) {
            System.out.println("Emp: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }
    /* teacher-------------------------------------- */
   public void addNewT (String academicHours, double salary, String user, String pass, int id, String fname, String lname, int age) {
        teatcher x = new teatcher(academicHours, salary, user,  pass, id,  fname,  lname,age);
        if (x.addT()) {
            System.out.println(x.toString() + "Added Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }

   /* public void displayTAs() {
        teatcher x = new teatcher();
        System.out.println(x.displayAllTAs());
    }
*/
    public void searchForT(int id) {
        teatcher x = new teatcher();
        System.out.println(x.searcht(id));
    }

    public void updateTA(int oldID, teatcher newTAValues) {
        teatcher x = new teatcher();
        if (x.updateT(oldID, newTAValues)) {
            System.out.println(newTAValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }

    }

       public void displayStudents() {
        Student x = new Student();
        System.out.println(x.displayAllStudents());
    }
}
