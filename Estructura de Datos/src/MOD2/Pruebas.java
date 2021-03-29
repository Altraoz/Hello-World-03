package MOD2;
import java.util.Arrays;
import java.util.Scanner;
public class Pruebas {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt(), i, aux = 0, in1 = 0, in2 = 0;
        float c[] = new float[b], d, i1, i2;
        for (i = 0; i<b; i++){
            c[i] = a.nextFloat();
        }
        Arrays.sort(c);
        String u = a.nextLine();
        String[] f = a.nextLine().split(" ");
        i1 = Float.parseFloat(f[0]);
        i2 = Float.parseFloat(f[1]);

        for (i = 0; i < b; i++){
            if (c[i] >= i1 && aux == 0) {
                in1 = i;
                aux = 1;
            }
            if (c[i] >= i2 && aux == 1){
                in2 = i;
                aux = 0;
                i=b;
            }
        }
        System.out.println(in2-in1);
        asdfa klñalsjdf lkñajs ñlakjsd ñfljaks ñlfkjañs lkjfasdf
    }
}
