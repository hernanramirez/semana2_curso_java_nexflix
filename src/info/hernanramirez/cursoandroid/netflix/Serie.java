package info.hernanramirez.cursoandroid.netflix;

public class Serie extends Netflix implements IVisualizable {

	private int noDeTemporadas = 0;

	public Serie() {
		super();
		// TODO Auto-generated constructor stub
		this.noDeTemporadas = 0;
	}

	public Serie(String titulo, String genero, String creador, String duracion, int noDeTemporadas) {
		super(titulo, genero, creador, duracion);
		// TODO Auto-generated constructor stub
		this.noDeTemporadas = noDeTemporadas;
	}

	public Serie(String titulo, String creador) {
		super(titulo, creador);
		// TODO Auto-generated constructor stub
		this.noDeTemporadas = 0;
	}
	

	public int getNoDeTemporadas() {
		return noDeTemporadas;
	}

	public void setNoDeTemporadas(int noDeTemporadas) {
		this.noDeTemporadas = noDeTemporadas;
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
		return "Series: " + super.toString() + "\n [Nro. de temporadas=" + noDeTemporadas + "]";
	}

	public void mostrarDatos() {
		System.out.println("Los datos series netflix son: " + this.toString());
	}

}
