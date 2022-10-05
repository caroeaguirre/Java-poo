package supermercado;

import java.util.Objects;

public class Producto {
	
	private int idPorducto;
	private String productoNomb;
	private float precio;
	
	
	public Producto(int idPorducto, String productoNomb, float precio) {
		super();
		this.idPorducto = idPorducto;
		this.productoNomb = productoNomb;
		this.precio = precio;
	}


	public int getIdPorducto() {
		return idPorducto;
	}


	public void setIdPorducto(int idPorducto) {
		this.idPorducto = idPorducto;
	}


	public String getProductoNomb() {
		return productoNomb;
	}


	public void setProductoNomb(String productoNomb) {
		this.productoNomb = productoNomb;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "\nProducto [idPorducto=" + idPorducto + ", productoNomb=" + productoNomb + ", precio=" + precio + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(idPorducto, precio, productoNomb);
	}



	public boolean equals(Producto obj) {
			return this.idPorducto==obj.getIdPorducto();
		
	}
	
	
	
	
	
	
	
	
	
	
}
