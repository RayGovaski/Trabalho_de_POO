import java.io.*;

public abstract class Obra implements Serializable {
    private String titulo;
    private String artista;
    private int ano;

    public Obra(String titulo, String artista, int ano) {
        this.titulo = titulo;
        this.artista = artista;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getAno() {
        return ano;
    }

    public abstract void exibirInformacoes();

    public void serializarObra(String nomeArquivo) {
        try {
            FileOutputStream fileOut = new FileOutputStream(nomeArquivo);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.println("Objeto serializado em " + nomeArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Obra desserializarObra(String nomeArquivo) {
        Obra obra = null;
        try {
            FileInputStream fileIn = new FileInputStream(nomeArquivo);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            obra = (Obra) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obra;
    }
}