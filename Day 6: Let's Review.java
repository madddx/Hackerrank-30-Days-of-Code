import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for(int i=0 ; i<N; i++){
            String A = sc.next();
            StringBuilder even =  new StringBuilder();
            StringBuilder odd = new StringBuilder();
            
            for(int j =0;j<A.length();j++){ 
                if(j%2==0){
                    even.append(A.charAt(j));
                }
                else{
                    odd.append(A.charAt(j));
                }
            }
            
            System.out.println(even +" "+ odd);
        }    
        sc.close();
    }
}
