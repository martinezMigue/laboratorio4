package presentacion;

import java.util.Scanner;

import logica.Calculadora;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("1. División");
        System.out.println("2. Factorial");
        System.out.println("3. Combinatoria");
        System.out.print("Seleccione la operación (1/2/3): ");

        int opcion = scanner.nextInt();

        try {
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = scanner.nextDouble();
                    double resultadoDivision = Calculadora.dividir(num1, num2);
                    System.out.println("División: " + resultadoDivision);
                    break;

                case 2:
                    System.out.print("Ingrese un número para calcular el factorial: ");
                    int numFactorial = scanner.nextInt();
                    long resultadoFactorial = Calculadora.factorial(numFactorial);
                    System.out.println("Factorial de " + numFactorial + ": " + resultadoFactorial);
                    break;

                case 3:
                    System.out.print("Ingrese n para la combinatoria (nCr): ");
                    int n = scanner.nextInt();
                    System.out.print("Ingrese r para la combinatoria (nCr): ");
                    int r = scanner.nextInt();
                    long resultadoCombinatoria = Calculadora.combinatoria(n, r);
                    System.out.println("Combinatoria (" + n + "C" + r + "): " + resultadoCombinatoria);
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } catch (ArithmeticException | IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
