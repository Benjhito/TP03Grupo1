package ar.edu.unju.edm.model;
import org.springframework.stereotype.Component;

@Component
public class Producto {
	private Integer codigo;
	private String nombre;
	private Integer precio;
	private Boolean estado;
	private String desc;
	
	public Producto(Integer codigo, String nombre, Integer precio, String desc, Boolean estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.estado = estado;
		this.desc = desc;
	}
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}