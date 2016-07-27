package trabajo.servicios;

public class ServicioLogin {

	public String verificar(String usuario, String contraseña) {
		if (("edigra".equalsIgnoreCase(usuario))
				&& ("edigra12".equals(contraseña))) {
			return "success";
		} else {
			return "failure";
		}
	}
}