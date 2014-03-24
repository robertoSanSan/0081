import java.util.*;
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
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<>();
        respuestas.add("Estas seguro?");
        respuestas.add("necesita mas informacion?");
        respuestas.add("cual es tu sistema operativo?");
        respuestas.add("vale , estamos trabajando en el problema");
        respuestas.add("puede facilitarme mas informacion?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int numeroObtenido = aleatorio.nextInt(respuestas.size());
        return respuestas.get (numeroObtenido);
    }
}
