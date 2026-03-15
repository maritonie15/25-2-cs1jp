public class Activity7_forloop {
public static void main(String[] args) throws Exception  {
    System.out.println("Loading in Progress:");
for(int num = 1; num <= 10; num++){
    System.out.print("#");   
    Thread.sleep(500); 
}
System.out.println("\nProgress Completed");
}
}
