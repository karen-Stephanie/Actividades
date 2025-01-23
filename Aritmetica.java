import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número de la secuencia: ");
        int primerNumero = scanner.nextInt();
        
        System.out.print("Ingresa la diferencia entre los números: ");
        int diferencia = scanner.nextInt();
        
        System.out.print("Ingresa el número máximo hasta el cual la secuencia debe continuar: ");
        int numeroMaximo = scanner.nextInt();
        
        scanner.close();

        int numeroActual = primerNumero;

        System.out.println("Secuencia aritmética:");
        do {
            System.out.println(numeroActual);
            numeroActual += diferencia;
        } while (numeroActual <= numeroMaximo);
    }
}
