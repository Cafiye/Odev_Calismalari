import java.util.ArrayList;
import java.util.Scanner;

public class PersonInformationCollection_main {
    public static void main(String[] args) {
        ArrayList<PersonalInformation> personList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Durmak için boş bırakınız.");
        while (true){
            System.out.print("İsim: ");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.print("Soyadı: ");
            String surname = scanner.nextLine();

            System.out.print("Tc: ");
            String id = scanner.nextLine();

            personList.add(new PersonalInformation(name, surname, id));
        }

        for(int i = 0; i < personList.size(); i++){
            System.out.println(personList.get(i));
        }
    }
}
