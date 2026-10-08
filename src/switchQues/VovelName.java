package switchQues;

public class VovelName {

    public static void main(String[] args) {

        char ch = 'a';

        switch (ch) {
            case 'a', 'e' ,'i', 'o' ,'u' -> System.out.println("vowel");
            default -> System.out.println("novowel");
        }
    }
}
