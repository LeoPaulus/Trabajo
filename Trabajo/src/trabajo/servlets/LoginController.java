package trabajo.servlets;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import trabajo.servicios.ServicioLogin;



public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public LoginController() {
		super();
	}
 
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
 
		String usuario = request.getParameter("usuario");
		String contraseña = request.getParameter("contraseña");
		RequestDispatcher rd = null;
 
		ServicioLogin serviciologin = new ServicioLogin();
		String result = serviciologin.verificar(usuario,contraseña);
		if (result.equals("success")) {
			rd = request.getRequestDispatcher("/WEB-INF/logincorrecto.jsp");
			
		} else {
			rd = request.getRequestDispatcher("/WEB-INF/loginerror.jsp");
		}
		rd.forward(request, response);
	}
 
}
