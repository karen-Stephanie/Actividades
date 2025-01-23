import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el peso del usuario
        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        // Solicitar la altura del usuario
        System.out.print("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);

        // Mostrar el resultado
        System.out.println("Tu Índice de Masa Corporal (IMC) es: " + imc);
    }
}
