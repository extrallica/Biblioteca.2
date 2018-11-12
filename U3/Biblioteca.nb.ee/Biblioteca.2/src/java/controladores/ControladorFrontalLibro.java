package controladores;

import dao.BaseDatos;
import dao.FabricaDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author const
 */
public class ControladorFrontalLibro extends HttpServlet {
	
	private String nombreBD;
	private String usuarioBD;
	private String passwordBD;
	private BaseDatos baseDatos;
	private String resultado;

	@Override
	public void init(ServletConfig config) throws ServletException {
		nombreBD = config.getInitParameter("nombreBaseDatos");
		usuarioBD = config.getInitParameter("usuarioBaseDatos");
		passwordBD = config.getInitParameter("passwordBaseDatos");
		baseDatos = FabricaDao.getBaseDatos(nombreBD, usuarioBD, passwordBD);
		resultado = baseDatos.hacerConexion();
	}	

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		System.out.println("Conexion:: "+resultado);
		String recurso = null;
		HttpSession session = request.getSession();
		
		if (resultado.equals("exito")) {
			session.setAttribute("mensaje", resultado);
			recurso = "vistas/jsp/mensajes.jsp";
		}else{
			session.setAttribute("mensaje", resultado);
			recurso = "ServletError";
			response.sendRedirect(recurso);
		}
		RequestDispatcher rd = request.getRequestDispatcher(recurso);
		rd.forward(request, response);
	}

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	
	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
