package co.com.ceiba.empresa.consulta.dominio.servicio;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;

import co.com.ceiba.empresa.consulta.dominio.modelo.ListarEmpresa;
import co.com.ceiba.empresa.consulta.infraestructura.repositorio.RepositorioListarEmpresaMemoria;

public class ServicioListarEmpresa {
	private RepositorioListarEmpresaMemoria repositorioEmpresa;
	
	@Inject
	public ServicioListarEmpresa(RepositorioListarEmpresaMemoria repositorioListarEmpresaMemoria) {
		this.repositorioEmpresa		= repositorioListarEmpresaMemoria;
	}

	public  Set<ListarEmpresa> consultarEmpresa() {
		return new HashSet<>(repositorioEmpresa.consultarEmpresa());
	}
	
	public  Set<ListarEmpresa> consultarPorIdentificacionEmpresa() {
		return new HashSet<>(repositorioEmpresa.consultarEmpresa());
	}
}
