package org.example;

public class Calculadora {

    // Code Smell 1: Variable inutil que nunca se usa en ninguna parte
    String variableMala = "hola";

    public int sumar(int a, int b) {
        return a + b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }

    // Code Smell 2: Logica 100% duplicada del método anterior (aunque se llame diferente)
    public int dividirCopiaMala(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }

    public boolean esPrimo(int n) {
        // Code Smell 3: Dejar codigo comentado en produccion
        // System.out.println("Comprobando si es primo...");
        
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
