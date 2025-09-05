import java.util.Scanner;

public class Subset_sum {
    public static boolean existeSubconjunto(int[] nums, int n, int target) {
        if (target == 0) return true;
        if (n == 0 && target != 0) return false;
        if (nums[n - 1] > target) return existeSubconjunto(nums, n - 1, target);
        return existeSubconjunto(nums, n - 1, target) ||
                existeSubconjunto(nums, n - 1, target - nums[n - 1]);
    }

    public static void ejecutar(Scanner sc) {
        System.out.print("¿Cuántos números tendrá el conjunto? ");
        int size = sc.nextInt();
        int[] set = new int[size];

        System.out.println("Ingresa los números del conjunto:");
        for (int i = 0; i < size; i++) {
            set[i] = sc.nextInt();
        }

        System.out.print("Ingresa el valor objetivo: ");
        int target = sc.nextInt();

        if (existeSubconjunto(set, set.length, target)) {
            System.out.println("¡Existe un subconjunto cuya suma es " + target + "!");
        } else {
            System.out.println("No existe ningún subconjunto con esa suma.");
        }
    }
}