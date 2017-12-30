package info.hernanramirez.cursoandroid.netflix;

public class Pelicula extends Netflix implements IVisualizable {

	private int anno;

	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
		this.anno = 1900;
	}

	public Pelicula(String titulo, String creador) {
		super(titulo, creador);
		// TODO Auto-generated constructor stub
		this.anno = 1900;
	}

	public Pelicula(String titulo, String genero, String creador, int anno, String duracion) {
		super(titulo, genero, creador, duracion);
		// TODO Auto-generated constructor stub
		this.anno = anno;
	}	

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		this.visto = true;

	}

	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		if (this.visto) {
			return true;
		}else {
			return false;
		}

	}

	@Override
	public String tiempoVisto() {
		// TODO Auto-generated method stub
		return this.tiempoVisto;

	}

	@Override
	public String toString() {
		return "Peliculas "+ super.toString() + "\n [Anno=" + anno + "]";
	}
	
	public void mostrarDatos() {
		System.out.println("Los datos peliculas netflix son: " + this.toString());
	}
}
