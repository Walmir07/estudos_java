package secao20_poo_avancado.exercicios;

abstract class Funcionario {

    protected String nome;

    public Funcionario(String nome){
        this.nome = nome;
    }

    public abstract double calcularSalario(double salario, double bonus);
    
}
