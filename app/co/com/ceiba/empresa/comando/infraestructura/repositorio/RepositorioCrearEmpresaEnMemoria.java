package co.com.ceiba.empresa.comando.infraestructura.repositorio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import co.com.ceiba.empresa.comando.dominio.modelo.CrearEmpresa;
import co.com.ceiba.empresa.comando.dominio.repositorio.RepositorioCrearEmpresa;


public class RepositorioCrearEmpresaEnMemoria  implements RepositorioCrearEmpresa {

	private HashMap<String, CrearEmpresa> empresas = new HashMap<>();
	
	
	public void crearEmpresa(CrearEmpresa empresa) {
		empresas.put(Integer.toString(empresa.getNumeroIdentificacion()), empresa);
		empresas.put(empresa.getNombre(), empresa);
		empresas.put(empresa.getTipoDocumento(), empresa);
	}
 

	public Set<CrearEmpresa> consultarEmpresa() {	
		  return new HashSet<>(empresas.values());
	} 
}
