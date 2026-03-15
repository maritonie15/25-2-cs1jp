public class Activity5 {
    public static void main(String[] args){

        int pr = 90;
        int e =  97;
        int f = 95;
        int s = 95;
        int m = 98;
        int pe = 95;
        int fg = pr + e + f + s + m + pe;
        float gwa = fg / 6; 
        System.out.println("Student Grading System ");
        System.out.println("\nProgramming: " + pr);
        System.out.println("English: " + e);
        System.out.println("Filipino: " + f);
        System.out.println("Science: " + s);
        System.out.println("Math: " + m);
        System.out.println("PE: " + pe);
        System.out.println("\nFinal Grade(GWA): " + gwa);

        if(gwa >= 98 && gwa <= 100) {
        System.out.println("With Highest Honors");
        }else if(gwa >= 95){
            System.out.println("With High Honors");
        }else if(gwa >= 90){
            System.out.println("With Honors");
        }else{
            System.out.println("No Honors");
        }
    }
}