import java.util.ArrayList;
//Bu bir liste oluşturma
public class ArrayList_Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        //Eklanecek veriyi bir değişkene tanımlayıp onu add içine atabiliriz
        String name1 = "Betty Jennings";
        String name2 = "Betty Jennings";
        names.add(name1);
        names.add(name2);

         //elamanlar doğrudan diziye ekleme
        names.add("Betty");
        names.add("Frances");
        names.add("Kay");
        names.add("Marlyn");
        names.add("Ruth");

        //Döngü ile yazdeımak için birkaç ifade şekli olabilir.

        //1. For loop döngüsü
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        //2. For Each loop(index yok burda)
        for(String name : names){
            System.out.println(name);
        }

        //3. While döngüsü
        int index = 0;
        while(index < names.size()){
            System.out.println(names.get(index));
            index++;
        }

    }
}
