
package video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Video {
    private String titulo;
    private String autor;
    private String url;
    private boolean activo;

    public Video(String titulo, String autor, String url, boolean activo) {
        this.titulo = titulo;
        this.autor = autor;
        this.url = url;
        this.activo = activo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getUrl() {
        return url;
    }

    public boolean isActivo() {
        return activo;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", URL: " + url + ", Activo: " + (activo ? "Si" : "No");
    }
}

public class VideoManager {
    public static void main(String[] args) {
        List<Video> videos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        String continuar;
        do {
            System.out.print("Ingrese el titulo del video: ");
            String titulo = entrada.nextLine();

            System.out.print("Ingrese el autor del video: ");
            String autor = entrada.nextLine();

            System.out.print("Ingrese la URL del video: ");
            String url = entrada.nextLine();

            System.out.print("¿El video esta activo? (true/false): ");
            boolean activo = entrada.nextBoolean();
            entrada.nextLine();

            videos.add(new Video(titulo, autor, url, activo));

            System.out.print("¿Desea agregar otro video? (s/n): ");
            continuar = entrada.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nLista de videos:");
        for (Video video : videos) {
            System.out.println(video);
        }

        entrada.close();
    }
}
