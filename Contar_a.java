import java.util.Scanner;

public class Contar_a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        scanner.close();

        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {
                contador++;
            }
        }

        System.out.println("La letra 'a' aparece " + contador + " veces en la palabra '" + palabra + "'.");
    }
}

