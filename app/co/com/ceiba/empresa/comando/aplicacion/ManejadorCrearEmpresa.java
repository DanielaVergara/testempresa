package co.com.ceiba.empresa.comando.aplicacion;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;

import co.com.ceiba.empresa.comando.dominio.modelo.CrearEmpresa;
import co.com.ceiba.empresa.comando.dominio.servicio.ServicioCrearEmpresa;

public class ManejadorCrearEmpresa{
	
	private ServicioCrearEmpresa servicioDeEmpresa;
	
	@Inject
	public ManejadorCrearEmpresa(ServicioCrearEmpresa servicioLoteria) {
		this.servicioDeEmpresa = servicioLoteria;
	}
	
	public void crearEmpresa(CrearEmpresa empresa) {
		servicioDeEmpresa.crearEmpresa(empresa);
	}
	
	public  Set<CrearEmpresa> consultarEmpresa() {
		return new HashSet<>(servicioDeEmpresa.consultarEmpresa());
	}
	

}
