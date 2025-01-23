import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la temperatura en grados Celsius
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Mostrar el menú de opciones
        System.out.println("Selecciona la conversión:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        // Realizar la conversión según la opción seleccionada
        switch (opcion) {
            case 1:
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.printf("La temperatura en Fahrenheit es: %.2f°F%n", fahrenheit);
                break;
            case 2:
                double kelvin = celsius + 273.15;
                System.out.printf("La temperatura en Kelvin es: %.2fK%n", kelvin);
                break;
            default:
                System.out.println("Opción no válida. Por favor, selecciona 1 o 2.");
                break;
        }

        scanner.close();
    }
}

