import java.util.Scanner;

public class P_V {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        v1.print_vector();
        v2.print_vector();
        int sl = select();
        if (sl == 1) v1.print_sk_pr(v2, v1.sk_pr(v2));
        if (sl == 2) {
            Vector vpr = new Vector("", 0, 0, 0);
            vpr = v1.vec_pr(v2);
            v1.print_vec_pr(v2, vpr);
        }
        if (sl == 3) {
            Vector v3 = new Vector();
            v1.print_sm_pr(v2, v3, v3.sm_pr(v1, v2));
        }
    }
    public static int select() {
        Scanner in = new Scanner(System.in);
        int sl = 0;
        do {
            System.out.print("\n1: ()\n2: []\n3: <>\n");
            sl = in.nextInt();
        } while (sl != 1 && sl != 2 && sl != 3);
        return sl;
    }
}