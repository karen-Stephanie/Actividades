import java.util.Scanner;

public class Letras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la calificación numérica del usuario
        System.out.print("Ingresa la calificación numérica: ");
        int calificacion = scanner.nextInt();
        
        char letra;

        // Evaluar la calificación y asignar la letra correspondiente
        if (calificacion >= 90 && calificacion <= 100) {
            letra = 'A';
        } else if (calificacion >= 80 && calificacion < 90) {
            letra = 'B';
        } else if (calificacion >= 70 && calificacion < 80) {
            letra = 'C';
        } else if (calificacion >= 60 && calificacion < 70) {
            letra = 'D';
        } else if (calificacion < 60) {
            letra = 'F';
        } else {
            System.out.println("Calificación fuera de rango. Por favor ingresa una calificación entre 0 y 100.");
            return;
        }

        // Imprimir la calificación en letra
        System.out.println("La calificación en letra es: " + letra);

      
    }
}
