package app;

public class Barco extends Veiculo {

    private int numeroVelas;

    public Barco(String nome, Fabricante fabricante, int anoFabricacao, int capacidade, int numeroVelas) {
        super(nome, fabricante, anoFabricacao, capacidade);
        this.numeroVelas = numeroVelas;
    }

    public int getNumeroVelas() {
        return numeroVelas;
    }

    public void setNumeroVelas(int numeroVelas) {
        this.numeroVelas = numeroVelas;
    }

    public String icarVelas()
    {
        return "O barco está com as velas içadas";
    }

    public String recolherVelas()
    {
        return "O barco está com as velas recolhidas";
    }

    @Override
    public String acelerar() {
        return "O barco acelerou";
    }

    @Override
    public String mostrarDetalhes() {
        return String.format("O %s %s e possui %d velas", nome, super.mostrarDetalhes(), numeroVelas);
    }
}
