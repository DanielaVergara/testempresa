package co.com.ceiba.empresa.consulta.aplicacion;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;

import co.com.ceiba.empresa.consulta.dominio.modelo.ListarEmpresa;
import co.com.ceiba.empresa.consulta.dominio.servicio.ServicioListarEmpresa;

public class ManejadorListarEmpresa {

	private ServicioListarEmpresa servicioDeEmpresa;
	
	@Inject
	public ManejadorListarEmpresa(ServicioListarEmpresa servicioListarEmpresa) {
		this.servicioDeEmpresa = servicioListarEmpresa;
	}
	
	public  Set<ListarEmpresa> consultarEmpresa() {
		return new HashSet<>(servicioDeEmpresa.consultarEmpresa());
	}
	
	public  Set<ListarEmpresa> consultarPorIdentificacionEmpresa() {
		return new HashSet<>(servicioDeEmpresa.consultarEmpresa());
	}
}
