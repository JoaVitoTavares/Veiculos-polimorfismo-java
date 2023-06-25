package app;

public class Aviao extends Veiculo {

    public Aviao(String nome, Fabricante fabricante, int anoFabricacao, int capacidade) {
        super(nome, fabricante, anoFabricacao, capacidade);
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
        return super.mostrarDetalhes();
    }
}
