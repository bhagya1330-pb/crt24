import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int s,l,b;
        float r;
        s=a.nextInt();
        l=a.nextInt();
        b=a.nextInt();
        r=a.nextFloat();
        int r1=s*s;
        int r2=l*b;
        float r3=(float)(3.14*r*r);
        System.out.println(r1);
        System.out.println(r2);
        System.out.printf("%.2f\n",r3);
        a.close();
    }
}
Input (stdin)

5
5
4
2.0	
Your Output (stdout)

25
20
12.56
Expected Output

25
20
12.56
