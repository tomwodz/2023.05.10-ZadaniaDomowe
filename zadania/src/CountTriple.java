/*String-3 > countTriple
        prev  |  next  |  chance

        We'll say that a "triple" in a string is a char appearing three times in a row.
        Return the number of triples in the given string. The triples may overlap.

        countTriple("abcXXXabc") → 1
        countTriple("xxxabyyyycd") → 3
        countTriple("a") → 0*/

public class CountTriple {
    public static void main(String[] args) {
        System.out.println(countTriple("abcXXXabc"));
        System.out.println(countTriple("xxxabyyyycd"));
        System.out.println(countTriple("a"));
    }
    public static int countTriple(String str) {
        if(str.length()<3){return 0;}
        else {
            if(str.charAt(0)==str.charAt(1) && str.charAt(1)==str.charAt(2)){
                return 1 + countTriple(str.substring(1));
            }
            else {return countTriple(str.substring(1));}
        }
    }
}
