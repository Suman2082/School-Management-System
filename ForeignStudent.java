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
public class ForeignStudent extends Student{

    public ForeignStudent(String id, String name, String phonenumber,String address) {
        super(id, name, phonenumber, address);
    }
    void showBalance(double balance)
    {
        System.out.println(balance);
    }
    
}
