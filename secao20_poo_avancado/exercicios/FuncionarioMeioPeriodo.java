package secao20_poo_avancado.exercicios;

public class FuncionarioMeioPeriodo extends Funcionario implements Beneficios {

    public FuncionarioMeioPeriodo(String nome){
        super(nome);
    }
    
    @Override
    public double calcularSalario(double salario, double bonus){
        return salario *= bonus;
    }

    @Override
    public double adicionarBeneficio(double salario){
        return salario * .15;
    }; 

}
