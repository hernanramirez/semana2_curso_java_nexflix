package info.hernanramirez.cursoandroid.netflix;

/**
 * El siguiente programa impementa demo con Herencia, poliformismo y interfaces.
 * 
 * Practica 2 curso de Java
 *
 * @author J. Hernan Ramriez R.
 * @version 1.0
 * @since 2017-12-30
 */

public class Ejecutable {

	public static void main(String[] args) {
		/* crear arreglo de peliculas y series */
		
		Pelicula[] peliculas = new Pelicula[5];
		Serie[] series = new Serie[5];
		
		int annoPeliculaReciente = 0;
		int indicePelicula = 0;
		int maxNroTemporada = 0;
		int indiceSerie = 0;
		
		/* cargar valores de peliculas y */

		// cargar una pelicula como vista y asignarle el tiempo que se ha visto

		peliculas[0] = new Pelicula("Coco", "Cine animado 3D", "Lee Unkrich, Adrián Molina", 2016, "120min");
		peliculas[0].marcarVisto();
		peliculas[0].tiempoVisto = "120 min";

		peliculas[1] = new Pelicula("El Renacido", "Cine dramático/Suspenso", "Alejandro González Iñárritu", 2016, "2h 36m");
		peliculas[2] = new Pelicula("Los miserables", "Cine dramático/Cine romántico", "Tom Hooper", 2012, "2h 40m");
		peliculas[3] = new Pelicula("Arráncame la vida", "Drama/Cine romántico", "Roberto Sneider", 2008, "1h 47m");
		peliculas[4] = new Pelicula();

		series[0] = new Serie("Sherlock", "Serie de televisión policíaca", "Sue Vertue", "45 min", 3);
		series[0].marcarVisto();
		series[0].tiempoVisto = "45min";

		series[1] = new Serie("Downton Abbey", "Julian Fellowes");
		series[2] = new Serie("Merlín", "Drama, Fantasía", "Julian Jones", "50m", 5);
		series[3] = new Serie("Grey's Anatomy", "Drama médico", "Shonda Rhimes", "42m", 12);
		series[4] = new Serie();

		System.out.println("\n* Lista de las peliculas que se visualizaron");
		
		for (int i = 0; i < peliculas.length; i++) {
			if (peliculas[i].esVisto()) {
				System.out.println(peliculas[i].toString());
				System.out.println(" ---> " + peliculas[i].tiempoVisto() + "\n");
			}

			// tomar el ano mas reciente de las peliculas
			if (peliculas[i].getAnno() > annoPeliculaReciente) { //
				annoPeliculaReciente = peliculas[i].getAnno();
				indicePelicula = i;
			}

		}
		
		System.out.println("\n* Pelicula mas reciente");
		System.out.println(peliculas[indicePelicula].toString());

		System.out.println("\n* Lista de las Series que se visualizaron");
		
		for (int i = 0; i < series.length; i++) {
			if (series[i].esVisto()) {
				System.out.println(series[i].toString());
				System.out.println(" ---> " + series[i].tiempoVisto() + "\n");
			}

			// tomar el ano mas reciente de las peliculas
			if (series[i].getNoDeTemporadas() > maxNroTemporada) { //
				maxNroTemporada = series[i].getNoDeTemporadas();
				indiceSerie = i;
			}
			

		}
		
		System.out.println("\n* serie con mas nro de episodios");
		System.out.println(series[indiceSerie].toString());


	}

}
