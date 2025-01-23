import java.util.Scanner;

public class SALARIO {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar el salario bruto mensual al usuario
        System.out.print("Introduce tu salario bruto mensual: ");
        double salarioBruto = teclado.nextDouble();

        // Solicitar el porcentaje de impuestos al usuario
        System.out.print("Introduce el porcentaje de impuestos: ");
        double porcentajeImpuestos = teclado.nextDouble();

        // Solicitar las deducciones adicionales al usuario
        System.out.print("Introduce las deducciones adicionales: ");
        double deduccionesAdicionales = teclado.nextDouble();

        // Calcular el impuesto
        double impuesto = salarioBruto * (porcentajeImpuestos / 100);

        // Calcular el salario neto
        double salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;

        // Mostrar el resultado
        System.out.println("Tu salario neto es: " + salarioNeto);
    }
}

