import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("-----------LOOPING PRB-------------");
        System.out.println("Enter the X value to be Printed:");
        int x = scan.nextInt();
        System.out.println("Enter the Iteration number for X:");
        int y = scan.nextInt();
        System.out.println("----------------------------------");
        for (int i=0;i<y;i++){
                System.out.println(x);
        }


    }
}
