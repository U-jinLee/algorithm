package _code_wars;

public class HighestScoringWord {
    public static void main(String[] args) {
        String test = "man i need a taxi up to ubud";
        String test2 = "what time are we climbing up to the volcano";
        String test3 = "take me to semynak";
        System.out.println(high(test));
        System.out.println(high(test2));
        System.out.println(high(test3));
    }
    public static String high(String s) {
        long highestScore = 0;
        int highestNumber = 0;

        // 문장을 단어로 분할
        String[] words = s.split(" ");
        // 단어를 캐릭터로 변환 후 점수를 계산
        for(int i = 0; i < words.length; i++) {
            if(getWordScore(words[i]) > highestScore) {
                highestScore = getWordScore(words[i]);
                highestNumber = i;
            }
        }

        return words[highestNumber];
    }

    private static long getWordScore(String word) {
        int result = 0;
        char[] chars = word.toCharArray();
        for (char c : chars) result += Alphabet.valueOf(String.valueOf(c)).getInt();
        return result;
    }

    public enum Alphabet {
        a(1), b(2), c(3), d(4), e(5), f(6), g(7), h(8), i(9), j(10), k(11), l(12), m(13), n(14), o(15), p(16), q(17), r(18), s(19), t(20), u(21), v(22), w(23), x(24), y(25), z(26);
        public int num;

        Alphabet (int n) {
            this.num = n;
        }
        public int getInt() {
            return this.num;
        }
    }

}