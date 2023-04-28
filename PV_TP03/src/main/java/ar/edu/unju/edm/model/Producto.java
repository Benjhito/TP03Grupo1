package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Producto {
	private int codigo;
	private String nombre;
	private int precio;
	private boolean estado;
	private String desc;
	
	public Producto(int codigo, String nombre, int precio, String desc, boolean estado) {
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}