/*
String-2 > xyzMiddle
        prev  |  next  |  chance

        Given a string, does "xyz" appear in the middle of the string?
        To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
        This problem is harder than it looks.

        xyzMiddle("AAxyzBB") → true
        xyzMiddle("AxyzBB") → true
        xyzMiddle("AxyzBBB") → false*/
public class XyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }

    public static boolean xyzMiddle(String str) {
        if(str.contains("xyz")) {
            if(Math.abs(xyzMiddleL(str)-xyzMiddleR(str))<=1){
                return true;
            }
        }
            return false;
    }

    public static int xyzMiddleL(String str) {
        if(str.substring(0, 1).equals("x")){return 0;}
        else if (!str.substring(0, 1).equals("x")) {
            return 1 + xyzMiddleL(str.substring(1));
        }
        else {return 0;}
    }
    public static int xyzMiddleR(String str) {
        if(str.substring(str.length()-1, str.length()).equals("z")){return 0;}
        else if (!str.substring(str.length()-1, str.length()).equals("z")) {
            return 1 + xyzMiddleR(str.substring(0,str.length()-1));
        }
        else {return 0;}
    }

}
