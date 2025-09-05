public class sudoku {
    private static final int N = 9;

    private static boolean esValido(int[][] tablero, int fila, int col, int num) {
        for (int x = 0; x < N; x++) {
            if (tablero[fila][x] == num) return false;
            if (tablero[x][col] == num) return false;
        }
        int startRow = fila - fila % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[startRow + i][startCol + j] == num) return false;
            }
        }
        return true;
    }

    private static boolean resolver(int[][] tablero) {
        for (int fila = 0; fila < N; fila++) {
            for (int col = 0; col < N; col++) {
                if (tablero[fila][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (esValido(tablero, fila, col, num)) {
                            tablero[fila][col] = num;
                            if (resolver(tablero)) return true;
                            tablero[fila][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static void imprimir(int[][] tablero) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ejecutar() {
        int[][] tablero = {
                {0, 0, 0, 2, 6, 0, 7, 0, 1},
                {6, 8, 0, 0, 7, 0, 0, 9, 0},
                {1, 9, 0, 0, 0, 4, 5, 0, 0},
                {8, 2, 0, 1, 0, 0, 0, 4, 0},
                {0, 0, 4, 6, 0, 2, 9, 0, 0},
                {0, 5, 0, 0, 0, 3, 0, 2, 8},
                {0, 0, 9, 3, 0, 0, 0, 7, 4},
                {0, 4, 0, 0, 5, 0, 0, 3, 6},
                {7, 0, 3, 0, 1, 8, 0, 0, 0}
        };

        System.out.println("=== Sudoku sin resolver ===");
        imprimir(tablero);

        if (resolver(tablero)) {
            System.out.println("\n=== Sudoku resuelto ===");
            imprimir(tablero);
        } else {
            System.out.println("No se puede resolver el Sudoku");
        }
    }
}
