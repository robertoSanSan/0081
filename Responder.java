import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    /**
     * Construct a Responder - nothing to do
     */
    Random aleatorio;
    ArrayList<String>respuestas;
    private HashMap<HashSet, String> respuestaCoherente;
    private HashSet <String> coincidencias;
    private HashSet <String> coincidencias2;
    
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<>();
        respuestaCoherente = new HashMap<>();
        coincidencias = new HashSet<>();
        coincidencias2 = new HashSet<>();
        
        
        coincidencias.add("free");
        coincidencias.add("app");
        coincidencias2.add("linux");
        coincidencias2.add("crash");
        coincidencias2.add("problem");
        
        respuestaCoherente.put(coincidencias, "la aplicacion es gratuita"); 
        respuestaCoherente.put(coincidencias2, "el ordenador esta roto"); 
        respuestas.add("Estas seguro?");
        respuestas.add("necesita mas informacion?");
        respuestas.add("cual es tu sistema operativo?");
        respuestas.add("vale , estamos trabajando en el problema");
        respuestas.add("puede facilitarme mas informacion?");
        //respuestaCoherente.put("linux" , " que software no funciona?");
        //respuestaCoherente.put("si", "que tipo de fallo le esta sucediendo?");
        //respuestaCoherente.put("vale" , "le informaremos cuando hayamos acabado");
        //respuestaCoherente.put("windows" , " que software no funciona?");
        //respuestaCoherente.put("ok", "en algo mas le podemos ayudar?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> specificResponse)
    {
        String respuesta = null;
        respuesta = respuestaCoherente.get(specificResponse);

        if(respuestas.size() > 0){
            int numeroAleatorio = aleatorio.nextInt(respuestas.size());
            respuesta = respuestas.remove(numeroAleatorio);
        }else{
            respuesta = "No se ha entendido la frase del usuario.";
        }
        return respuesta;
    }
}
