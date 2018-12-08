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
public class SeniorTeacher extends Teacher implements Attendence{

    public SeniorTeacher(String name,String id) {
        super(name,id);
    }
    @Override
     public void givesMark(ArrayList<LocalStudent>slist)
    {
        
        for(Student s:slist)
        {
            for(Course c:s.a)
            {
                if(c.c_id=="171-35-1923")
                {
                c.mark=80;
                }
            }
        }
    }
     void showForeignStudentInfo(ArrayList<ForeignStudent>flist)
     {
         for(ForeignStudent f:flist)
         {
             System.out.println(f);
         }
     }
  public void can_calculate_attendence_percentage()
  {
      s_attendence=(getNumber_of_student_absent()/getTotal_days_of_attendence()*100);
  }
     
    
}
