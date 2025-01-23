import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();
        scanner.close();

        int contador = 1;
        System.out.println("Números impares desde 1 hasta " + numero + ":");

        do {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
            contador++;
        } while (contador <= numero);
    }
}
