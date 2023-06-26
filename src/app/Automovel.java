package app;

public class Automovel extends Veiculo {

    private int diametroRoda;

    public int getDiametroRoda() {
        return diametroRoda;
    }

    public void setDiametroRoda(int diametroRoda) {
        this.diametroRoda = diametroRoda;
    }


    public Automovel(String nome, Fabricante fabricante, int anoFabricacao, int capacidade, int diametroRoda) {
        super(nome, fabricante, anoFabricacao, capacidade);
        this.diametroRoda = diametroRoda;
    }

    @Override
    public String acelerar() {
        return "O carro acelerou";
    }

    @Override
    public String mostrarDetalhes() {
        return String.format("O %s %s e possui roda de diametro de: %d cm", nome,super.mostrarDetalhes(), getDiametroRoda());

    }

    public String abrirPortaMalas() {
       return "O porta malas do carro foi aberto";
    }

}
