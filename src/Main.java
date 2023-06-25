import app.Automovel;
import app.Fabricante;

public class Main {
    public static void main(String[] args) {

        Fabricante fabricante = new Fabricante("Fiat", "Italia");
        Automovel automovel = new Automovel("Uno", fabricante, 2012, 1200, 30);
        System.out.println(automovel.mostrarDetalhes());

    }
}