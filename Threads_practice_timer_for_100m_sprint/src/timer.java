public class timer {

    public static void main(String[] args) {

        Thread t1 = new Thread(new athlete("Bolt"));
        Thread t2 = new Thread(new athlete("Gatlin"));
        Thread t3 = new Thread(new athlete("De Grasse"));
        Thread t4 = new Thread(new athlete("Blake"));
        Thread t5 = new Thread(new athlete("Simbine"));
        Thread t6 = new Thread(new athlete("Meite"));
        Thread t7 = new Thread(new athlete("Vicaut"));
        Thread t8 = new Thread(new athlete("Bromell"));

        System.out.println("Race starts... /note: they are running, please wait 9-13 seconds/");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();

    }
}
