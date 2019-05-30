package co.com.ceiba.empresa.consulta.infraestructura.repositorio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import co.com.ceiba.empresa.consulta.dominio.modelo.ListarEmpresa;
import co.com.ceiba.empresa.consulta.dominio.repositorio.RepositorioListarEmpresa;

public class RepositorioListarEmpresaMemoria implements RepositorioListarEmpresa{

	private HashMap<String, ListarEmpresa> empresas = new HashMap<>();
	
	public Set<ListarEmpresa> consultarEmpresa() {	
		  return new HashSet<>(empresas.values());
	}

	public Set<ListarEmpresa> consultarPorIdentificacionEmpresa() {
		  return new HashSet<>(empresas.values());
	} 
}
