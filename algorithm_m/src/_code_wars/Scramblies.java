package _code_wars;

import java.util.Objects;

public class Scramblies {
    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw","world"));
        System.out.println(scramble("cedewaraaossoqqyt","codewars"));
        System.out.println(scramble("katas","steak"));
        System.out.println(scramble("scriptjavx","javascript"));
    }

    public static boolean scramble(String str1, String str2) {
        char[] compareChar = str2.toCharArray();
        for (char c : compareChar) {
            if(Objects.equals(str1.contains(String.valueOf(c)), false)) {
                return false;
            }else {
                str1.replace(String.valueOf(c), "");
            }
        }
        return true;
    }

}
