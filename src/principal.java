import java.io.IOException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner valores = new Scanner(System.in);
        conversion conversion = monedas.obtenerConversion();

        int opcion = 0;

        while (opcion != 7) {
            System.out.println("\n--- Conversor de monedas ---");
            System.out.println(" 1. Dólar → Peso Argentino");
            System.out.println(" 2. Peso Argentino → Dólar");
            System.out.println(" 3. Dólar → Real Brasileño");
            System.out.println(" 4. Real Brasileño → Dólar");
            System.out.println(" 5. Dólar → Peso Colombiano");
            System.out.println(" 6. Peso Colombiano → Dólar");
            System.out.println(" 7. Salir");
            System.out.print("Elija una opción: ");
            opcion = valores.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Digite el valor en Dólares: ");
                    double usd = valores.nextDouble();
                    double ars = usd * conversion.getArs();
                    System.out.println("Equivale a: " + ars + " Pesos Argentinos");
                    break;
                case 2:
                    System.out.print("Digite el valor en Pesos Argentinos: ");
                    double pesosArg = valores.nextDouble();
                    double aUsd = pesosArg / conversion.getArs();
                    System.out.println("Equivale a: " + aUsd + " Dólares");
                    break;
                case 3:
                    System.out.print("Digite el valor en Dólares: ");
                    double usd2 = valores.nextDouble();
                    double brl = usd2 * conversion.getBrl();
                    System.out.println("Equivale a: " + brl + " Reales Brasileños");
                    break;
                case 4:
                    System.out.print("Digite el valor en Reales Brasileños: ");
                    double real = valores.nextDouble();
                    double dReal = real / conversion.getBrl();
                    System.out.println("Equivale a: " + dReal + " Dólares");
                    break;
                case 5:
                    System.out.print("Digite el valor en Dólares: ");
                    double usd3 = valores.nextDouble();
                    double cop = usd3 * conversion.getCop();
                    System.out.println("Equivale a: " + cop + " Pesos Colombianos");
                    break;
                case 6:
                    System.out.print("Digite el valor en Pesos Colombianos: ");
                    double pc = valores.nextDouble();
                    double dCop = pc / conversion.getCop();
                    System.out.println("Equivale a: " + dCop + " Dólares");
                    break;
                case 7:
                    System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        valores.close();
    }
}
