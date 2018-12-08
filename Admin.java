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
public class Admin {
     double gpa=0;
     public void gpaCalculate(ArrayList<Course>clist,ArrayList<Student>slist)
    {
       
        double total_credit=0;
        for(Course c:clist)
        {
        total_credit=total_credit+c.getCredit();
        gpa=gpa+(c.getCredit()*c.getGrade());
        }
        gpa=gpa/total_credit;
        for(Student s:slist)
        {
            s.canShowResult(gpa);
        }
        
     }
     
     
}
