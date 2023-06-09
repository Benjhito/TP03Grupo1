package ar.edu.unju.edm.service;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import ar.edu.unju.edm.model.Producto;

@Service
public interface ProductoService {
	public void cargarProducto (Producto nuevaMateria);
	public ArrayList<Producto> listarProducto();
	public Producto mostrarUnProducto(Integer codigo);
	public Producto eliminarUnProducto(Integer codigo);
	public void eliminarTodosLosProductos();
	public Producto modificarUnProducto(Integer codigo);
	public void guardarProducto(Producto producto);
	public Producto buscarProductoPorCodigo(Integer codigo);
}