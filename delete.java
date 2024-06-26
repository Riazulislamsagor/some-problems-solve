
package javaproject;


public class delete {
    
   
    public static void main(String[] args) {
        int[] a = {1, 2, 7, 8, 4, 5, 9};
        int delete = 8;
      int n = a.length;
        
        for (int i = 0; i <a.length; i++) {
            if (a[i] == delete) {
                // Shift elements to the left
                for (int j = i; j <a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
                // Reduce array size by one
                break; // Delete only the first occurrence
            }
        }
        
        // Print the array after deletion
        for (int i = 0; i <a.length-1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
