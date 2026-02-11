package secao20_poo_avancado.exercicios;

public class FuncionarioTempoIntegral extends Funcionario implements Beneficios{

    public FuncionarioTempoIntegral(String nome){
        super(nome);
    }
    
    @Override
    public double calcularSalario(double salario, double bonus){
        return salario *= bonus * 0.10;
    }

    @Override
    public double adicionarBeneficio(double salario){
        return salario * .30;
    }; 

}
