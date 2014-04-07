
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (Alberto Antelo) 
 * @version (5/4/2014)
 */
public class NameGenerator
{
    // no hace falta ni constructor ni atributos
    public static final int CUT_PRIM_AP=3;
    public static final int CUT_NOMBRE=3;
    public static final int CUT_SEG_AP=2;
    public static final int CUT_CITY_BORN=3;
    public static final int PRIMERA_LETRA = 0;
    
    /**
     *introduces datos por parametro y devuelve un nombreStarWars
     */
    public String generateStarWarsName(String primAp, String nombre, String segAp, String cityNac)
    {
        String name = primAp.substring(PRIMERA_LETRA,CUT_PRIM_AP) + nombre.substring(PRIMERA_LETRA,CUT_NOMBRE);
        String apellido = segAp.substring(PRIMERA_LETRA,CUT_SEG_AP)+ cityNac.substring(PRIMERA_LETRA,CUT_CITY_BORN);
        return name +" "+ apellido;
    }
    
    
    public void ejemplo()
    {
    System.out.println(generateStarWarsName("antelo", "alberto", "presa", "valladolid"));
    
    }
}
