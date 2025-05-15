import java.sql.SQLOutput;

public class Multiplier_main {
    public static void main(String[] args) {
        Multiplier multiplyByThree = new Multiplier (3);

        System.out.println("3 ile 2 yi çarp: " + multiplyByThree.multiply(2));

        Multiplier multiplyByFour = new Multiplier (4);

        System.out.println("4 ile 2 yi çarp : " + multiplyByFour.multiply(2));
        System.out.println("4 ile 1 i çarp: " + multiplyByFour.multiply(1));
        System.out.println("3 ile 4  ü çarp: " + multiplyByThree.multiply(4));
    }
}
