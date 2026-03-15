public class Activity7_whileloop {
public static void main(String[] args) throws Exception {
    int num = 10;
    System.out.println("Countdown Begins: ");
    while ( num >= 0){
        System.out.println(num + " seconds remaining..");
        num = num - 1;
        Thread.sleep(500);
    }
        System.out.println("Lift-off!");
}
}