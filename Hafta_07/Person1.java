public class Person1 {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person1 (String name){
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }
    public String getName(){
        return this.name;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public double bodyMassIndex(){
        double yukseklikYuzdeBasi = this.height / 100.0;
        return this.weight /(yukseklikYuzdeBasi*yukseklikYuzdeBasi);
    }
    public String toString(){
        return this.name + ", age " + "  vücüt indexi " + bodyMassIndex();
    }
}
