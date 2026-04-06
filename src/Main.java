import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        miniCalculadora calculadora = new miniCalculadora();
        int opcion;

        do {
            System.out.println("\n--- MENÚ CALCULADORA ---");
            System.out.println("1. Calcular Valor Absoluto");
            System.out.println("2. Calcular Raíz Cuadrada");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número: ");
                    double numAbs = teclado.nextDouble();
                    System.out.println("Resultado: " + calculadora.valorAbsoluto(numAbs));
                    break;

                case 2:
                    System.out.print("Introduce un número: ");
                    double numRaiz = teclado.nextDouble();
                    System.out.println("Resultado: " + calculadora.raizCuadrada(numRaiz));
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        teclado.close();
    }

}
