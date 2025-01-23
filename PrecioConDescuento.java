import java.util.Scanner;

public class PrecioConDescuento {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Definir variables
        double precio, precioFinal;
        double descuento = 0;
        
        // Solicitar al usuario que ingrese el precio original
        System.out.print("Ingresa el precio original del producto: ");
        precio = scanner.nextDouble();
        
        // Calcular el descuento según el precio
        if (precio <= 100) {
            descuento = 0; // Sin descuento
        } else if (precio > 100 && precio <= 200) {
            descuento = 0.10; // 10% de descuento
        } else if (precio > 200 && precio <= 500) {
            descuento = 0.20; // 20% de descuento
        } else {
            descuento = 0.25; // 25% de descuento
        }
        
        // Calcular el precio final con el descuento aplicado
        precioFinal = precio - (precio * descuento);
        
        // Mostrar el precio final
        System.out.println("El precio final después del descuento es: " + precioFinal);
        
        // Cerrar el scanner
        scanner.close();
    }
}