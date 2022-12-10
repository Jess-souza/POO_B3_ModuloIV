import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainArquivo {

    static String nomeArquivo = "/home/jessicasouza/Academia_B3/Modulo_4/POO_B3_ModuloIV/src/resource/files/arquivo.txt";

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(nomeArquivo);
        //Path path = Paths.get("home", "jessicasouza", "Academia_B3", Modulo_4,POO_B3_ModuloIV, src,resource, files, arquivo.txt)
        File testeFile = path.toFile();
        System.out.println("Se existe" + testeFile.exists());
        System.out.println("Se é uma pasta " + testeFile.isDirectory());
        System.out.println("Tamanho " + testeFile.length());
        System.out.println("Data de modificação " + testeFile.lastModified());


        Files.createDirectories(Path.of("/home/jessicasouza/Academia_B3/Modulo_4/POO_B3_ModuloIV/src/resource/"));
        //File.createTempFile(txt)
    }
}
