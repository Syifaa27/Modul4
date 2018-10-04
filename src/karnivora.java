

/**
 *
 * @author user
 */
public class karnivora {
    public static void main (String[] args){
        // Cara penulisan Objek: (superclass) variabel = new (subclass)
        System.out.println("===== HEWAN DEFAULT =====");
        Hewan h = new Hewan();
        h.setNama();
        h.setSuara();
        h.setBerat();
        
        System.out.println("===== HEWAN KUCING =====");
        Hewan k = new kucing();
        k.setNama();
        k.setSuara();
        k.setBerat();
        
        System.out.println("===== HEWAN SINGA =====");
        Hewan s = new singa();
        s.setNama();
        s.setSuara();
        s.setBerat();
    }
    
}
