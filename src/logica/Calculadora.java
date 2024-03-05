package logica;

public class Calculadora {

    public static double dividir(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return num1 / num2;
    }

    public static long factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("No se permite el factorial de un número negativo");
        }
        
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
            
           
            if (resultado < 0) {
                throw new IllegalArgumentException("Factorial excede la capacidad de tipo long");
            }
        }
        return resultado;
    }

    public static long combinatoria(int n, int r) throws IllegalArgumentException {
        if (n < 0 || r < 0 || r > n) {
            throw new IllegalArgumentException("Combinatoria no válida: n debe ser mayor o igual a r, y ambos deben ser no negativos");
        }
        
        
        long result = 1;
        for (int i = 1; i <= r; i++) {
            result *= n - i + 1;
            result /= i;
        }
        return result;
    }
}
