package controlador;

import modelo.ImplementacionBD;
import modelo.UsuarioDAO;
import ventanas.VentanaInicial;

public class LoginControlador {
	UsuarioDAO dao = new ImplementacionBD();

	public void visualizarPantalla() {
		VentanaInicial ven = new VentanaInicial();
		ven.setVisible(true);	
	}
}
