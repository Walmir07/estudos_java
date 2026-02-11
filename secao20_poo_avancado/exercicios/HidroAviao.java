package secao20_poo_avancado.exercicios;

public class HidroAviao extends Barco implements Navegavel, Pilotavel {
    
    public void operarVeiculo(String acao){
        System.out.println("Digite a ação: Navegar ou Pilotar");
        if(acao.equals("Navegar")){
            //System.out.println(navegar());
        } else {
            //System.out.println(pilotar());
        }
    }

}
