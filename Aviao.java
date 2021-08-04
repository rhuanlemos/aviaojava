public class Aviao {
    private String nomeVoo;
    private int quantidadePassageiros, quantidadeMaxima;
    private String estado;

    public Aviao(int quantidadeMaxima){
        this.quantidadeMaxima = quantidadeMaxima;
        this.estado = "p";

    }

    public void Decolar(){
        if(this.estado.equals("p")){
            this.estado = "v";
        }else{
            System.out.println("Não é permitido decolar.");
        }
    }

    public void Pousar(){
        if(this.estado.equals("v")){
            this.estado = "p";
        }else{
            System.out.println("Não é permitido pousar");
        }
    }

    public String getNomeVoo(){
        return this.nomeVoo;
    }

    public String getEstado(){
        return this.estado;
    }

    public int getQuantidadePassageiros(){
        return this.quantidadePassageiros;
    }

    public void setNomeVoo(String novoVoo){
        if(!novoVoo.trim().equals("")){
            this.nomeVoo = novoVoo;
        }else{
            System.out.println("Nome inválido.");
        }
    }

    public void setQuantidadeMaxima(int max){
        if(max <= 0){
            if(max < this.quantidadeMaxima){
                this.quantidadeMaxima = max;
            }else{
                System.out.println("Quantidade máxima excedida.");
            }
        }
    }

    public int getQuantidadeMaxima(){
        return this.quantidadeMaxima;
    }

    public void embarcar(){
        if(estado.equals("p")){
            if(this.quantidadePassageiros < this.quantidadeMaxima){
                this.quantidadePassageiros += 1;
                System.out.println("Passageiro embarcado.");
            }else{
                System.out.println("Quantidade máxima excedida");
            }
        }else{
            System.out.println("Não é possivel embarcar, o avião já decolou.");
        }
    }

    public void desembarcar(){
        if(estado.equals("p")){
            if(this.quantidadePassageiros > 0){
                this.quantidadePassageiros -=1;
                System.out.println("Passageiro desembarcado.");

            }else{
                System.out.println("Todos os passageiros já desembarcaram.");
            }
        }else{
            System.out.println("Não é possível desembarcar, o avião já decolou.");
        }
    }
}
