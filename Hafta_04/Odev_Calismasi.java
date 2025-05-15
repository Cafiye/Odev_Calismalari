public class Odev_Calismasi {
    public static void main(String[] args) {
        for ( int i = 1 ; i <= 5 ; i++){
            System.out.println( i + ".Terim: " +besKat2(i) + " ");
        }
        for ( int i = 1 ; i <= 5 ; i++){
            System.out.println( i + ".Terim: " + besKat(i) + " ");
        }
        int a = 4;
        fun(a);
    }
    public static int besKat ( int n){
        if ( n ==  1 ){
            return 3*n; //BENİM YAPTIĞIM
        }
        else {
            return 5*besKat(n-1);
        }
    }
    public static int besKat2 ( int n){
        if ( n ==  1 ){
            return 3;  // GEMİNİ YAPTIĞI
        }
        else {
            return 5*besKat(n-1);
        }
    }
    public static int ikiKat (int n1){
        if ( n1 == 1 ){
            return 3*n1;
        }
        else {
            return 2*ikiKat(n1-1);
        }
    }
    public static void fun(int x) {
        if(x > 0) {
            fun(--x);
            System.out.print(x + " ");
            fun(--x);
        }
    }
}
