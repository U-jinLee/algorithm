package _code_wars;

public class Breakcamelcase {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
        System.out.println(camelCase("camelCasingTest"));
        System.out.println(refineCamelCase("camelCasing"));
        System.out.println(refineCamelCase("camelCasingTest"));
    }
    public static String camelCase(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(Character.isUpperCase(chars[i])) {
             stringBuilder.append(" ");
             stringBuilder.append(chars[i]);
            } else {
                stringBuilder.append(chars[i]);
            }
        }

        return stringBuilder.toString();
    }
}
