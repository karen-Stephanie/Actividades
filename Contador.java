import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        scanner.close();

        int contador = 0;
        int numeroAbsoluto = Math.abs(numero); // Para manejar números negativos

        if (numeroAbsoluto == 0) {
            contador = 1;
        } else {
            while (numeroAbsoluto > 0) {
                numeroAbsoluto /= 10;
                contador++;
            }
        }

        System.out.println("El número " + numero + " tiene " + contador + " dígitos.");
    }
}

