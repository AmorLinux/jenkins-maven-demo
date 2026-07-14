package org.example;

public class App {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("2 + 3 = " + calc.sumar(2, 3));
        System.out.println("¿Es 7 primo? " + calc.esPrimo(7));
    }
}
