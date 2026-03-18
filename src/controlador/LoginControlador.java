package controlador;

import modelo.ImplementacionBD;
import modelo.UsuarioDAO;
import ventanas.VentanaLogin;

public class LoginControlador {
	UsuarioDAO dao = new ImplementacionBD();

	public void visualizarPantalla() {
		VentanaLogin ven = new VentanaLogin(this);
		ven.setVisible(true);	
	}
}
