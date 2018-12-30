package udemy.demo;

/**
 * 
 * @author Santos Sainos Hernandez
 * @version 1.0
 *
 */

public class Util {

	public VehiculoBean demo(String modelo, int anio) {
		VehiculoBean vehiculoBean = new VehiculoBean();
		vehiculoBean.setModelo(modelo);
		vehiculoBean.setAnio(anio + 1);

		return vehiculoBean;
	}
}
