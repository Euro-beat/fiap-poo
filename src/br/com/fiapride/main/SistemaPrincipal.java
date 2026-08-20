package br.com.fiapride.main;

import br.com.fiapride.model.Cavalo;

public class SistemaPrincipal {

    public static void main(String[] args) {
        
        Cavalo pePano = new Cavalo();
        Cavalo tempestade = new Cavalo();

        //-----------------------------------------------------------

        pePano.setRaca("Mangalarga Paulista");
        pePano.setSexo('F');
        pePano.setSelvagem(false);

        tempestade.setRaca("Árabe");
        tempestade.setSexo('M');

        //-----------------------------------------------------------

        System.out.println("Cansaço pePano: "+ pePano.isCansado());
        System.out.println("Cansaço tempestade: "+ tempestade.isCansado());

        System.out.print("\n");

        System.out.print("pePano: ");
        pePano.galopar();
        System.out.print("tempestade: ");
        tempestade.galopar(); //demonstra que a validação do cansaço é exclusiva para cada objeto chamado (pePano.cansado != tempestade.cansado)

        System.out.print("\n");

        System.out.print("pePano descansa: ");
        pePano.relinchar();
        System.out.print("tempestade tenta de novo: ");
        tempestade.galopar();

        System.out.print("\n");

        System.out.print("pePano descansa de novo: ");
        pePano.relinchar();
        System.out.print("tempestade enfim descansa: ");
        tempestade.relinchar();

    }
}
