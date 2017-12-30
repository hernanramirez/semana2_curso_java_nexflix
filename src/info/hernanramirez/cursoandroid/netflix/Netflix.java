package info.hernanramirez.cursoandroid.netflix;

public class Netflix {

	private String titulo;
	private String genero;
	private String creador;
	private String duracion;
	public boolean visto = false;
	public String tiempoVisto = "00h 00m";

	public Netflix() {
		super();
		this.titulo = "Sin Titulo";
		this.genero = "Sin Genero ";
		this.creador = "Sin Creador";
		this.duracion = "0 min";
		this.visto = false;
		this.tiempoVisto = "0 min";
	}

	public Netflix(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}

	public Netflix(String titulo, String genero, String creador, String duracion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getTiempoVisto() {
		return tiempoVisto;
	}

	public void setTiempoVisto(String tiempoVisto) {
		this.tiempoVisto = tiempoVisto;
	}

	@Override
	public String toString() {
		return "Netflix [titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", duracion=" + duracion
				+ ", visto=" + visto + ", tiempoVisto=" + tiempoVisto + ", getTitulo()=" + getTitulo()
				+ ", getGenero()=" + getGenero() + ", getCreador()=" + getCreador() + ", getDuracion()=" + getDuracion()
				+ ", getTiempoVisto()=" + getTiempoVisto() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
