import java.util.Arrays;
import java.util.Scanner;

/*Program który wylicza n-ty element ciągu geometrycznego.
        Na wejściu program dostaje pierwszy wyraz ciągu, iloraz i numer wyrazu który ma wyliczyć.
        Krótka teoria jak działa ciąg geometryczny: https://pl.wikipedia.org/wiki/Ciąg_geometryczny. Przykład:
        Wejście
        3 2 5
        Wynik
        48*/
public class ZadRekCiagGeo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int a1 = Integer.parseInt(str[0]);
        int q = Integer.parseInt(str[1]);
        int n = Integer.parseInt(str[2]);
        System.out.println(Arrays.toString(str));
        System.out.println(geometricSequence(a1,q,n));
        System.out.println(geometricSequenceSpr(a1,q,n));
    }

    //Rekurencyjnie
    public static int geometricSequence(int a1, int q, int n){
        if(n==1){return a1;}
        return q * geometricSequence(a1,q,n-1);
    }

    //Normalnie
    public static double geometricSequenceSpr(int a1, int q, int n){
    return Math.pow(q, n-1) * a1;
    }
}
