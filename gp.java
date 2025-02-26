import java.util.*;
public class gp {
    public static int[] arraySwap(int N , int[] A) {
        Arrays.sort(A);

        int r = A[1]/A[0];

        for (int i = 0; i < N-1; i++) {
            if(A[i+1]/A[i] != r){
                return new int[]{-1};
            }
        }

        return A;

    }
    public static void main(String[] args) {
        int[] A = {4,2,16,9};
        int N = 4;

        int[] result = arraySwap(N,A);

        for(int num : result){
            System.out.println(num + " ");
        }
    }
}
