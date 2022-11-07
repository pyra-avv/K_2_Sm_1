import java.util.Scanner;

public class _beer {
    public static void main(String[] args) {
        System.out.print("99 бутылок пива на стене\n99 бутылок пива!\n");
        for (int i = 98; i > 0; i--) {
            System.out.print("Возьми одну пусти по кругу\n" + i + " бутылок пива на стене\n" + i + " бутылок пива!\n");
        }
        System.out.print("""
                Возьми одну пусти по кругу
                Нет бутылок пива на стене
                Пойди в магаз и стяни ещё
                99 бутылок пива на стене!""");
    }
}
