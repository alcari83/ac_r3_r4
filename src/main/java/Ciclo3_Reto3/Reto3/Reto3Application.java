// 1.Modelo o Entidad -> creación de tablas
// 2.Interface -> hereda del JPA los metodos CRUD
// 3.Repositorio -> Construimos los metodos para consumir el CRUD
// 4.Servicios ->Condiciones de los Json que vienen
// 5.Controlador o Web ->Creamos la url de la API rest.


package Ciclo3_Reto3.Reto3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto3Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto3Application.class, args);
	}

}
