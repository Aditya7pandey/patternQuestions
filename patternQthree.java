import java.util.*;

public class patternQthree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0;i<(2*n);i++){
            int c = i>n ? 2*n - i :i;

            for (int j = 0;j<c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
