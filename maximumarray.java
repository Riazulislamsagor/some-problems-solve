
package javaproject;


public class maximumarray {
    
    public static void main(String[] args) {
          
        int []array={1,2,4,5,3,7,9,8};
        
       int max=array[0];
        
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        
        System.out.println(""+max);
    }
    
}
