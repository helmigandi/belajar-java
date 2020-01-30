import java.util.*;
import java.io.*;
import java.lang.Math;

class latihan3{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int c=1;
        double s, h=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j=0; j<n; j++){
                //c = c + j;
                s = a+ Math.pow(2,j) *b;
                h = h + s;
                c = (int) h;
                System.out.print((c + " "));
            }
            System.out.println();

        }


        in.close();
    }
}

