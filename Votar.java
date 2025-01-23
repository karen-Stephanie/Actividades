import java.util.Scanner;

public class Votar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar la edad del usuario
        System.out.print("Ingresa tu edad: ");
        int edad = teclado.nextInt();

        // Verificar si la edad es mayor o igual a 18
        if (edad >= 18) {
            System.out.println("Tú sí puedes");
        } else {
            System.out.println("Tú no puedes votar");
        }

        
    }
}
