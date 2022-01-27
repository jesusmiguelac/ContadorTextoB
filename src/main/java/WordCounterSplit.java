import java.io.*;

public class WordCounterSplit {

    public WordCounterSplit(){

    }

    public void counterSplit() {
        System.out.println("StringSplit");
        String fileName = "divina_comedia.txt";

        FileReader fileReader = null;

        try {
            fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("El nombre del archivo no se encuentra");
            System.exit(2);
        }

        BufferedReader in = new BufferedReader(fileReader);

        String retorno = null;

        String lineaSalida = "";
        StringBuffer contenido = new StringBuffer();
        String separador = "";

        while (true) {
            try {
                if (!((lineaSalida = in.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            contenido.append(separador + lineaSalida);
            separador = "\n";
        }

        retorno = contenido.toString();

        // tiempo al inicio
        long start = System.currentTimeMillis();

        String arrayRetorno[] = retorno.split("\\s+");

        // tiempo de procesamiento
        long time = System.currentTimeMillis() - start;

        System.out.printf("El archivo %s tiene %,7d palabras. ", fileName, arrayRetorno.length);
        System.out.printf("Tiempo procesamiento (milisegundos): %d %n", time);
    }

}
