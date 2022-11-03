import java.util.Scanner;

public class watermelon {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Byte W = in.nextByte();
        if ((W)%2==0 && W!=2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
