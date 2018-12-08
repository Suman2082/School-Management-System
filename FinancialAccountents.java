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
public class FinancialAccountents {
    void preparePayment(ArrayList<LocalStudent>slist,ArrayList<ForeignStudent> flist){
       for(LocalStudent l:slist)
       {
           l.balance=l.getPaidable()-l.getPay();
           l.showBalance(l.balance);
       }
       for(ForeignStudent f:flist)
       {
       
            f.balance=f.getPaidable()-f.getPay();
           f.showBalance(f.balance);
           
       }
           
    }
}
