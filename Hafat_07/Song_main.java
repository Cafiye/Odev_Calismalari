public class Song_main {
    public static void main(String[] args) {
        Song garden = new Song("In The Garden" , 10910);
        System.out.println("Şarkı " + garden.getName() + " uzunluğu " + garden.getUzunluk() + " saniyedir.");
    }
}
