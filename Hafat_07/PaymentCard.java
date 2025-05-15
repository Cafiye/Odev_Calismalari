public class PaymentCard {
    private double  balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return  "Kartın bakiyesi: " + balance + " ";
    }
    public void eatAffordably(){
        if(balance > 2.60){
            balance -= 2.60;
        }

    }
    public void eatHeartily(){
        if(balance > 4.60) {
            balance -= 4.60;
        }
    }
    public void addMoney(double amount){
        if(amount > 0){
            if(balance + amount <= 150){
                balance += amount;
            } else{
                balance = 150;
            }

        }
//        if( balance < 150) {
//            if(amount > 0) {
//                balance += amount;
//            }
//        }
//        if(balance > 150){     ben böyle düşünmüştüm işede yarıyordu
//            balance = 150;
//        }

    }
}
