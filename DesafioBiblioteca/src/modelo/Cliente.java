package modelo;

public class Cliente {
	String nombre;
	String rut;
	String passw;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getPassw() {
		return passw;
	}
	public void setPassw(String passw) {
		this.passw = passw;
	}
	public Cliente(String nombre, String rut, String passw) {
		super();
		this.nombre = nombre;
		this.rut = rut;
		this.passw = passw;
	}

}
