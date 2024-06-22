package cl.praxis.archivoServicio;

import cl.praxis.producto.Producto;
import cl.praxis.productoServicio.ProductoServicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ArchivoServicio {

	private ProductoServicio productoServicio;

	public ArchivoServicio() {
		productoServicio = new ProductoServicio();
	}


	public void cargarDatos(ProductoServicio productoServicio){
		String rutaArchivo = "D:\\OneDrive - Universidad de " +
						"Concepción\\Eclipse\\reciclaJeans\\src\\main\\java\\ProductosImportados.csv";
		try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
			String linea;
			while ((linea = br.readLine()) != null){
				String[] datos = linea.split(",");
				Producto producto = new Producto(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
				productoServicio.agregarProducto(producto);
			}
			System.out.println("Datos cargados correctamente en la lista");
			br.close();
		}catch (IOException e){
			System.out.println("Error al cargar datos del archivo: " + e.getMessage());
		}
		}

}
