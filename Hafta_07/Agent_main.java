public class Agent_main {
    public static void main(String[] args) {
        Agent bond = new Agent("James" , "Bond");
       // bond.print();
        bond.toString(); //Hiçbirşey yazdırmaz
        System.out.println(bond);

        Agent ionic = new Agent("Ionic" , "Bond");
        System.out.println(ionic);
    }
}
