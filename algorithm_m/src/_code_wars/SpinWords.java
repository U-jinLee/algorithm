package _code_wars;
public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("This is a test"));
        System.out.println(spinWords("This is another test"));
    }

    public static String spinWords(String sentence) {
        StringBuilder builder = new StringBuilder();
        String[] strings = sentence.split(" ");

        for (String string : strings) {
            if(string.length() >= 5) {
                char[] chars = string.toCharArray();
                for(int i = chars.length - 1; i >= 0; i--) {
                    builder.append(chars[i]);
                }
            }else {
                builder.append(string);
            }
            builder.append(" ");
        }

        return builder.toString().trim();
    }

}