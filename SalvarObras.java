import java.io.*;

public class SalvarObras {  // Mudar classe Obra para concreta
    public static void main(String[] args) {
        Obra obra = new Obra("A Noite Estrelada", "Vincent van Gogh", 1889);
        obra.exibirInformacoes(); // Exibe informações da obra antes da serialização

        // Serializar a obra
        try {
            FileOutputStream fileOut = new FileOutputStream("obraSerializada.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obra);
            out.close();
            fileOut.close();
            System.out.println("Objeto serializado em obraSerializada.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Desserializar a obra
        try {
            FileInputStream fileIn = new FileInputStream("obraSerializada.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Obra obraDesserializada = (Obra) in.readObject();
            in.close();
            fileIn.close();
            if (obraDesserializada != null) {
                obraDesserializada.exibirInformacoes(); // Exibe informações da obra desserializada
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

