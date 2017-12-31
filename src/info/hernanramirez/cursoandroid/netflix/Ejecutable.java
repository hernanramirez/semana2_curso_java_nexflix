package info.hernanramirez.cursoandroid.netflix;

import java.util.ArrayList;

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
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		ArrayList<Serie> series = new ArrayList<Serie>();

		int annoPeliculaReciente = 0;
		int indicePelicula = 0;
		int maxNroTemporada = 0;
		int indiceSerie = 0;
		int contador;

		/* cargar valores de peliculas y */

		// cargar una pelicula como vista y asignarle el tiempo que se ha visto

		Pelicula pelicula = new Pelicula("Coco", "Cine animado 3D", "Lee Unkrich, Adrián Molina", 2016, "120min");
		pelicula.marcarVisto();
		pelicula.tiempoVisto = "120 min";

		peliculas.add(pelicula);
		peliculas.add(
				new Pelicula("El Renacido", "Cine dramático/Suspenso", "Alejandro González Iñárritu", 2016, "2h 36m"));
		peliculas.add(new Pelicula("Los miserables", "Cine dramático/Cine romántico", "Tom Hooper", 2012, "2h 40m"));
		peliculas.add(new Pelicula("Arráncame la vida", "Drama/Cine romántico", "Roberto Sneider", 2008, "1h 47m"));
		peliculas.add(new Pelicula());

		Serie serie = new Serie("Sherlock", "Serie de televisión policíaca", "Sue Vertue", "45 min", 3);
		serie.marcarVisto();
		serie.tiempoVisto = "45min";

		series.add(serie);
		series.add(new Serie("Downton Abbey", "Julian Fellowes"));
		series.add(new Serie("Merlín", "Drama, Fantasía", "Julian Jones", "50m", 5));
		series.add(new Serie("Grey's Anatomy", "Drama médico", "Shonda Rhimes", "42m", 12));
		series.add(new Serie());

		System.out.println("\n* Lista de las peliculas que se visualizaron");
		contador = 0;
		for (Pelicula peliculaObje : peliculas) {
			if (peliculaObje.esVisto()) {
				System.out.println(peliculaObje.toString());
				System.out.println(" ---> " + peliculaObje.tiempoVisto() + "\n");
			}

			// tomar el ano mas reciente de las peliculas
			if (peliculaObje.getAnno() > annoPeliculaReciente) { //
				annoPeliculaReciente = peliculaObje.getAnno();
				indicePelicula = contador;
			}
			contador++;

		}
		
		System.out.println("\n* Pelicula mas reciente");
		System.out.println(peliculas.get(indicePelicula).toString());

		System.out.println("\n* Lista de las Series que se visualizaron");
		contador = 0;
		for (Serie serieObj : series) {
			if (serieObj.esVisto()) {
				System.out.println(serieObj.toString());
				System.out.println(" ---> " + serieObj.tiempoVisto() + "\n");
			}

			// tomar el ano mas reciente de las peliculas
			if (serieObj.getNoDeTemporadas() > maxNroTemporada) { //
				maxNroTemporada = serieObj.getNoDeTemporadas();
				indiceSerie = contador;
			}
			contador++;

		}
		
		System.out.println("\n* serie con mas nro de episodios");
		System.out.println(series.get(indiceSerie).toString());


	}

}
