import java.util.Scanner;
/**
 *
 * @author user
 */
public class BBI {
     public static void main(String[] args)throws Exception {
          Scanner input = new Scanner(System.in);
        Manusia[] m = new Manusia[2];
        
        int x = 0;
        do {
            System.out.println("User" + (x + 1));
            System.out.print("Masukan tinggi badan anda(cm) = ");
            double t = input.nextDouble();
            System.out.print("Masukan jenis kelamin anda(L/P) = ");
            String jk = input.next();
            if (jk.toUpperCase().equals("L")) {
                m[x] = new Laki_Laki(t);
                System.out.println("Berat badan ideal Laki-Laki ini adalah" + m[x].HtgBBI());
                System.out.println();
            } else {
                m[x] = new Perempuan(t);
                System.out.println("Berat badan Perempuan ini adalah" + m[x].HtgBBI());
                System.out.println();
            }
            x++;
        } while (x < 2);
    }
    
}

