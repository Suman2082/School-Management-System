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
public class ForeignAdmin extends Admin{
    void canShowTeacherInfo(ArrayList<SeniorTeacher>slist)
    {
        for(SeniorTeacher s:slist)
        {
            System.out.println(s);
        }
    }
            
}
