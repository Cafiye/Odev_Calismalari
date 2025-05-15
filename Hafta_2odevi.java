package EMRAHH;

public class Hafta_2odevi {
    ///Verilen iki sayının toplamını bulan metot
    /*public static int toplama( int a, int b){
        System.out.println("a: "+a+" b: "+b);
        int toplam = a+b;
        return toplam;
    }
    public static void main ( String [] args ){
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int toplam = toplama(a,b);
        System.out.println("Toplam= "+ toplam);
    }*/

    ///1 den N kadar olan sayıların ortalamsının veren metot
   /* public static void ortalama (int N){
        int toplam = 0;
        int sayac = 0;
        for(int i = 1; i <= N; i++){
           toplam = toplam + i;
           sayac++;
        }
        double k = (double) toplam/ sayac;
        System.out.println(k);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        ortalama(N);
    }*/

///Dizi elamnalrını toplamını ve ortalamasını bulan metot
   /* public static void diziToplam (int dizi []){
        int toplam = 0;
        for (int i = 0; i < dizi.length ; i++) {
            toplam = toplam + dizi[i];
        }
        System.out.println(toplam);
        double ortalama = (double) toplam / dizi.length;
        System.out.println(ortalama);
    }
    public static void main(String[] args) {
        int dizi [] = {2, 4,5,6,7,9};
        diziToplam(dizi);
    }*/

///Bir dizideki en küçük elamanı bulma
    /*public static void enKucuk ( int dizi []){
        int enkucuk = dizi[0];
        for (int i = 0 ; i < dizi.length ; i++){
            if (enkucuk > dizi[i]){
                enkucuk = dizi[i];
            }
        }
        System.out.println(enkucuk);
    }
    public static void main ( String [] args ){
        Scanner in = new Scanner (System.in);
        int dizi [] = new int [5];
        for (int i = 0 ; i < 5 ; i++){
            dizi [i] = in.nextInt();
        }
        enKucuk(dizi);
    }*/
///Bir dizideki en büyük elamanı bulma metodu
  /*public static void enBuyuk ( int dizi []){
      int enBuyuk = dizi[0];
      for (int i = 0; i<dizi.length ; i++){
          if ( enBuyuk < dizi[i]){
              enBuyuk = dizi[i];
          }
      }
      System.out.println(enBuyuk);
  }
  public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      int dizi[] = new int [5];
      for (int i = 0; i < dizi.length ; i++){
          dizi[i] = inp.nextInt();
      }
      enBuyuk(dizi);
  }*/

///2 vektör toplamı
    /*public static void Vektor ( int v1 [], int v2 []){
        for (int i = 0; i < v1.length; i++){
            System.out.println( v1 [i] + v2 [i]);
        }
    }
    public static void main ( String[] args ){
        Scanner sc = new Scanner (System.in);
        int v1 [] = new int [3];
        int v2 [] = new int [3];
        for (int i = 0; i < v1.length; i++){
            v1[i] = sc.nextInt();
        }
        for (int i = 0; i < v2.length; i++){
            v2[i] = sc.nextInt();
        }
        Vektor ( v1 , v2 );
    }*/
///2 nokta çarpımı yapan metodu
   /* public static int dotProduct (int v1 [], int v2 []){
        int toplam = 0;
        for (int i = 0; i < v1.length; i++){
            toplam += v1[i]*v2[i];
        }
        //System.out.println(toplam);
        return toplam;
    }
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int v1[] = new int[3];
        int v2[] = new int[3];
        for (int i = 0; i < v1.length; i++) {
            v1[i] = sc.nextInt();
        }
        for (int i = 0; i < v2.length; i++) {
            v2[i] = sc.nextInt();
        }
        int toplam = dotProduct(v1, v2);
        System.out.println(toplam);
    }*/
    ///Matristeki her satırdaki en küçük elamanları bulup döndüren metot
    public static void Matris (int dizi [][]){
        for (int i = 0; i < dizi.length; i++) {
           int enKucuk = dizi [i][0];
            for (int j = 0; j < dizi.length; j++) {
             if (enKucuk > dizi[i][j]) {
                 enKucuk = dizi[i][j];
             }
            }
            System.out.println(i+1 + ". Satırdaki en kucuk "+ enKucuk);
        }
    }
    public static void main(String[] args) {
        int [][] dizi = new int [][]{
                {200 , 300, 400},
                {300 , 400, 500},
                {400 , 500, 600}
        };
         Matris(dizi);
         sutun_kucuk(dizi);
    }

    public static void sutun_kucuk ( int dizi [][]){
        for (int j = 0; j < dizi.length; j++) {
            int enKucuk = dizi [0][j];
            for (int i = 0; i < dizi.length; i++) {
                if (enKucuk > dizi[i][j]) {
                    enKucuk = dizi[i][j];
                }
            }
            System.out.println(j+1 + ". Sütunundaki en kucuk "+ enKucuk);
        }

    }

}
