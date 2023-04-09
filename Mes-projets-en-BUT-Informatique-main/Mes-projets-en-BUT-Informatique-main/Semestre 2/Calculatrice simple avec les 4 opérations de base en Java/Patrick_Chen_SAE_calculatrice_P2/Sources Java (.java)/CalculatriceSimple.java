/**
 * @author Patrick Chen
 * classe test CalculatriceSimple
*/


public class CalculatriceSimple {
    public static void main(String[] args) {

        try {
            Nombre dix = new Nombre(10);
            Nombre  six = new Nombre(6);
            Operation s = new Soustraction(dix, six);
            System.out.println(s + " = " + s.valeur()); // doit afficher : (10 – 6) = 4
        } catch (ArithmeticException e) {
            System.out.println("une division par 0 est impossible !" + e);
        } catch (Exception e) {
            System.out.println("Une erreur s'est produite " + e);}
    }
}
