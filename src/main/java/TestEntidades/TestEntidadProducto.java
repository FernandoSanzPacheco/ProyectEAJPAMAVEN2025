package TestEntidades;

import java.util.Date;

import DaoImp.ClassProductoImp;
import model.TblProducto;

public class TestEntidadProducto {

	public static void main(String[] args) {
		// instanciamos las respectivas clases
		TblProducto tbl=new TblProducto();
		ClassProductoImp crudimp=new ClassProductoImp();
		
		/*
		
		// asignamos los respectivos valores
		tbl.setNomprod("fideos");
		tbl.setCantidad(4);
		tbl.setPrecio(5);
		tbl.setTotal(tbl.getCantidad()*tbl.getPrecio());
		tbl.setNrolote("lote2025");
		tbl.setCodbarras("cod784555");
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		tbl.setFechaven(fechasql);
		// invocamos el metodo registrar
		crudimp.RegistrarProducto(tbl);
		
		*/
		
		// TESTEO METODO LISTADO
		
		List<TblProducto> listadoproducto=crudimp.ListadoProducto();
		
		// aplicamos un bucle for
		for(TblProducto prod:listadoproducto){
			
			// imprimir por pantalla
			System.out.println("codigo "+prod.getIdproducto()+" producto "
					+prod.getNomprod()+" precio "+prod.getPrecio()+" cantidad "
					+prod.getCantidad()+" total "+prod.getTotal()+
					" codigo de barras "+prod.getCodbarras());
			
		} // fin del bucle for
		

	}	// fin del metodo principal

}	// fin de la clase
