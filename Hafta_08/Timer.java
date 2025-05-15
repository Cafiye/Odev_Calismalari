public class Timer {
    private ClockHand saniye100 ;
    private ClockHand saniye;

    public Timer(){
        this.saniye100 = new ClockHand(100);
        this.saniye = new ClockHand(60);
    }

    public void advance() {
        this.saniye100.advance();

        if (this.saniye100.value() == 0){
            this.saniye.advance();
        }
    }
     public String toString() {
        return this.saniye.toString() + " : " + this.saniye100.toString();
     }

     public static void main(String[] args) {
        Timer timer = new Timer();

        while(true){
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch(Exception e){

            }
        }
     }
}
