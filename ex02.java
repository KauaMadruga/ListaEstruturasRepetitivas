import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("O ponto está em Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("O ponto está em Q2");
            } else if (x < 0) {
                System.out.println("O ponto está em Q3");
            } else {
                System.out.println("O ponto está em Q4");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
