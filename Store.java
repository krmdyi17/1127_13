import java.util.Scanner;
import java.util.Arrays;

class Store{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        int[] B = new int[M];
        for(int i=0; i<M; i++){
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int sale = 0;
        for (int i=0; i<M; i++){
            int yosan = B[i];

            for(int j=N-1; j>=0; j--){
                if(A[j] <= yosan){
                    sale += A[j];
                    break;
                }
            }
        }
        System.out.println(sale);
    }
}


