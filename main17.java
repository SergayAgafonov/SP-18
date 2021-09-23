import java.util.Scanner;
public class main17 {
    static int multiply(int x, int y) {
        /* 0, умноженное на что-либо, дает 0 */
        if (y == 0)
            return 0;

        /* Добавить х по одному */

        if (y > 0)
            return (x + multiply(x, y - 1));


        /* случай, когда у отрицателен */
        if (y < 0)

            return -multiply(x, -y);

        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1 множитель");
        int x1 = scan.nextInt();
        System.out.println("Введите 2 множитель");
        int x2 = scan.nextInt();


        System.out.print("\n" + multiply(x1, x2));

    }
}