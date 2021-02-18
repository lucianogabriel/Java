package br.com.curso.javacore.introducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(5+4);
    }

    public void subtraiDoisNumeros(){
        System.out.println(8-3);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros(double num1, double num2){

        //System.out.println(num1 / num2);
        return num1 / num2;
    }

}
