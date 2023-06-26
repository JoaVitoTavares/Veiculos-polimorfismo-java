import app.Automovel;
import app.Aviao;
import app.Fabricante;
import app.Barco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        Fabricante fabricanteCarro = new Fabricante("Gurgel", "Brasil");
        Fabricante fabricanteCarro2 = new Fabricante("Toyota", "Japão");

        Fabricante fabricanteAviao = new Fabricante("ACS Aviation", "Brasil" );
        Fabricante fabricanteAviao2 = new Fabricante("The Boeing Company", "Estados Unidos" );

        Fabricante fabricanteBarco = new Fabricante("Volvo", "Suécia");
        Fabricante fabricanteBarco2 = new Fabricante("Beneteau Group", "França");

        Automovel automovel1 = new Automovel("supermini", fabricanteCarro, 1992, 5, 15);
        Automovel automovel2 = new Automovel("Toyota Camry", fabricanteCarro2, 1982, 5, 18);

        Aviao aviao1 = new Aviao("ACS-100 Sora", fabricanteAviao, 2008, 2, 0);
        Aviao aviao2 = new Aviao("ACS-100 Sora", fabricanteAviao2, 2011, 410, 4);

        Barco barco1 = new Barco ("Z380 Open", fabricanteBarco, 2018, 15, 1);
        Barco barco2 = new Barco ("Beneteau Oceanis 45", fabricanteBarco2, 2012, 8, 1);

                    System.out.println(automovel1.mostrarDetalhes());
                    System.out.println(automovel2.mostrarDetalhes());
                    System.out.println(aviao1.mostrarDetalhes());
                    System.out.println(aviao2.mostrarDetalhes());
                    System.out.println(barco1.mostrarDetalhes());
                    System.out.println(barco2.mostrarDetalhes());

                    System.out.println(automovel1.acelerar());
                    System.out.println(barco1.acelerar());
                    System.out.println(aviao1.acelerar());

                    System.out.println(automovel1.abrirPortaMalas());

                    System.out.println(aviao1.decolar());

                    System.out.println(aviao1.pousar());

                    System.out.println(barco1.icarVelas());

                    System.out.println(barco1.recolherVelas());


    }
}