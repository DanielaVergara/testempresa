package co.com.ceiba.empresa.consulta.dominio.modelo;

public class ListarEmpresa {

	private String nombre;
	private int    numeroIdentificacion;
	private String tipoDocumento;
	
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public ListarEmpresa(int numeroIdentificacion,String nombre,String tipoDocumento) {
	   this.numeroIdentificacion        = numeroIdentificacion;
	   this.nombre						= nombre;
	   this.tipoDocumento				= tipoDocumento;
	}
	
	public ListarEmpresa(int numeroIdentificacion) {
		   this.numeroIdentificacion        = numeroIdentificacion;
	}

}
