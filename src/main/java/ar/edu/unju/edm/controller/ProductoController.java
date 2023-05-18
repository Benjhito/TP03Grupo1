package ar.edu.unju.edm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.service.ProductoService;
import ar.edu.unju.edm.util.Productos;

@Controller
public class ProductoController {
//	@Autowired
//	Producto unProducto;
	@Autowired
	ProductoService unServicio;
	
	@GetMapping("/index")
	public ModelAndView mostrarIndex() {
		ModelAndView name = new ModelAndView("index");
		return name;
	}
	
	@GetMapping("/producto")
	public ModelAndView solicitarProducto() {
		Producto unProducto = new Producto();
		
		ModelAndView name = new ModelAndView("producto");
		name.addObject("unProducto", unProducto);
		
		return name;
	}

	@PostMapping("/guardarProducto")
	public ModelAndView cargarProducto(@ModelAttribute("producto") Producto nuevoProducto, Productos listado) {
		nuevoProducto.setEstado(true);
		Productos.getListadoDeProductos().add(nuevoProducto);
		
		ModelAndView listadoFinal= new ModelAndView("mostrarListado");
		listadoFinal.addObject("listado", Productos.getListadoDeProductos());
		
		return listadoFinal;
	}
}
