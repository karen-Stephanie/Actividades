import java.util.Scanner;

public class conversormonedas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad en pesos mexicanos
        System.out.print("Ingresa la cantidad en pesos mexicanos (MXN): ");
        double pesos = scanner.nextDouble();

        // Mostrar el menú de opciones
        System.out.println("Selecciona la moneda a la que deseas convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        // Tasas de cambio ejemplo (deben actualizarse según las tasas actuales)
        double tasaUSD = 0.050; // 1 MXN a USD
        double tasaEUR = 0.045; // 1 MXN a EUR
        double tasaTHB = 1.50;  // 1 MXN a THB
        double tasaJPY = 5.60;  // 1 MXN a JPY
        double tasaKRW = 55.00; // 1 MXN a KRW
        double tasaAUD = 0.070; // 1 MXN a AUD
        double tasaPEN = 0.19;  // 1 MXN a PEN
        double tasaCAD = 0.065; // 1 MXN a CAD
        double tasaVES = 20.00; // 1 MXN a VES
        double tasaARS = 5.00;  // 1 MXN a ARS

        double resultado;

        // Realizar la conversión según la opción seleccionada
        switch (opcion) {
            case 1:
                resultado = pesos * tasaUSD;
                System.out.printf("La cantidad en Dólares (USD) es: %.2f%n", resultado);
                break;
            case 2:
                resultado = pesos * tasaEUR;
                System.out.printf("La cantidad en Euros (EUR) es: %.2f%n", resultado);
                break;
            case 3:
                resultado = pesos * tasaTHB;
                System.out.printf("La cantidad en Baths (THB) es: %.2f%n", resultado);
                break;
            case 4:
                resultado = pesos * tasaJPY;
                System.out.printf("La cantidad en Yenes (JPY) es: %.2f%n", resultado);
                break;
            case 5:
                resultado = pesos * tasaKRW;
                System.out.printf("La cantidad en Wones (KRW) es: %.2f%n", resultado);
                break;
            case 6:
                resultado = pesos * tasaAUD;
                System.out.printf("La cantidad en Dólares Australianos (AUD) es: %.2f%n", resultado);
                break;
            case 7:
                resultado = pesos * tasaPEN;
                System.out.printf("La cantidad en Soles (PEN) es: %.2f%n", resultado);
                break;
            case 8:
                resultado = pesos * tasaCAD;
                System.out.printf("La cantidad en Dólares Canadienses (CAD) es: %.2f%n", resultado);
                break;
            case 9:
                resultado = pesos * tasaVES;
                System.out.printf("La cantidad en Bolívares (VES) es: %.2f%n", resultado);
                break;
            case 10:
                resultado = pesos * tasaARS;
                System.out.printf("La cantidad en Pesos Argentinos (ARS) es: %.2f%n", resultado);
                break;
            default:
                System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 10.");
                break;
        }

        scanner.close();
    }
}
}
