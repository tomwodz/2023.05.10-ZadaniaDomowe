/*String-2 > mixString
        prev  |  next  |  chance

        Given two strings, a and b,
        create a bigger string made of the first char of a,
        the first char of b, the second char of a,
        the second char of b, and so on. Any leftover chars go at the end of the result.

        mixString("abc", "xyz") → "axbycz"
        mixString("Hi", "There") → "HTihere"
        mixString("xxxx", "There") → "xTxhxexre"*/
public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc","xyz"));
        System.out.println(mixString("Hi","There"));
        System.out.println(mixString("abcedXXX","12345"));
    }
    public static String mixString(String a, String b) {
        String str = mixStringMix(a,b);
        String temp = "";
        if(a.length()>b.length()){temp = a.substring(b.length());
            return str+temp;}
        else if (a.length()<b.length()){temp = b.substring(a.length());
            return str+temp;}
            return str;
    }

    public static String mixStringMix(String a, String b) {
        if(a.length()==0 || b.length()==0){
            return "";
        }
        return a.substring(0,1)+b.substring(0,1) +
                mixStringMix(a.substring(1), b.substring(1));
    }
}
