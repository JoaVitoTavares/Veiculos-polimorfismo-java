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
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public Fabricante getFabricante() {
        return super.getFabricante();
    }

    @Override
    public void setFabricante(Fabricante fabricante) {
        super.setFabricante(fabricante);
    }

    @Override
    public int getAnoFabricacao() {
        return super.getAnoFabricacao();
    }

    @Override
    public void setAnoFabricacao(int anoFabricacao) {
        super.setAnoFabricacao(anoFabricacao);
    }

    @Override
    public int getCapacidade() {
        return super.getCapacidade();
    }

    @Override
    public void setCapacidade(int capacidade) {
        super.setCapacidade(capacidade);
    }

    @Override
    public void acelerar() {
        super.acelerar();
    }

    @Override
    public String mostrarDetalhes() {
        return String.format("%s e possui roda de diametro de: %d", super.mostrarDetalhes(), getDiametroRoda());

    }

    public String abrirPortaMalas() {
       return "abrir portar malas";
    }

}
