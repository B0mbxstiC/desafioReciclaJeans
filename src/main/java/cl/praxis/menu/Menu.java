package cl.praxis.menu;

import cl.praxis.archivoServicio.ArchivoServicio;
import cl.praxis.producto.Producto;
import cl.praxis.productoServicio.ProductoServicio;

import java.util.Scanner;

public class Menu {
	private	Scanner sc;
	private Integer opcion;
	private ArchivoServicio archivoServicio;
	private ProductoServicio productoServicio;

	public Menu() {
		productoServicio = new ProductoServicio();
		archivoServicio = new ArchivoServicio();
		sc = new Scanner(System.in);
	}

	public void mostrarMenu(){

		do {
			System.out.println("Menu ReciclaJeans: ");
			System.out.println("1. Listar productos");
			System.out.println("2. Editar datos");
			System.out.println("3. Importar datos");
			System.out.println("4. Salir");
			System.out.println("Ingresa una opción: ");
			opcion = Integer.parseInt(sc.nextLine());

			if (opcion == 1){
				productoServicio.listarProductos();
			} else if (opcion == 2){
				editarDatos();
			} else if (opcion == 3){
				archivoServicio.cargarDatos(productoServicio);
			} else if (opcion == 4){
				System.out.println("Saliendo del programa");
			} else {
				System.out.println("Opcion no valida");
			}
		} while	(opcion != 4);




	}

	public void editarDatos(){
		Integer opcionDos;
		System.out.println("Ingresa el código del producto a editar: ");
		String codigoProducto = sc.nextLine();
		Producto producto = productoServicio.buscarCodigo(codigoProducto);

		 if (codigoProducto != null){
			 System.out.println("Producto encontrado:");
			 System.out.println(producto);
			 System.out.println("1. Articulo");
			 System.out.println("2. Precio");
			 System.out.println("3. descripcion");
			 System.out.println("4. codigo");
			 System.out.println("5. Talla");
			 System.out.println("6. Marca");
			 System.out.println("7. Color");
			 System.out.println("Ingrese el número del aspecto que desea editar: ");
			 opcionDos = Integer.parseInt(sc.nextLine());

			 if (opcionDos == 1){
				 System.out.println("Ingresa el nuevo nombre del artículo: ");
				 producto.setArticulo(sc.nextLine());
			 } else if (opcionDos == 2){
				 System.out.println("Ingresa el nuevo precio: ");
				 producto.setPrecio(sc.nextLine());
			 } else if (opcionDos == 3){
				 System.out.println("Ingresa la nueva descripción: ");
				 producto.setDescripcion(sc.nextLine());
			 } else if (opcionDos == 4){
				 System.out.println("Ingresa el nuevo código: ");
				 producto.setCodigo(sc.nextLine());
			 } else if (opcionDos == 5){
				 System.out.println("Ingresa la nueva talla: ");
				 producto.setTalla(sc.nextLine());
			 } else if (opcionDos == 6){
				 System.out.println("Ingresa la nueva Marca: ");
				 producto.setMarca(sc.nextLine());
			 } else if (opcionDos == 7){
				 System.out.println("Ingresa el nuevo color: ");
				 producto.setColor(sc.nextLine());
			 } else {
				 System.out.println("Campo no válido");
			 }
			 System.out.println("Producto actualizado con éxito");
			 System.out.println(producto);

		 } else {
			 System.out.println("Producto no encontrado");
		 }
	}

}
