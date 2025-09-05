import java.util.Scanner;

public class Fibonacci {
    public static int calcular(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return calcular(n - 1) + calcular(n - 2);
    }
        public static void ejecutar(Scanner sc) {
            System.out.print("Ingresa n para Fibonacci: ");
            int n = sc.nextInt();
            System.out.println("Fibonacci de " + n + " es: " + calcular(n));
        }
}
