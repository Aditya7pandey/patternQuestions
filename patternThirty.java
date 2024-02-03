import java.util.*;

public class patternThirty{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int OrignalN = n;
        n = 2*n;
        for (int row = 0;row<=n;row++){
            for (int col =0;col<=n;col++){
                int specialNum = OrignalN - Math.min( Math.min(row,col) , Math.min(n-row,n-col));
                System.out.print(specialNum+" ");
            }
            System.out.println();
        }
    }
}
