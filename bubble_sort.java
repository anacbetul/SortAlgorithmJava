import java.util.*;
public class bubble_sort {
    public static void main(String[] args) {
        int[] A = new int [100];

        for (int i = 0; i < 100; i++) {
            Random rand = new Random();
            A[i] = rand.nextInt(100);
            System.out.print(A[i] + " ");
        }
        
        for(int j=0; j<A.length-1; j++){
            for(int k=0; k<A.length-j-1; k++){
                if(A[k]>A[k+1]){
                    int temp = A[k];
                    A[k] = A[k+1];
                    A[k+1] = temp;
                }
            }
        }
        System.out.println("\n-------------------------------------");
        for (int i = 0; i < 100; i++) {
            System.out.print(A[i] +" ");
        }
    }
}