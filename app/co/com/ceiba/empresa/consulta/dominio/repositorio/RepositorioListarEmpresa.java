package co.com.ceiba.empresa.consulta.dominio.repositorio;

import java.util.Set;

import co.com.ceiba.empresa.consulta.dominio.modelo.ListarEmpresa;

public interface RepositorioListarEmpresa {

	 Set<ListarEmpresa>consultarEmpresa();
	 Set<ListarEmpresa>consultarPorIdentificacionEmpresa();
	 
}
