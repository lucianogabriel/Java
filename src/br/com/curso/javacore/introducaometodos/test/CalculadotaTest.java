package br.com.curso.javacore.introducaometodos.test;

import br.com.curso.javacore.introducaometodos.classes.Calculadora;

public class CalculadotaTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        System.out.println("Continuando a Execução do código");
        calc.subtraiDoisNumeros();
        System.out.println("Continuando a Execução do código");
        calc.multiplicaDoisNumeros(16,2);
        System.out.println("Continuando a Execução do código");
        double result = calc.divideDoisNumeros( 525, 5);
        System.out.println(result);
        System.out.println("Fim da execução");

    }
}
