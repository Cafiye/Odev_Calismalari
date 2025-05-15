public class Film {
    private String filmName;
    private int derece;

    public Film(String filmName, int derece) {
        this.filmName = filmName;
        this.derece = derece;
    }
    public String name() {
        return filmName;
    }
    public int filmYasSiniri(){
        return derece;
    }
}
