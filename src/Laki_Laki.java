
/**
 *
 * @author user
 */
public class Laki_Laki extends Manusia{
//constructor
    public Laki_Laki (double TB)
    {
        super (TB);
    }
    //method HtgBBI () merupakan method overidding dari superclass nya
    public double HtgBBI()
    {
        return (super.getTB()-100)*0.9;
  
    }
    
}