import java.util.Scanner;

public class Informacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre de la película
        System.out.print("Ingresa el nombre de una película de Sylvester Stallone: ");
        String pelicula = scanner.nextLine();

        // Convertir el nombre de la película a minúsculas para facilitar la comparación
        pelicula = pelicula.toLowerCase();

        // Proporcionar información sobre la película elegida
        switch (pelicula) {
            case "rocky":
                System.out.println("Rocky (1976): Sylvester Stallone interpreta a Rocky Balboa, un boxeador de Filadelfia que tiene la oportunidad de luchar por el título de los pesos pesados.");
                break;
            case "rambo":
                System.out.println("Rambo (1982): Sylvester Stallone interpreta a John Rambo, un veterano de la guerra de Vietnam que se enfrenta a una batalla personal en los Estados Unidos.");
                break;
            case "tango & cash":
                System.out.println("Tango & Cash (1989): Sylvester Stallone interpreta a Ray Tango, un detective de narcóticos que se une a su rival, Gabe Cash, para limpiar sus nombres después de ser incriminados.");
                break;
            case "cliffhanger":
                System.out.println("Cliffhanger (1993): Sylvester Stallone interpreta a Gabe Walker, un rescatista de montaña que debe enfrentarse a un grupo de criminales en las altas cumbres.");
                break;
            case "the expendables":
                System.out.println("The Expendables (2010): Sylvester Stallone interpreta a Barney Ross, el líder de un equipo de mercenarios en una misión para derrocar a un dictador latinoamericano.");
                break;
            default:
                System.out.println("Película no encontrada. Por favor, ingresa el nombre de una película válida de Sylvester Stallone.");
                break;
        }

        scanner.close();
    }