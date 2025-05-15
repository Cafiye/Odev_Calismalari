import java.util.Scanner;

public class ArrayApp2D {
    public static void array2D_assign(int[][] array) { //EK 1 DİZİNİN ELAMANLARINI KULLANICIDAN ALMA METODU
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print( "[" + i + "]" + "[" + j + "]" + ".inci elamanı giriniz. ");
                array[i][j] = input.nextInt();
            }
            System.out.println("  ");
        }

    }

    public static int [][] array2D_assign() { /*EK*/ /// OVERLOADİNG YAPILDI PARAMETRESİZ METOT MATRİS UZUNLUĞUNU KULLANICIDAN ALMA
        Scanner input = new Scanner(System.in);
        System.out.println("Matris satır sayısını giriniz. ");
        int boyut1 = input.nextInt();
        System.out.println("Matris sutun sayısını giriniz.");
        int boyut2 = input.nextInt();
        int [][] array = new int[boyut1][boyut2];
        return array;
    }

    public static void print_array2D(int[][] array) { //EK 1 MATRİS YAZDIRMA
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + ".inci elaman " + array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void array2D_kucuk(int[][] array) {  // EK1 MATRİSTEKİ EN KÜÇÜK DEĞERİ BULMA
        int enKucuk = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < enKucuk) {
                    enKucuk = array[i][j];
                }
            }
        }
        System.out.println("Matristeki en küçük elaman " + enKucuk);
    }

    public static int [] satir_kucuk(int[][] array) {
        int[] min_array = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int enKucuk = array[i][0];
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < enKucuk) {
                    enKucuk = array[i][j];
                }
            }
            min_array[i] = enKucuk;
            //System.out.println(i+1 + ". satırın en küçüğü: " + enKucuk);
        }
        return min_array;
    }

    public static int [][] sutun_kucuk(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            int enKucuk = array[0][j];
            for (int i = 0; i < array[j].length; i++) {
                if (array[i][j] < enKucuk) {
                    enKucuk = array[i][j];
                }
            }
            System.out.println(j+1 + ". sütünün en küçüğü: " + enKucuk);
        }
        return array;
    }

    public static void avarage_satir (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            double avarage = 0;
            int sum = 0;
            for (int j = 0; j < array[0].length; j++) {
                System.out.println(i + " " + j);
                sum += array[i][j];
            }
           avarage = (double) sum / array[0].length;              ///ANCAK KARE MATRİX OLDUĞUNDA ÇALIŞIYOR.
            System.out.println(i+1 + ". satırın ortalaması: " + avarage);
        }
    }

    public static void avarage_sutun (int[][] array) {
        for (int j = 0; j < array.length; j++) {
            double avarage = 0;
            int sum = 0;
            int sayi = 0;
            for (int i = 0; i < array[0].length; i++) {
                sum += array[i][j];
                sayi++;
            }
            avarage =  (double) sum / sayi;
            System.out.println(j+1 + ". sütünün ortalaması: " + avarage);
        }
    }
}


