
package javaproject;

import java.util.Arrays;


public class bubblesort {
    
    public static void printArray(int array[]){

        
    }
    
    
    
    public static void main(String[] args) {
        int array []={1,9,8,7,6,5,3,4};
        
        
        for(int i=0;i<array.length;i++){
            
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(""+array[i]);
                        System.out.println(""+array[3]);

        }
   
        
    }
    
}
