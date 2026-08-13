package br.com.fiapride.main;

import br.com.fiapride.model.Cavalo;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		Cavalo cavalo1 = new Cavalo();
		cavalo1.raca = "Mangalarga Paulista";
		cavalo1.sexo = 'F';
		cavalo1.selvagem = true;
		
		System.out.println("Cavalo1: " + cavalo1.raca + " | " + cavalo1.sexo + " | " + cavalo1.selvagem);

	}

}