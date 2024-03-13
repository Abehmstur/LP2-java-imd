package meu.modelo;

public class Aluno{
    private Prova prova1;
    private Prova prova2;

    public Aluno(){
        prova1.setNotaParte1(0.0);
        prova1.setNotaParte2(0.0);

        prova2.setNotaParte1(0.0);
        prova2.setNotaParte2(0.0);
    }

    public double calcularMedia(){
        double media;
        double somaNotas;

        somaNotas = prova1.calcularNotaTotal() + prova2.calcularNotaTotal();
        
        media = (somaNotas/2);
        
        return media;
    }

    public void setProva1(Prova prova1){
        this.prova1 = prova1;
    }

    public void setProva2(Prova prova2){
        this.prova2 = prova2;
    }

    public Prova getProva1(){
        return this.prova1;
    }

    public Prova getProva2(){
        return this.prova2;
    }
}