
package javaproject;


public class sort {
    
    public static void main(String[] args) {
        int []a={1,2,7,8,4,5,9};
        
        int temp;
        
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(""+a[i]);
        }
                    System.out.print("second smallest element is "+a[1]);

    }
    
}
