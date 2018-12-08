
package schoolmanagentsystem;

import java.util.ArrayList;
public class Student {
    String id;
    String name;
    String phonenumber;
    String address;
  private  double paidable;
  private  double pay;
    double balance=0;

    public double getPaidable() {
        return paidable;
    }

    public double getPay() {
        return pay;
    }
    ArrayList<Course>a;
public Student(String id, String name, String phonenumber,String address){
    this.id = id;
    this.name = name;
    this.phonenumber = phonenumber;
    this.address = address;
}
void balance_info(double paidable,double pay)
{
    this.paidable=paidable;
    this.pay=pay;
}
        
void courseAssgin(ArrayList<Course>clist)
{
    a=clist;
}
void canShowResult(double gpa)
{
    System.out.println("gpa is"+gpa);
}
 


}


