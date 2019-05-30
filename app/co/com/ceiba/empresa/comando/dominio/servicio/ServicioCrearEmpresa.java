package co.com.ceiba.empresa.comando.dominio.servicio;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;

import co.com.ceiba.empresa.comando.dominio.modelo.CrearEmpresa;
import co.com.ceiba.empresa.comando.dominio.repositorio.RepositorioCrearEmpresa;

public class ServicioCrearEmpresa {

	private RepositorioCrearEmpresa repositorioEmpresa;
	
	@Inject
	public ServicioCrearEmpresa(RepositorioCrearEmpresa repositorioEmpresa) {
		this.repositorioEmpresa		= repositorioEmpresa;
	}
	
	public void crearEmpresa(CrearEmpresa empresa) {
	    repositorioEmpresa.crearEmpresa(empresa);
	}
	
	public  Set<CrearEmpresa> consultarEmpresa() {
		return new HashSet<>(repositorioEmpresa.consultarEmpresa());
	}
	
}
