package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImp.ClassProductoImp;
import model.TblProducto;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    } // fin del constructor producto...

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// instanciamos la clase
		ClassProductoImp crudimp=new ClassProductoImp();
		
		// recuperamos el listado de productos de la BD
		List<TblProducto> listadoproductos=crudimp.ListadoProducto();
		
		// enviamos hacia la vista
		// almacenamos en el metodo
		request.setAttribute("listado",listadoproductos);
		// redireccionamos hacia la vista (.jsp)
		request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
		
	} // fin del metodo doget...

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	} // fin del metodo dopost...

} // fin del controlador producto
