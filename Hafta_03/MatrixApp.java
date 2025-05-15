import java.util.Scanner;

public class MatrixApp {
    public static void matrix_assing ( int [][] matrix ){
       Scanner input = new Scanner (System.in);
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               System.out.print("[" + i + "][" + j + "] = "  );
               matrix[i][j] = input.nextInt();
           }
           System.out.println();
       }
    }

    public static int [][] matrix_assing (){
            System.out.println("Kare matris değerleri giriniz.");
            Scanner sc = new Scanner(System.in);
            System.out.print("Satır sayısını giriniz: ");
            int satir = sc.nextInt();
            System.out.print("Sütün sayısını giriniz: ");
            int sutun = sc.nextInt();
            int[][] matrix = new int[satir][sutun];
        return matrix;
    }

    public static void matrix_print ( int [][] matrix ){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int [][] matrix_sum ( int [][] matrix1 , int [][] matrix2 ){
        System.out.println("Girilen iki matrix'in toplamı");
        int [][] matrix_sum = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix_sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        matrix_print (matrix_sum);
        return matrix_sum;
    }

    public static int [][] matrix_cikarma ( int [][] matrix1 , int [][] matrix2 ){
        System.out.println("Girilen iki matrix'in çıkarması");
        int [][] matrix_cikarma = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix_cikarma[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        matrix_print (matrix_cikarma);
        return matrix_cikarma;
    }

}
