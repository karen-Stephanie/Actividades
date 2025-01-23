import java.util.Scanner;

public class promedio {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
      //Solicitar los tres numeros al usuario
      System.out.printl("Introduce el primer numero: ");
      double num1 = scanner.nextDouble();
    
      System.out.printl("Introduce el segundo numero: ");
      double num2 = scanner.nextDouble();
    
      System.out.printl("Introduce el tercer numero: ");
      double num3 = scanner.nextDouble();
    
      //Calcular el promedio
      double promedio = (num1 + num2 + num3) / 3;

      //Mostrar el resultado 
      System.out.println("El promedio de los tres numero es: " + promedio);
    }
     
}
