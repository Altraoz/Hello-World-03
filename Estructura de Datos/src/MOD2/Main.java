package MOD2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        String z;
        int b = a.nextInt(), i, aux = 0;
        float d[] = new float[b], in1, in2;
        for (i = 0; i < b; i++){
            d[i] = a.nextFloat();
        }
        String u = a.nextLine();
        String[] f = a.nextLine().split(" ");
        in1 = Float.parseFloat(f[0]);
        in2 = Float.parseFloat(f[1]);

        for (i = 0; i < b; i++){
            if (d[i] >= in1 && aux == 0) {
                in1 = i;
                aux = 1;
            }
            if (d[i] <= in2 && aux == 1){
                in2 = i;
            }
        }
        System.out.println(in1);
        System.out.println(in2);
        //for (i = in1; i < in2; i++){
            //System.out.println(d[i]);
    }
}
