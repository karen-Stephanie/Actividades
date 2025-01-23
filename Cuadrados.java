import java.util.Scanner;

public class Cuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();
        scanner.close();

        int contador = 1;
        System.out.println("Cuadrados de los números desde 1 hasta " + numero + ":");

        do {
            System.out.println("El cuadrado de " + contador + " es " + (contador * contador));
            contador++;
        } while (contador <= numero);
    }
}
