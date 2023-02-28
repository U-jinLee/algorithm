package _code_wars;

public class BitCounting {
    public static void main(String[] args) {
        System.out.println(countBits(1234));
        System.out.println(countBits(4));
        System.out.println(countBits(7));
        System.out.println(countBits(9));
        System.out.println(countBits(10));
        System.out.println(parseCountBits(1234));
        System.out.println(parseCountBits(4));
        System.out.println(parseCountBits(7));
        System.out.println(parseCountBits(9));
        System.out.println(parseCountBits(10));
    }
    public static int countBits(int n) {
        return Integer.toBinaryString(n).replace("0", "").length();
    }
    
    public static int parseCountBits(int n) {
        return Integer.bitCount(n);
    }
}
