/*
 * Romario Fabian López Santos
 * 16011891
 * Lenguajes y Automatas I
 */
package control;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import model.ModeloTextp;
import vista.Main;

/*
 * Romario Fabian López Santos
 * 16011891
 * Lenguajes y Automatas I
 */
public class EdicionTexto extends RegularExpressions {

    ModeloTextp modeloTextp = new ModeloTextp();

    //metodo donde el texto cambia a mayusculas
    public void toUpperCaseFile(String Opc) {
        modeloTextp.setContent("");
        StringTokenizer token;
        String con = "";
        String pal = "";
        token = new StringTokenizer(Opc, " ");
        while (token.hasMoreElements()) {
            pal = token.nextToken();

            con += allMayusc(pal) + " ";

        }
        modeloTextp.setContent(con + "\n");
        System.out.println(con);
        Main.txtEditado.setText(modeloTextp.getContent());
    }

    //este metodo cambia a minusculas
    public void toLowerCaseFile(String Opc) {
        modeloTextp.setContent("");
        StringTokenizer token;
        String con = "";
        String pal = "";
        token = new StringTokenizer(Opc, " ");
        while (token.hasMoreElements()) {
            pal = token.nextToken();

            con += allMin(pal) + " ";

        }
        modeloTextp.setContent(con + "\n");
        System.out.println(con);
        Main.txtEditado.setText(modeloTextp.getContent());
    }

    //este metodo cambia a mayusculas las palabras iniciadas en vocal
    public void vocalUpperCase(String word) {
        StringTokenizer token;
        String con = "";
        String pal = "";
        token = new StringTokenizer(word, " ");
        while (token.hasMoreElements()) {
            pal = token.nextToken();

            con += mayusWord(pal) + " ";

        }
        modeloTextp.setContent(con + "\n");
        System.out.println(con);
        Main.txtEditado.setText(modeloTextp.getContent());
    }

    //este metodo quita las consonantes de las palabras dentro del texto
    public void outConsonant(String linea) {
        modeloTextp.setContent("");
        StringTokenizer token;
        String con = "";
        String pal = "";
        token = new StringTokenizer(linea, " ");
        while (token.hasMoreElements()) {
            pal = token.nextToken();

            con += withoutConsonants(pal) + " ";

        }
        modeloTextp.setContent(con + "\n");
        System.out.println(con);
        Main.txtEditado.setText(modeloTextp.getContent());
    }

    public String getFile(String path) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String content = "";
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content += line + "\n";

            }
        } catch (Exception e) {

        } finally {
            try {
                bufferedReader.close();
            } catch (Exception exception) {

            }
        }
        return content;
    }

    public String textVocalMayus(String path) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String content = "";
        String renglon = "";
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            int c = 0;
            while ((line = bufferedReader.readLine()) != null) {

                vocalUpperCase(line);

            }
        } catch (Exception e) {

        } finally {
            try {
                bufferedReader.close();
            } catch (Exception exception) {

            }
        }
        return content;
    }

    public String textConsonant(String path) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String content = "";
        String renglon = "";
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            int c = 0;
            while ((line = bufferedReader.readLine()) != null) {

                outConsonant(line);

            }
        } catch (Exception e) {

        } finally {
            try {
                bufferedReader.close();
            } catch (Exception exception) {

            }
        }
        return content;
    }

    public String textMayus(String path) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String content = "";
        String renglon = "";
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            int c = 0;
            while ((line = bufferedReader.readLine()) != null) {

                toUpperCaseFile(line);

            }
        } catch (Exception e) {

        } finally {
            try {
                bufferedReader.close();
            } catch (Exception exception) {

            }
        }
        return content;
    }

    public String textMin(String path) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String content = "";
        String renglon = "";
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            int c = 0;
            while ((line = bufferedReader.readLine()) != null) {

                toLowerCaseFile(line);

            }
        } catch (Exception e) {

        } finally {
            try {
                bufferedReader.close();
            } catch (Exception exception) {

            }
        }
        return content;
    }
}
