public class ServerNameGenerator {

    static String[] adjectives = {"spicy", "fluffy", "blaring", "purple", "large", "flat", "old", "heavy", "kind", "famous"};
    static String[] nouns = {"computer", "sandwich", "chair", "monkey", "apple", "plane", "space", "water", "microphone", "oven"};

    public static String randomString(String[] x) {
        int random = (int) (Math.random() * (9 - 1 + 1) + 1);
        return x[random];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(randomString(adjectives) + "-" + randomString(nouns));
    }
}
