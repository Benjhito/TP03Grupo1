package ar.edu.unju.edm.util;
import java.util.ArrayList;
import ar.edu.unju.edm.model.Producto;

public class Productos {
	
	private static ArrayList<Producto> listadoDeProductos = new ArrayList<>();
	
	public Productos() {
		// TODO Auto-generated method stub
	}

	public static ArrayList<Producto> getListadoDeProductos() {
		return listadoDeProductos;
	}
}