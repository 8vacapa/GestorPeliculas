public class Main {
    public static void main(String[] args) {
        System.out.println("Gestor de peliculas");
        GestorPelicula gestor = new GestorPelicula();
        gestor.agregarPelicula(new Pelicula(1, "Your name", true));
        gestor.agregarPelicula(new Pelicula(2, "Que paso ayer", false));

        System.out.println("Lista de películas:");
        gestor.mostrarPeliculas();

        System.out.println("\nCambiando disponibilidad de ' Q paso ayer'...");
        gestor.cambiarDisponibilidad(2, true);
        gestor.mostrarPeliculas();
        System.out.println("Hola mundo");
        System.out.println("Nueva funcionalidad");
    }
}
