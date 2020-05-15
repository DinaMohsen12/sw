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
public class ShapMarker {
    public Staff getstaff(String shaptype){
     
     if(shaptype ==null){return null;}
     else if(shaptype.equalsIgnoreCase("teatcher")){
     return new teatcher();}
     else if(shaptype.equalsIgnoreCase("Employee")){
     return new Employee();
     }else if(shaptype.equalsIgnoreCase("Student")){
     return new Student();
     }
     return null;
 }
}
