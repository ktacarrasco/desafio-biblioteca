package main;

import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.Menu;

/**
 * Kta.carrasco
 *
 */
public class MainBiblio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Cliente> listacliente = new ArrayList<Cliente>(); // vacio
		listacliente.add(new Cliente("6789","catalina", "1234"));
		
		if (Menu.MenuClave(listacliente)==true) {
			
			Menu.MenuInicio(cliente, tc, cta);nicio(listacliente);
			
		}
		else
			System.out.println("no se logrado iniciar sesión")
	}

}
