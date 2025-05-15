import java.util.Scanner;

public class Film_main {
    public static void main(String[] args) {
        Film chipmunks = new Film("Alvin and the chipmunks: The Squeakquel", 8);
        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = sc.nextInt();

        System.out.println();
        if(age >= chipmunks.filmYasSiniri()){
            System.out.println("You may watch the film " + chipmunks.name());
        }else {
            System.out.println("You may not watch the film" + chipmunks.name());
        }
    }
}
