package secao20_poo_avancado.exercicios;

public class Pessoa {
    
    public String nome;
    public int idade;
    public Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void exibirInformacoes(){
        System.out.println("Dados pessoais: Nome: " + nome + ", idade: " + idade);
        System.out.println("Endereço: Rua: " + endereco.getRua() + ", número: " + endereco.getNumero() + ", cidade: " + endereco.getCidade());
    }

}
