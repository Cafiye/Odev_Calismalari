public class Agent {
    String name;
    String soyad;

    public Agent( String name, String soyad) {
        this.name = name;
        this.soyad = soyad;
    }

//    public void print() {
//        System.out.println( "Benim adım: " + name + " ," + name + soyad );
//    }
    public String toString() {
        return "Benim adım: " + soyad + ", " + name  + " "+ soyad;
    }
}

