public class Person_Main {
    public static void main(String[] args) {
        Person pekka = new Person ("Pekka");
        Person antti = new Person ("Antti");

        pekka.growOlder();  // VOİD ifadeler böyle kendi başlarına yazarız
        pekka.growOlder();

        antti.growOlder();
                            // ama RETURN LU bir ifade mutlsks bir değişkene tanımlanmalı.
        System.out.println("Pekka'nın yaşı: " + pekka.returnAge());
        pekka.printPerson();
        System.out.println("Anti'nin yaşı: " + antti.returnAge() /* + pekka.growOlder() HATALI
                                                                Void bir ifadeyi drek sout un içine atamazsın*/);

        int toplamYas = pekka.returnAge() + antti.returnAge();

        System.out.println("Pekka'nın ve Anti'nin toplam yaşı: " + toplamYas);

        ///  /// /// /// /// /// /// /// /// /// ///

        int i = 0;
        while(i < 30){
            pekka.growOlder();
            i = i + 1;
        }

        antti.growOlder();

        System.out.println(antti + " - *********");  // same as System.out.println(antti.toString());
        System.out.println(pekka + " - *********"); // same as System.out.println(pekka.toString());

        System.out.println();

        if(antti.isOfLegalAge()){
            System.out.print("of legal age: ");
            antti.printPerson();
        }else{
            System.out.print("underage: ");
            antti.printPerson();
        }

        if(pekka.isOfLegalAge()){
            System.out.print("of legal age: ");
            pekka.printPerson();
        } else {
            System.out.print("underage ");
            pekka.printPerson();
        }
        /// /// /// /// /// /// /// /// /// ///
        System.out.println( );

        if(antti.isOfLegalAge()){
            System.out.print( antti.getName() + " ** is of legal age: ");
        } else {
            System.out.println(antti.getName() + " ** is underage");
        }

        if(pekka.isOfLegalAge()){
            System.out.println(pekka.getName() + " ** is of legal age");
        } else {
            System.out.println(pekka.getName() + " ** is underage");
        }


    }

}
