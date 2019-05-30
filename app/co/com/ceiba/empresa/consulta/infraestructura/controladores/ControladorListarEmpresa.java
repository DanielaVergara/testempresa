package co.com.ceiba.empresa.consulta.infraestructura.controladores;

import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.ceiba.empresa.consulta.aplicacion.ManejadorListarEmpresa;
import co.com.ceiba.empresa.consulta.dominio.modelo.ListarEmpresa;
import co.com.ceiba.empresa.consulta.dominio.servicio.ServicioListarEmpresa;
import co.com.ceiba.empresa.consulta.infraestructura.repositorio.RepositorioListarEmpresaMemoria;
import play.mvc.Controller;
import play.mvc.Result;

public class ControladorListarEmpresa extends Controller{
	
	private ManejadorListarEmpresa manejadorEmpresa;
	
	public ControladorListarEmpresa() {
		this.manejadorEmpresa = new ManejadorListarEmpresa(new ServicioListarEmpresa(new RepositorioListarEmpresaMemoria()));
	}
	
	public Result consultarEmpresa(){
		Set<ListarEmpresa> result = manejadorEmpresa.consultarEmpresa();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonData = mapper.convertValue(result, JsonNode.class);
	  return ok(jsonData);
	}
	
	public Result consultarPorIdentificacionEmpresa(String identificacion){
	  return ok(identificacion);
	}

}
