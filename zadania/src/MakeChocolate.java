/*Logic-2 > makeChocolate
        prev  |  next  |  chance

        We want make a package of goal kilos of chocolate.
        We have small bars (1 kilo each) and big bars (5 kilos each).
        Return the number of small bars to use, assuming we always use big bars before small bars.
        Return -1 if it can't be done.

        makeChocolate(4, 1, 9) → 4
        makeChocolate(4, 1, 10) → -1
        makeChocolate(4, 1, 7) → 2*/
public class MakeChocolate {
    public static void main(String[] args) {
        System.out.println(makeChocolate(4,1,9));
        System.out.println(makeChocolate(4,1,10));
        System.out.println(makeChocolate(4,1,7));
    }

    public static int makeChocolate(int small, int big, int goal) {
        int smallAll = small * 1;
        int bigAll = big * 5;
        int all = smallAll + bigAll;
        int makeChocolate = -2;
        if(all >= goal)
        {
            if(goal >=5){
                if(bigAll==goal){ makeChocolate = 0;}
                else if(bigAll>goal){
                    int e1 = goal % 5;
                    if(smallAll>=e1){makeChocolate = e1;}
                    else{makeChocolate =-1;}
                }
                else if(bigAll<goal){
                    int r1 = bigAll /  goal;
                    int r2 = r1 * 5;
                    int r3 = goal - bigAll;
                    if(smallAll>=r3){makeChocolate = r3;}
                    else{makeChocolate =-1;}
                }
            }
            else{
                if(smallAll>=goal)
                {makeChocolate = goal;}
                else {makeChocolate = -1;}

            }
        }
        else{makeChocolate = -1;}
        return makeChocolate;
    }
}
