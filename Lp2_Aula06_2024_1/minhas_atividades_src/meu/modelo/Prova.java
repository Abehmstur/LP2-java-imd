package meu.modelo;


public class Prova{
    private double notaParte1;
    private double notaParte2;

    public Prova(){
        notaParte1 = 0.0;
        notaParte2 = 0.0;
    }

    public double calcularNotaTotal(){
        double soma = 0.0;
        soma = soma + this.notaParte1 + this.notaParte2;
        
        if (soma > 10){
            soma = 10.0;
        }
        
        return soma;
    }

    public void setNotaParte1(double nota){
        this.notaParte1 = nota;
    }

    public double getNotaParte1(){
        return this.notaParte1;
    }

    public void setNotaParte2(double nota){
        this.notaParte2 = nota;
    }

    public double getNotaParte2(){
        return this.notaParte2;
    }
}