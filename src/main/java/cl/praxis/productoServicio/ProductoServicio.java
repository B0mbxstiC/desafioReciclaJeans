package cl.praxis.productoServicio;

import cl.praxis.producto.Producto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class ProductoServicio {

	private List<Producto> listaProductos;

	public ProductoServicio() {
		listaProductos = new ArrayList<>();
	}
	//Agregar productos a la lista de productos
	public void agregarProducto(Producto producto){
		listaProductos.add(producto);
	}

	//Listar los productos existentes en la lista
	public void listarProductos(){
		if(listaProductos.isEmpty()){
			System.out.println("No se encontraron productos en la lista");
		} else  {
			for(Producto producto: listaProductos){
				System.out.println(producto);
			}
		}
	}

	//Buscar productos por código.
	public Producto buscarCodigo(String codigo){
		for(Producto producto: listaProductos) {
			if (producto.getCodigo().equals(codigo)) {
				return producto;
			}
		}
		return null;
	}







}
