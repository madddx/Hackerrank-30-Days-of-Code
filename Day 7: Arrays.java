import java.util.*;
public class solution{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        
        for(int i =0 ; i<N ; i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i = N-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
