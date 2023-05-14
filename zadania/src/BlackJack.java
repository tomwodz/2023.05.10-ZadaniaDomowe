/*Logic-2 > blackjack
        prev  |  next  |  chance

        Given 2 int values greater than 0,
        return whichever value is nearest to 21 without going over.
        Return 0 if they both go over.

        blackjack(19, 21) → 21
        blackjack(21, 19) → 21
        blackjack(19, 22) → 19*/
public class BlackJack {
    public static void main(String[] args) {
        System.out.println(blackjack(19,21));
        System.out.println(blackjack(21,19));
        System.out.println(blackjack(19,22));
    }

    public static int blackjack(int a, int b) {
        int w = 0;
        int z = 21;
        if (a > z && b <= z) {
            w = b;
        } else if (b > z && a <= z) {
            w = a;
        } else if (b <= z && b <= z) {
            if (a == b) {
                w = a;
            } else if (a != b) {
                if (a > b) {
                    w = a;
                } else {
                    w = b;
                }
            }
        } else if (a > z && b > z) {
            w = 0;
        }
        return w;
    }

}
