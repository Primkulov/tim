package strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String banner = "Thanksgiving Sale 20%";
        boolean isSale = banner .startsWith("Thanks");//true
        System.out.println(isSale);

        System.out.println(banner.startsWith("thanks"));// false
        System.out.println(banner.startsWith("T")); //true
        System.out.println(banner.startsWith("Giving"));// false

        boolean endsWith = banner.endsWith("%");// ?????????????????????? read carefully
    }
}
