/*Zamiana liczb dziesiętnych na binarne.
        Na tej stronie na początku macie pokazane jak zamienia się liczby dziesiętne na binarne
        https://informatyk.edu.pl/systemy-liczbowe-system-binarny/.
// Napiszcie program który działa rekurencyjnie i wyświetla liczbę w systemie binarnym.*/
public class DziesietneBinarne {
    public static void main(String[] args) {
        System.out.print(8 + " -> ");
        System.out.print(exchange(8)+ " ");
        System.out.println(Integer.toBinaryString(8));
        System.out.print(112 + " -> ");
        System.out.print(exchange(112)+ " ");
        System.out.println(Integer.toBinaryString(112));
    }
    public static String exchange(int n){
        if(!(n>0)){
            return "";
        }
        return exchange(n / 2) + Integer.toString(n % 2);
    }
}

