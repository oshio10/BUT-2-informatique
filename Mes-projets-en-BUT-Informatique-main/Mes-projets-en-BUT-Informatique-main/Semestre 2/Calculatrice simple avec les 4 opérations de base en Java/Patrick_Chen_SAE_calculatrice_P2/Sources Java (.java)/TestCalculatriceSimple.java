/**
 * @author Patrick Chen
 * classe test TestCalculatriceSimple
*/


public class TestCalculatriceSimple {

   public static void main (String[]args){
     try{
        Expression deux = new Nombre(2) ;
        Expression trois = new Nombre(3) ;
        Expression dixSept = new Nombre(17) ;
        Expression s = new Soustraction(dixSept, deux) ;
        Expression a = new Addition(deux, trois) ;
        Expression d = new Division (s, a) ;
        System.out.println(d + " = " + d.valeur()) ;}
      catch (ArithmeticException e) {
        System.out.println("une division par 0 est impossible !");}
      catch (Exception e) {
  			System.out.println("Une erreur s'est produite " + e);}

    }
}
