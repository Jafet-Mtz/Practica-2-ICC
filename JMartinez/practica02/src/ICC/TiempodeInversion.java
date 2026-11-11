import java.util.Scanner;

/*
*Clase principal para simular una inversion
*
*@author Jafet Martinez Jose 
*@version 1.0
*@date 13 de Noviembre del 2026
*/

public class TiempodeInversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "si";

        // Ciclo para permitir repetir la simulación
        while (continuar.toLowerCase().startsWith("s")) {
            // Bienvenida y nombre
            System.out.print("Ingrese el nombre del inversionista: ");
            String nombreInversionista = scanner.nextLine();

            // Saludo y monto
            System.out.print("Monto a invertir ($): ");
            double monto = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer

            // Fecha inicio
            System.out.println("Ingrese la fecha de inicio (día, mes, año):");
            int dInicio = scanner.nextInt();
            int mInicio = scanner.nextInt();
            int aInicio = scanner.nextInt();
            scanner.nextLine();
            Fecha fechaInicio = new Fecha(dInicio, mInicio, aInicio);

            // Fecha fin
            System.out.println("Ingrese la fecha de fin (día, mes, año):");
            int dFin = scanner.nextInt();
            int mFin = scanner.nextInt();
            int aFin = scanner.nextInt();
            scanner.nextLine();
            Fecha fechaFin = new Fecha(dFin, mFin, aFin);

            // Cálculos (días y rendimiento al 12%)
            int diasInversion = fechaInicio.diferenciaDias(fechaFin);
            double rendimiento = monto * 0.12 * ((double) diasInversion / 365.0);

            // Resultados en pantalla (versión básica sin printf)
            System.out.println("\n--- RESUMEN DE LA SIMULACIÓN ---");
            System.out.println("Inversionista: " + nombreInversionista);
            System.out.println("Fecha de Inicio: " + fechaInicio);
            System.out.println("Fecha de Fin:    " + fechaFin);
            System.out.println("Días de inversión: " + diasInversion);
            System.out.println("Rendimiento (12%): $" + rendimiento);
            System.out.println("Monto total:       $" + (monto + rendimiento));
            System.out.println("--------------------------------");

            // Preguntar si desea repetir
            System.out.print("¿Desea hacer otra simulación? (si/no): ");
            continuar = scanner.nextLine();
            System.out.println();
        }

        System.out.println("¡Gracias por utilizar el sistema de inversión!");
        scanner.close();
    }
}
