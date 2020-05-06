/*
 * Romario Fabian Lopez Santos
 * 16011891
 */
package control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import vista.Main;

/*
 * Romario Fabian López Santos
 * 16011891
 * Lenguajes y Automatas I
 */
public class AbrirTexto {
    
    //en esta clase abrimos  y cargamos el texto
    EdicionTexto edicionTexto = new EdicionTexto();
    public void abrirFichero(boolean Opc){
        JFileChooser openFile = null;
        if (Opc=true) {
            if (openFile == null) {
                openFile = new JFileChooser();
                openFile.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int selection  = openFile.showOpenDialog(openFile);
                if (selection == JFileChooser.APPROVE_OPTION) {
                    File file = openFile.getSelectedFile();
                    try{
                       
                        String path = file.getPath();
                        String content = getFile(path);
                        Main.txtContent.setText(content);
                        Main.lblPath.setText(path);
                    }catch(Exception ex){
                        
                    }
                }
            }
        }
    }

    public String getFile(String path) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String content = "";
        try{
            fileReader = new FileReader(path);
           bufferedReader = new BufferedReader(fileReader);
           String line;
           while((line = bufferedReader.readLine()) != null){
               content += line+"\n";
           }
        }catch(Exception e){
            
        }
        finally{
            try{
                bufferedReader.close();
            }catch(Exception exception){
                
            }
        }
        return  content;
    }
}
