/*
 * Romario Fabian López Santos
 * 16011891
 * Lenguajes y Automatas I
 */
package control;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Romario Fabian López Santos
 * 16011891
 * Lenguajes y Automatas I
 */
public class RegularExpressions {
    
   
    public String mayusWord(String word){
         //ER para verificar que es una palabra iniciada en vocal
        Pattern pat = Pattern.compile("^[aeiouAEIOU][a-zA-Záéíóú]+?[.,!:]?");
        Matcher match =  pat.matcher(word);
        //verifica si es o no una palabra que empieza con vocal
        if (!match.matches()) {
            //si es falso, no la cambia
            return word;
        } else {
            //si es verdadero la cambia a mayuscula
            return word.toUpperCase();
        }
    }
    
    
    public String withoutConsonants(String word){
        //ER que verifica que sea una palabra
        Pattern pat = Pattern.compile("a-zA-Z");
        Matcher match = pat.matcher(word);
        if (!match.matches()) {
           //si es verdadera, ignorara las vocales y las que no sean
           //se remplazaran con un vacio
            System.out.println(word.replaceAll("[^aeiouAEIOU]", ""));
            return word.replaceAll("[^aeiouAEIOU]", "");
        }else
            //si no es una palabra regresa la letra y/o numero
            System.out.println(word);
            return word;
    }
    
    public String allMayusc(String word){
        //ER que verifica que sea una palabra
        Pattern pat = Pattern.compile("[a-zA-Z]+");
        Matcher match = pat.matcher(word);
        if (!match.matches()) {
            System.out.println(word.toUpperCase());
            return word.toUpperCase();
        }else{
            return word.toUpperCase();
        }
            
    }
    
        public String allMin(String word){
        Pattern pat = Pattern.compile("[a-zA-Z]+");
        Matcher match = pat.matcher(word);
        if (!match.matches()) {
            System.out.println(word.toLowerCase());
            return word.toLowerCase();
        }else{
            return word.toLowerCase();
        }
            
    }
}
