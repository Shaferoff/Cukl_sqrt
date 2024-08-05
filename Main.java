import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double x, y;
        int i;
        for (i=1; i<4; i++) {
            x = sc.nextDouble();
            if (x>=0){
                y = Math.sqrt(x);
                System.out.println("Квадратный корень "+x+" равен "+y);
            }
            else
                System.out.println("Нельзя извлечь квадратный корень!");
        }
    }
}