package _code_wars;

public class SimplePigLatin {
    public static void main(String[] args) {
        String test1 = "Pig latin is cool";
        String test2 = "Hello world !";

        System.out.println(pigIt(test1));
        System.out.println(pigIt(test2));
    }
    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(addAy(change(word)));
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().stripLeading().stripTrailing();
    }

    public static String change(String s) {
        String result = "";
        char[] chars = s.toCharArray();
        for(int i = 1; i < chars.length; i++) {
            result += chars[i];
        }
        result += chars[0];

        return result;
    }

    public static String addAy(String s) {
        String result = s.concat("ay");
        if(result.contains("!") || result.contains("?")) result = result.replace("ay", "");
        return result;
    }
}
