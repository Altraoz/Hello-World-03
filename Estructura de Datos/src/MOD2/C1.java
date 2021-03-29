package MOD2;

import java.util.Scanner;

public class C1{
    public static void main(String[] ars){
        System.out.println("Hola");
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int[] c = new int[b];
        int i;
        for(i = 0; i < b; ++i) {
            c[i] = a.nextInt();
        }
        int d = a.nextInt();
        int max = c[0];

        for(i = 0; i < d; ++i) {
            if (c[i] >= max) {
                max = c[i];
            }
        }
        System.out.println(max);
    }
}