

import java.util.ArrayList;
import java.util.List;

    public class GestorPelicula {
        private List<Pelicula> listaPeliculas;

        public GestorPelicula() {
            listaPeliculas = new ArrayList<>();
        }

        public void agregarPelicula(Pelicula pelicula) {
            listaPeliculas.add(pelicula);
            System.out.println("Metodo agregar pelicula");
        }

        public void eliminarPelicula(int id) {
            listaPeliculas.removeIf(p -> p.getId() == id);
        }

        public void cambiarDisponibilidad(int id, boolean disponible) {
            for (Pelicula p : listaPeliculas) {
                if (p.getId() == id) {
                    p.setDisponible(disponible);
                    break;
                }
            }
        }

        public void mostrarPeliculas() {
            listaPeliculas.forEach(System.out::println);
        }
    }



