package co.com.ceiba.empresa.comando.dominio.modelo;



public class CrearEmpresa {

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
	
	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public CrearEmpresa() {}
	
	public CrearEmpresa(int numeroIdentificacion,String nombre,String tipoDocumento) {
	   this.numeroIdentificacion        = numeroIdentificacion;
	   this.nombre						= nombre;
	   this.tipoDocumento				= tipoDocumento;
	}

}
