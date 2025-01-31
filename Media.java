import java.util.Scanner;

public class MediaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Ingresa un número positivo (o un número negativo para terminar): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            suma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números positivos ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        scanner.close();
    }
}
