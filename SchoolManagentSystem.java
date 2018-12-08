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
public class SchoolManagentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Course c=new Course("23","phy",3,3.5);
       ArrayList<Course>clist=new ArrayList<>();
       clist.add(c);
       LocalStudent s=new LocalStudent("dkfj","suman","34", "molla bari");
       ArrayList<LocalStudent>slist=new ArrayList<>();
        s.courseAssgin(clist);
       ForeignStudent f=new ForeignStudent("434","djf", "34", "ere");
       ArrayList<ForeignStudent>flist=new ArrayList<>();
       f.courseAssgin(clist);
       SeniorTeacher t=new SeniorTeacher("PRINCE","43");
       t.courseAssign(clist);
       t.givesMark(slist);
       JuniorTeacher j=new JuniorTeacher("SAYEEF","34");
     
      
       
       
       
       
    }
    
}
