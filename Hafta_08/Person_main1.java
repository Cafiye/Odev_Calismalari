import java.util.ArrayList;
import java.util.Scanner;

public class Person_main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        System.out.println("Durmak için boş bırakınız.");
        while(true){
            System.out.println("Bir isim giriniz: ");
      //    persons.add(new Person(sc.nextLine()));
            String name = sc.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println(name + "Yaşını giriniz: ");
            int age = Integer.parseInt(sc.nextLine());
            persons.add(new Person(name , age));
        }

        System.out.println();
        System.out.println("Girilen kişi sayısı: " + persons.size());
        System.out.println("Kişiler: ");

        for(int i = 0; i < persons.size(); i++ ){
            System.out.println(persons.get(i));
        }

//        for(Person kk : persons){
//            System.out.println(kk);
//        }
    }
}
