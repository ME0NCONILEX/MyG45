package week1;
import java.util.ArrayList;
public class v1Exer3 {
    public static void main(String[] arg) {

        int [] mynumbs = {45, 11, 12, 4, 24, 6, 55};
        int a = (mynumbs[0] + mynumbs[1]);
        int m = (mynumbs[2] * mynumbs[3]);
        int d = (mynumbs[4] / mynumbs[5]);
        int s = (mynumbs[6] - mynumbs[2]);

        System.out.println(((mynumbs[0] + " + " + mynumbs[1] ) + " = " + a ));
        System.out.println(((mynumbs[2] + " * " + mynumbs[3] ) + " = " + m ));
        System.out.println(((mynumbs[4] + " / " + mynumbs[5] ) + " = " + d ));
        System.out.println(((mynumbs[6] + " - " + mynumbs[2] ) + " = " + s ));
    }
}
