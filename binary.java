
package javaproject;


public class binary {
    
    public static void main(String []args){
        
        int a[]={1,2,3,4,5,6,7,8,9};
        
        
        int search=5;
       int  hi=a.length-1;
       int  li=0;
       
       int mi=(li+hi)/2;
       
       while(li<=hi){
           if(a[mi]==search){
               System.out.println(""+mi);
               break;
               
               
           }else if(a[mi]<search){
               li=mi+1;
               
           }else{
               hi=mi-1;
           }
               mi=(li+hi)/2;
          
       }
       if(li>mi){
           System.out.println("No element found");
       }
       
    }
    
}
