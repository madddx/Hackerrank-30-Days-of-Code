import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i < 11; i++){
            int b = i*a;
            System.out.println(a+" x "+i+" = "+b);
        }
    sc.close();
    }
}
