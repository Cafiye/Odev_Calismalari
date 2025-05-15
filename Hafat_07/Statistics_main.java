import java.util.Scanner;

public class Statistics_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Statistics sayma = new Statistics();
        Statistics sayma2 = new Statistics();
        Statistics sayma3 = new Statistics();

        System.out.println("Sayıları giriniz. Durmak istiyorsanız -1 girin");
        while(true) {
            int number = input.nextInt();
            if(number == -1) {
                break;
            }
            if(number%2 == 0) {
                sayma2.addNumber(number);
            }
            if(number%2 == 1) {
                sayma3.addNumber(number);
            }
            sayma.addNumber(number);
        }

//         sayma.addNumber(3);
//         sayma.addNumber(5);
//         sayma.addNumber(1);
//         sayma.addNumber(2);

        System.out.println("Eklenen sayı miktarı : " + sayma.getCount());
        System.out.println("Toplam: " + sayma.sum());
        System.out.println("Ortalma: " + sayma.average());

        System.out.println("\n ************ \n");

        System.out.println("Eklenen sayı miktarı : " + sayma2.getCount());
        System.out.println("Çift sayıların Toplam: " + sayma2.sum());
        System.out.println("Çift sayıların Ortalma: " + sayma2.average());

        System.out.println("\n ************ \n");

        System.out.println("Eklenen sayı miktarı : " + sayma3.getCount());
        System.out.println("Tek sayıların Toplam: " + sayma3.sum());
        System.out.println("Tek sayıların Ortalma: " + sayma3.average());

    }
}
