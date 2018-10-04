

/**
 *
 * @author user
 */
public class Perempuan extends Manusia {
  //constrcutor
    public Perempuan (double TB)
    {
        super(TB);
    }
    public final double HtgBBI()
    {
        return (super.getTB()-100)*0.8;
  
    }
    
}
