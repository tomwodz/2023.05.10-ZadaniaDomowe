import java.util.Arrays;
import java.util.Scanner;

/*Program który wylicza n-ty element ciągu arytmetycznego.
        Na wejściu program dostaje pierwszy wyraz ciągu,
        różnicę i numer wyrazu który ma wyliczyć.
        Krótka teoria jak działa ciąg arytmetyczny:
        https://pl.wikipedia.org/wiki/Ciąg_arytmetyczny. Przykład działania programu:
        Wejście
        2 5 4
        Wynik
        17*/

public class ZadRekCiagAryt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int a1 = Integer.parseInt(str[0]);
        int r = Integer.parseInt(str[1]);
        int n = Integer.parseInt(str[2]);
        System.out.println(Arrays.toString(str));
        System.out.println(arithmeticSequence(a1,r,n));
        System.out.println(arithmeticSequenceSpr(a1,r,n));
    }

    // Rekurencyjnie
    public static int arithmeticSequence(int a1, int r, int n){
    if(n == 1){return a1;}
    return r+arithmeticSequence(a1, r, n-1);
    }

    //Normalnie
    public static int arithmeticSequenceSpr(int a1, int r, int n){
        return a1 + (n-1) * r;
    }

}
