package trabajo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import trabajo.servicios.ServicioRegistro;


@WebServlet("/RegistroController")
public class RegistroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistroController() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String usuario = request.getParameter("usuario");
		String contraseña = request.getParameter("contraseña");
		String direccion = request.getParameter("direccion");
		String telefono = request.getParameter("telefono");		
		
		ServicioRegistro servicioregistro = new ServicioRegistro();
		
		servicioregistro.guardarnuevousuario(usuario,contraseña,direccion,telefono);		

		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("/WEB-INF/registrocorrecto.jsp");
		rd.forward(request, response);
	}

}
