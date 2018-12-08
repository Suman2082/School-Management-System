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
public class JuniorTeacher extends Teacher implements Attendence{

    public JuniorTeacher(String name,String id) {
        super(name,id);
    }
    @Override
    
    public void givesMark(ArrayList<LocalStudent>slist)
    {
        
        for(LocalStudent s:slist)
        {
            for(Course c:s.a)
            {
                c.mark=80;
            }
        }
    }
     public void givesMarkforForeign(ArrayList<ForeignStudent>flist)
    {
        for(ForeignStudent s:flist)
        {
            for(Course c:s.a)
            {
                c.mark=80;
            }
        }
    }
      public void can_calculate_attendence_percentage()
  {
      s_attendence=(getNumber_of_student_absent()/getTotal_days_of_attendence()*100);
  }
   
}
