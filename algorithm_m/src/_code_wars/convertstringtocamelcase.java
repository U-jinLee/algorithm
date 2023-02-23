package _code_wars;

public class convertstringtocamelcase {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-last-of-us"));
        System.out.println(toCamelCase("the_last_of_us"));
        System.out.println(toCamelCase("the-last-of-us"));
        System.out.println(refineToCamelCase("the_last_of_us"));
    }
    static String toCamelCase(String s){
        if(s.isEmpty()) return "";

        String[] split = new String[0];
        if(s.contains("-")) split = s.split("-");
        if(s.contains("_")) split = s.split("_");

        StringBuilder result = new StringBuilder();
        result.append(split[0]);
        for(int i = 1; i < split.length; i++) {
            split[i] = split[i].substring(0,1).toUpperCase() + split[i].substring(1, split[i].length());
            result.append(split[i]);
        }

        return result.toString();
    }
    static String refineToCamelCase(String s){
        if(s.isEmpty()) return "";

        String[] split = s.split("[_-]");

        StringBuilder result = new StringBuilder();
        result.append(split[0]);
        for(int i = 1; i < split.length; i++) {
            split[i] = split[i].substring(0,1).toUpperCase() + split[i].substring(1, split[i].length());
            result.append(split[i]);
        }

        return result.toString();
    }
}
