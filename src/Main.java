import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE PROBLEMAS ===");
            System.out.println("1. Serie de Fibonacci");
            System.out.println("2. Subset Sum");
            System.out.println("3. Resolver Sudoku");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Fibonacci.ejecutar(sc);
                    break;
                case 2:
                    Subset_sum.ejecutar(sc);
                    break;
                case 3:
                    sudoku.ejecutar();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);
    }
}