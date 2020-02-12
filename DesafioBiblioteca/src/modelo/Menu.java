package modelo;

import java.util.List;
import java.util.Scanner;

public class Menu {
	
	
	public static boolean MenuClave(List<Cliente> listacliente) {

		try {
		boolean sesion = true;

		while (sesion) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Bienvenido a  Bibliotekta ");
			System.out.println(" probar programa con este rut " + listacliente.getRut());
			System.out.println("Ingrese su rut sin dv, sin puntos ni guión ");
			String name = sc.next();
			
			if (name.equals(listacliente.getNombre()())) {

				System.out.println("Ingrese su clave, La clave de los productos es numérica de 4 digitos ");
				int pin = sc.nextInt();
				if (pin == listacliente.getPassw()()) {
					System.out.println("clave exitosa");
					sesion = false;
					return true;
//				continue;
				} else
					System.out.println("Su Clave  es incorrecta, vuelva a Iniciar sesión. \n");
			}
			else
				System.out.println(	"Su nombre de usuario es incorrecto o usted no es clliente de Bibliotekta, vuelva a ingresar su rut \n" );
			
		}
		}
			catch(Exception e){
				
				System.out.println(	"No se ha logrado iniciar sesión, vuelva a ingresar su nombre de usuario \n" + e);
		}
		return false;
	}
	
	
	
		
	
	
	

	
	Caso: Reservar correctamente
	Ingrese el código del articulo.
	a5678
	Reserva realizada.

	Caso: Reservar artículo no disponible
	Ingrese su nombre de usuario.
	a
	Ingrese su clave.
	a
	Bienvenido a
	---
	¿Qué desea hacer?
	1- Reservar un articulo
	2- Buscar articulo
	0- Salir
	¿Qué desea hacer?
	1- Reservar un articulo
	2- Buscar articulo
	0- Salir
	2
	Ingrese un nombre para buscar en la lista.
	pr
	Buscando articulos con pr en su nombre
	Libro [paginas=30, imprenta=imprenta, plaxoMaximo=2, nombre=pruebita,
	codigo=a1234, reservado=true]
	Pelicula [duracion=45, calidad=4k, plaxoMaximo=3, nombre=pruebaza,
	codigo=a5678, reservado=false]
	Buqueda finalizada.
	¿Qué desea hacer?
	1- Reservar un articulo
	2- Buscar articulo
	0- Salir
	1
	Ingrese el código del articulo.
	a5678
	Reserva realizada.
	¿Qué desea hacer?
	1- Reservar un articulo
	2- Buscar articulo
	0- Salir
	1
	Ingrese el código del articulo.
	a1234
	El articulo no se encuentra disponible.
