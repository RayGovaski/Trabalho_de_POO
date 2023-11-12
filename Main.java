import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException,
    ClassNotFoundException {
        Obra ob1 = new Obra("Van Gogh", "A Noite Estrelada", "Óleo sobre tela", "73x92cm" ,1889);
        
        salvarObras(ob1);

        Obra ob2 = carregarObra(); //ver oq fazer com esse djabo de ob2
    }

    public static void salvarObras(Obra ob) throws IOException {
        FileOutputStream safe = new FileOutputStream("obra.um");
        ObjectOutputStream offsafe = new ObjectOutputStream(safe);

        offsafe.writeObject(ob);
        offsafe.close();
        safe.close();
    }

    public static Obra carregarObra() throws IOException, ClassNotFoundException {
        FileInputStream esp = new FileInputStream("obra.um");
        ObjectInputStream omg = new ObjectInputStream(esp);
        Obra ob = (Obra) omg.readObject();
        omg.close();
        esp.close();
        return ob;
    }
}