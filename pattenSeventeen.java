import java.util.*;

public class pattenSeventeen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1;i<=2*n;i++){
            int c = i>n ? 2*n - i :i;
            for (int space = 0;space< n-c;space++){
                System.out.print("  ");
            }

            for (int j = c;j>=1;j--){
                System.out.print(j+" ");
            }
            for (int j = 2;j<=c;j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
