package app;

public class Aviao extends Veiculo {

    private int numeroTurbinas;
    public Aviao(String nome, Fabricante fabricante, int anoFabricacao, int capacidade, int numeroTurbinas ) {
        super(nome, fabricante, anoFabricacao, capacidade);
        this.numeroTurbinas = this.numeroTurbinas;
    }

    public String decolar(){
        return "O avião decolou";
    }

    public String pousar(){
        return "O avião pousou";
    }

    @Override
    public String acelerar() {
        return "O avião acelerou";
    }

    @Override
    public String mostrarDetalhes() {
        return String.format("O %s %s e possui %d turbinas", nome, super.mostrarDetalhes(), numeroTurbinas);
    }
}
