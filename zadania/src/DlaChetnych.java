/*DLA CHĘTNYCH - trochę trudniejsze zadanie.
        Na wejściu program dostaje dowolny
        string który składa się tylko z liter a, b i c np. aaabbcbcbcbabab.
        Program ma zrobić redukcję tego stringa. Jak działa redukcja: ab i ba zamieniane jest na c, ac i ca
        zamieniane jest na b, bc i cb zamieniane jest na a.
        Program ma redukować stringa maksymalnie jak się da.
        Przykład: ababcbcbacab -> ccaabc -> cbcc -> acc -> bc -> a.
        Program wyświetla a.

        Możecie też sprawdzić co się stanie w takich sytuacjach:
        najpierw będziecie zamieniać pary ab i ba później ac i ca i na końcu bc i cb
        najpierw bc i cb, później ac i ca i na końcu ab i ba
        dowolna inna kombinacja kolejności.*/
public class DlaChetnych {
    public static void main(String[] args) {
        String str = "abababcacabacbcaababababaabcbcbacaababababbacbaabacbaabcababababbacababababac";
        System.out.println(str);
        boolean run = true;
        String temp = str;
        while(run) {
            str = reduction(str, "ab", "ba","c");
            str = reduction(str, "ca", "ac","b");
            str = reduction(str, "bc", "cb","a");
            if(temp.equals(str)){
                run=false;
            }
            temp = str;
            System.out.println(str);
        }
    }
    public static String reduction(String str, String typ, String typ2,String target){
        if(str.length()<2){return str;}
        else {
            if(str.substring(0,2).equals(typ) || str.substring(0,2).equals(typ2)){
                return target + reduction(str.substring(2),typ,typ2,target);
            }
            else {return str.substring(0,1)+reduction(str.substring(1),typ,typ2,target);}
        }
    }

}
