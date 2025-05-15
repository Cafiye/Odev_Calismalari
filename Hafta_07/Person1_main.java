public class Person1_main {
    public static void main(String[] args) {
        Person1 matti = new Person1 ("Matti");
        Person1 juhana = new Person1 ("Juhana");

        matti.setHeight(180);
        matti.setWeight(86);

        juhana.setHeight(175);
        juhana.setWeight(64);

        System.out.println(matti.getName() + ": vücüt kütle indeksi " + matti.bodyMassIndex());
        System.out.println(juhana.getName() + ": vücut kütle indeksi " + juhana.bodyMassIndex());

        System.out.println(matti.toString()); ///*///
    }
}
