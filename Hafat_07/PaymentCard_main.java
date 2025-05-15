public class PaymentCard_main {
    public static void main(String[] args) {
        PaymentCard paul = new PaymentCard(20);
        PaymentCard matt = new PaymentCard(30);

        paul.eatHeartily();
        matt.eatAffordably();

        System.out.println("Paul: " + paul.toString());
        System.out.println("Matt: " + matt.toString());

        paul.addMoney(20);
        matt.eatHeartily();

        System.out.println("Paul: " + paul.toString());
        System.out.println("Matt: " + matt.toString());

        paul.eatAffordably();
        paul.eatHeartily();
        matt.addMoney(50);

        System.out.println("Paul: " + paul.toString());
        System.out.println("Matt: " + matt.toString());



//        PaymentCard card = new PaymentCard(10);
//        System.out.println(card);

//        card.eatHeartily();
//        System.out.println(card);
//
//        card.eatHeartily();
//        System.out.println(card);

//        card.addMoney(15);
//        System.out.println(card);
//
//        card.addMoney(10);
//        System.out.println(card);
//
//        card.addMoney(200);
//        System.out.println(card);
//
//        card.addMoney(-10);
//        System.out.println(card);


    }
}
