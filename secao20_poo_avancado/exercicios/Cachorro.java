package secao20_poo_avancado.exercicios;

public class Cachorro extends Animal {
    
    public String raca;

    public Cachorro(String nome, String som, String raca){
        super(nome, som);
        this.raca = raca;
    }

    public void exibirDetalhes(){
        System.out.println("Informações do cachorro:");
        System.out.println("Nome: " + nome + ", som: " + som + ", raça: " + raca);
    }

}
