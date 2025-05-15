import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class ArrayApp {
    public static void print_array1D(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ".inci elaman " + array[i]);
        }
    }
    public static void array1D_assign(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1) + ".inci elamanı giriniz. ");
            array[i] = input.nextInt();
        }
    }
    public static int [] array1D_assign() { //Metotu parametresiz kullandı aşırı yükleme yaptı iki aynı isimli metot tanımladı.
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz ");
        int boyut = input.nextInt();
        int[] array = new int[boyut];
        return array;
    }
    public static void random(int [] dizi) {
       /* for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * dizi.length + 1);  //İki farkli metot
            System.out.println((i+1) + ".inci elaman " + dizi[i]);
        }*/
        Random r = new Random();
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = r.nextInt(51); // 0-50 arası random sayı atar
        }
    }

    public static void min_value (int [] array ){ //EK 2
        int min = array[0];
        int indeks = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indeks++;
            }
        }
        System.out.println("Dizide ki " + indeks + ". elamanı " + min + " en küçük değerdir.");
    }

    public static void max_value (int [] array ){ //EK 2
        int max = array[0];
        int indeks = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indeks++;
            }
        }
        System.out.println("Dizide ki " + indeks + ". elamanı " + max + " en büyük değerdir.");
    }

    public static void average_value (int [] array ){ //EK 2
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int average = sum/array.length;
        System.out.println("Ortalama: " + average);
    }

    public static int [] reverse_printing (int [] array ){ //EK 2
        int ilk = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = array[array.length-1-i];
        }
        array[array.length-1] = ilk;
       return array;
    }







}
