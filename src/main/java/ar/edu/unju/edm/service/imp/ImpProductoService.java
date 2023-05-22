package ar.edu.unju.edm.service.imp;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.service.ProductoService;
import ar.edu.unju.edm.util.Productos;

@Service
public class ImpProductoService implements ProductoService {

	@Override
	public void cargarProducto(Producto nuevoProducto) {
		nuevoProducto.setEstado(true);
		Productos.getListadoDeProductos().add(nuevoProducto);
	}

	@Override
	public ArrayList<Producto> listarProducto() {
	    return Productos.getListadoDeProductos();
	}

	@Override
	public Producto mostrarUnProducto(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto eliminarUnProducto(Integer codigo) {
		ArrayList<Producto> listaProductos = Productos.getListadoDeProductos();
		Producto productoAEliminar = null;
		
		for (Producto producto : listaProductos) {
			if (producto.getCodigo().equals(codigo)) {
				productoAEliminar = producto;
				break;
			}
		}
		
		if (productoAEliminar != null) {
			listaProductos.remove(productoAEliminar);
		}
		
		return productoAEliminar;
	}

	@Override
	public void eliminarTodosLosProductos() {
		ArrayList<Producto> listaProductos = Productos.getListadoDeProductos();
		listaProductos.clear();
	}

	@Override
	public Producto modificarUnProducto(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}