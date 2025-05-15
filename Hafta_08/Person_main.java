import java.util.ArrayList;

public class Person_main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();  //NESNE İLE ARRAYLİST TANIMLANDI
        //persons adında bir Arraylist tanımlandı ve bu Arraylist değerlerini Person nesnesinde kullanıcak

        persons.add(new Person("Matthew" , 1));
        persons.add(new Person("Martin" , 1));

        // YA DA
        Person john = new Person ("john" , 1);
        persons.add(john);

        // 1.For döngüsü ile
        for (int i = 0; i < persons.size() ; i++){
            System.out.println(persons.get(i));
        }

        // 2.For Each döngüsü
        for(Person person1 : persons){
            System.out.println(person1);
        }

        // 3.While döngüsü
        int i = 0;
        while ( i<persons.size()){
            System.out.println(persons.get(i));
            i++;
        }

    }
}
