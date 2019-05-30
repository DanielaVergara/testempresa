package co.com.ceiba.empresa.comando.infraestructura.controladores;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.ceiba.empresa.comando.aplicacion.ManejadorCrearEmpresa;
import co.com.ceiba.empresa.comando.dominio.modelo.CrearEmpresa;
import co.com.ceiba.empresa.comando.dominio.servicio.ServicioCrearEmpresa;
import co.com.ceiba.empresa.comando.infraestructura.repositorio.RepositorioCrearEmpresaEnMemoria;

import java.util.Set;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class ControladorCrearEmpresa extends Controller  {

	private ManejadorCrearEmpresa manejadorEmpresa;
	
	public ControladorCrearEmpresa() {
		this.manejadorEmpresa = new ManejadorCrearEmpresa(new ServicioCrearEmpresa(new RepositorioCrearEmpresaEnMemoria()));
	}
	
		
	public Result crearEmpresa(){
		CrearEmpresa empresa;
		JsonNode json = request().body().asJson();
		empresa = Json.fromJson(json, CrearEmpresa.class);
	  	manejadorEmpresa.crearEmpresa(empresa);
	  return ok("Éxito");
	}
	
	
	public Result consultarEmpresa(){
		Set<CrearEmpresa> result = manejadorEmpresa.consultarEmpresa();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonData = mapper.convertValue(result, JsonNode.class);
	  return ok(jsonData);
	}

	
	
}
