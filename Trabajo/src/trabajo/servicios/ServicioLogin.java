package trabajo.servicios;

public class ServicioLogin {

	public String verificar(String usuario, String contraseņa) {
		if (("edigra".equalsIgnoreCase(usuario))
				&& ("edigra12".equals(contraseņa))) {
			return "success";
		} else {
			return "failure";
		}
	}
}