public static void MenuInicio() {
		
		boolean sesion = true;
		while (sesion) {
			System.out.println("Bibliotkta\n" + "- - - - - - - - - - -");
		System.out.println("Bienvenido " + cliente.getNombre() );
		System.out.println("Qué deseas hacer ?");
		System.out.println("1- Reservar un articulo\r\n" + "2- Buscar articulo\r\n"
				+ "0- Salir");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
   	switch (x) {

	case 1:
		
		boolean opcta = true;
		while (opcta) {
//			Caso: Buscar artículo
			System.out.println("Bibliotkta\n" + "- - - - - - - - - - -");
			
			Ingrese un nombre para buscar en la lista.
			pr
			Buscando articulos con pr en su nombre
			Libro [paginas=30, imprenta=imprenta, plaxoMaximo=2, nombre=pruebita,
			codigo=a1234, reservado=true]
			Pelicula [duracion=45, calidad=4k, plaxoMaximo=3, nombre=pruebaza,
			codigo=a5678, reservado=false]
			Buqueda finalizada.
		System.out.println("Ingrese un nombre para buscar en la lista");
		if(cliente.getCta().equals(cta.getNumcta())){
			System.out.println("Saldo actual:" + cta.getSaldo() );
			if(cta.getServAdm()== 0) {
				
				System.out.println("No tienes deuda." );
			}
			else
			System.out.println("La deuda de su cuenta es:" + cta.getServAdm() );
		}
		System.out.println("Qué desea hacer ?" );
		if(cta.getSaldo()== 0) {
			
			System.out.println("1. Volver al menu\r\n" + 
					"2. Retirar dinero\r\n" );
		}
		else {
		System.out.println("1. Volver al menu\r\n" + "2. Retirar dinero\r\n" + "3. Pagar mi deuda" );
		}
		int op = sc.nextInt();
		switch(op){
		case 1:
			opcta = false;
			break;
		case 2:
			System.out.println("Cuánto desea retirar ?" + " (0 para cancelar) " );
			int  dinero = sc.nextInt();
			if (dinero==0) {
				break;
			}
			int saldo = cta.getSaldo() - dinero;
			cta.setSaldo(saldo);
			System.out.println("Dinero retirado, volviendo al menú de cuenta corriente. " );
			break;
		case 3:
			if (cta.getSaldo() >= cta.getServAdm() ){
				int saldo2 = cta.getSaldo() - cta.getServAdm() ;
				cta.setSaldo(saldo2);
			System.out.println("Su deuda ha sido pagada, volviendo al menú de cuenta corriente." );
			int s =0;
			cta.setServAdm(s);
			opcta = false;		
			break;
			}
			else {
				System.out.println("Saldo insuficiente, volviendo al menú de cuenta corriente." );
						
				break;
		}
		
		}
		break;
		}
		break;		
		
   	
	case 2:
		
		boolean optc = true;
		int deuda= 	(int) (tc.getSaldo()* 0.05);
		tc.setDeuda(deuda);
		deuda=tc.getSaldo()-deuda;
		while (optc) {
			System.out.println("SafeBank\n" + "- - - - - - - - - - -");

		System.out.println("Tarjeta de credito:" + cliente.getTc() );
		
		if(cliente.getTc().equals(tc.getNumcta())){
			
						
			if(tc.getDeuda()==0) {
				
				System.out.println("Saldo actual:" + deuda + "/" + tc.getSaldo());
				System.out.println("La deuda de su tarjeta de credito es:" + tc.getDeuda());
				System.out.println("No tiene deuda, volviendo al menu principal" );
				optc=false;
			}
			
			if(tc.getDeuda()>=0) {
				
			System.out.println("Saldo actual:" + deuda + "/" + tc.getSaldo());
			System.out.println("La deuda de su tarjeta de credito es:" + tc.getDeuda());
			System.out.println("Qué desea hacer ?" );
			System.out.println("1. Volver al menu\r\n" + "2. Pagar mi deuda\r\n" );
			

		int op = sc.nextInt();
		switch(op){
		case 1:
			optc = false;
			break;
		case 2:
			System.out.println("Cuánto deseas pagar ?");
			System.out.println("1. Deuda completa\r\n" + "2. Otro monto");
			int optc2 = sc.nextInt();
			switch(optc2){
			case 1:
				
				if(tc.getDeuda()==0) {
					System.out.println("No tienes deuda");
					break;
				}
				
				else {
				System.out.println("Ingresa el monto que deseas pagar  (maximo "+ tc.getDeuda()+ ")");
				int  dinero = sc.nextInt();
				if(dinero==tc.getDeuda()) {
					System.out.println("Deuda completa pagada");
					int s=0;
					tc.setDeuda(s);
					break;
				}
				if(dinero>=tc.getDeuda()) {
					System.out.println("excede el maximo");
					break;
				}
				}
				

				
			case 2:
				if(tc.getDeuda() == 0) {
					System.out.println("No tienes deuda");
					break;
				}
				System.out.println("Ingresa el monto que deseas pagar  (maximo "+ tc.getDeuda()+ ")");
				int  dinero = sc.nextInt();
								
				if(dinero>=tc.getDeuda()) {
					System.out.println("excede el maximo");
					break;
				}
				
				if(dinero<=tc.getDeuda()) {
					
					int saldotc=tc.getDeuda()- dinero;
					tc.setDeuda(saldotc);
					
					System.out.println("Se ha reducido tu deuda en "+ dinero + ")");
					break;
				}
				
				
				}
			}
		}	
			}
		}
		
		break;

	case 3:
		
		System.out.println("Datos de tu ejecutivo:  \n");
		System.out.println("Nombre: \n" + cliente.getEjecutivo()+ ", Telefono: " + cliente.getFono() + ", Direccion: " + cliente.getDireccion());
		System.out.println("... Volviendo al menú principal \n");
			
			break;

	case 4:
		
		System.out.printf("ADIOS\n");
		sesion = false;
          continue;

	default:

			System.out.println("Su Opción es incorrecta, elija una opcion del Menú \n");
	
			break;
		}
		
		}
	}
}


	
}
