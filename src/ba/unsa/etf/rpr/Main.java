package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {
    public static int sumaCifara(int x) {
        int s = 0;
        while (x != 0) {
            s += x % 10;
            x /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
    System.out.println("Unesite broj n: ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
     for(int i = 1;i<n;i++)
    {
        if (i%sumaCifara(i)==0)
            System.out.println(i);
    }
}
}
