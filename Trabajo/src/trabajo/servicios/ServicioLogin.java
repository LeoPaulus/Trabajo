package trabajo.servicios;

public class ServicioLogin {

	public String verificar(String usuario, String contrase�a) {
		if (("edigra".equalsIgnoreCase(usuario))
				&& ("edigra12".equals(contrase�a))) {
			return "success";
		} else {
			return "failure";
		}
	}
}