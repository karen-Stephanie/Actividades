import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = teclado.nextInt();

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
