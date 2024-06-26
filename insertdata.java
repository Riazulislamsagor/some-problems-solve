
package javaproject;


public class insertdata {
    
    public static void main(String[] args) {
        int []array={1,9,3,2,4,8,7};
        int possition=5;
        int element =100;
        
        for(int i=array.length-1;i<possition-1;i--){
            
            array[i]=array[i-1];


            
        }
        
        array[possition-1]=element;
        
        for(int i=0;i<array.length;i++){
            System.out.println(""+array[i]);
        }
        
    
    }
    
}
