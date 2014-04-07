
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (Alberto Antelo) 
 * @version (5/4/2014)
 */
public class NameGenerator
{
    // no hace falta ni constructor ni atributos
    

    /**
     *introduces datos por parametro y devuelve un nombreStarWars
     */
    public String generateStarWarsName(String primAp, String nombre, String segAp, String cityNac)
    {
        String name = primAp.substring(0,3) + nombre.substring(0,3);
        String apellido = segAp.substring(0,2)+ cityNac.substring(0,3);
        return name +" "+ apellido;
    }
    
    
    public void ejemplo()
    {
    System.out.println(generateStarWarsName("antelo", "alberto", "presa", "valladolid"));
    
    }
}
