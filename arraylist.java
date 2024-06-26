
package javaproject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;


public class arraylist {
    
    
    public static void main(String[] args) {
        
    Date date=new Date();
    
DateFormat dateformat=new SimpleDateFormat("dd/MM/YYYY");     

String currentdate=dateformat.format(date);

        System.out.println(""+currentdate);


    }
    
}
