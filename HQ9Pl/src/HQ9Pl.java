public class HQ9Pl {
    public static void performance(String code) {
        int k = 0;
        char comand;
        for (int i = 0; i < code.length(); i++) {
            comand = code.charAt(i);
            if (comand == 'H') {
                H();
            }
            else if (comand == 'Q') {
                Q(code);
            } else if (comand == '9') {
                Beer();
            } else if (comand == '+') {
                Pl(k);
            } else {
                error();
            }
        }
    }
    private static void H() {
        System.out.print("Hello, World!\n");
    }
    private static void Q(String code) {
        System.out.print(code + "\n");
    }
    private static void Beer() {
        for (int beer = 99; beer > 1; beer--) {
            System.out.print(beer + " bottles of beer on the wall, " + beer + " bottles of beer\n" +
                    "Take one down, pass it around, " + (beer - 1) + " bottles of beer on the wall!\n\n");
        }
        System.out.print("1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.\n\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n");
    }
    private static void Pl(int k) {
        k++;
    }
    private static void error() {
        System.out.print("Syntax error!\n");
    }
}
