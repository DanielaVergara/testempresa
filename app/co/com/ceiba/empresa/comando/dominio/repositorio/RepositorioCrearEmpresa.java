package co.com.ceiba.empresa.comando.dominio.repositorio;

import java.util.Set;

import co.com.ceiba.empresa.comando.dominio.modelo.CrearEmpresa;

public interface RepositorioCrearEmpresa {

	void crearEmpresa(CrearEmpresa billete);
	 Set<CrearEmpresa>consultarEmpresa();
}
