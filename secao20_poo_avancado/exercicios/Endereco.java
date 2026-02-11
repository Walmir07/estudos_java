package secao20_poo_avancado.exercicios;

public class Endereco {
    
    private String rua;
    private int numero;
    private String cidade;

    public Endereco(String rua, int numero, String cidade){
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getRua(){
        return rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

}
