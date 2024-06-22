package cl.praxis.producto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString


public class Producto {

	private String articulo;
	private String precio;
	private String descripcion;
	private String codigo;
	private String talla;
	private String marca;
	private String color;

}
