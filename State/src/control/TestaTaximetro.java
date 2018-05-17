package control;

import model.Bandeira;
import model.Bandeira1;
import model.Bandeira2;
import model.Taximetro;

public class TestaTaximetro {
	
	public static void main(String[] args) {
	
		Bandeira b1 = new Bandeira1();
		Bandeira b2 = new Bandeira2();

		Taximetro taximetro = new Taximetro(b1);

		double valor1 = taximetro.calculaValorDaCorrida(10, 20);
		System.out.println(" Valor da corrida em bandeira 1: " + valor1);

		taximetro.setBandeira(b2);

		double valor2 = taximetro.calculaValorDaCorrida(5, 30);
		System.out.println(" Valor da corrida em bandeira 2: " + valor2);
	}
}
