
package javaproject;

import java.util.Arrays;



public class prepost {
    
    public static void main (String [] args){
        
        int[]originalArrays={1,2,3,5,6};
        
        int elementtoinsert=4;
        int position=3;
        
        int[]newArray=new int[originalArrays.length+1];
        
        for(int i=0;i<position;i++){
            newArray[i]=originalArrays[i]
                    ;
        }
        newArray[position]=elementtoinsert;
        
        for(int i=position;i<originalArrays.length;i++){
             newArray[i+1]=originalArrays[i];
        }
  
        System.out.println("After insertation"+ Arrays.toString(newArray));
    
    } 
    
}
