/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagentsystem;

import java.util.ArrayList;

/**
 *
 * @author HuLu-Lu
 */
public abstract class Teacher {
    String name;
    String id;
    double s_attendence;
   private int number_of_student_absent;
  private  int total_days_of_attendence;

    public int getNumber_of_student_absent() {
        return number_of_student_absent;
    }

    public int getTotal_days_of_attendence() {
        return total_days_of_attendence;
    }
ArrayList<Course>c;
    public Teacher(String name, String id) {
        this.name = name;
        this.id = id;
    }
    void courseAssign(ArrayList<Course>clist)
    {
        c=clist;
    }
    public abstract void givesMark(ArrayList<LocalStudent>slist);
    void canShowStudentInfo(ArrayList<LocalStudent>slist)
     {
     for(Student s: slist)
     {
     System.out.println(s);
     }
 }
 
            
    
}
