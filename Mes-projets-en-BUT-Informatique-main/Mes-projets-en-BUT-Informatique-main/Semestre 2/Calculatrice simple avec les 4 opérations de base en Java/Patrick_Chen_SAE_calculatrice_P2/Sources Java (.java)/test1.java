/**
 * @author Patrick Chen
 * classe test de Test
*/


public class test {

   public static void main (String[]args){
        Expression un = new Nombre(1);
        Expression deux = new Nombre(2) ;
        Expression trois = new Nombre(3) ;
        Expression quatre = new Nombre(4);
        Expression cinq = new Nombre(5);
        Expression six = new Nombre(6);
        Expression sept = new Nombre(7);
        Expression huit = new Nombre(8);
        Expression quatorze = new Nombre(14) ;
        Expression s = new Soustraction(quatorze, deux) ;
        Expression a = new Soustraction(deux, deux) ;
        Expression f = new Addition(quatre,trois) ;
        Expression h = new Soustraction
        try{
          Expression d = new Division (s, a) ;
          System.out.println(d + " = " + d.valeur()) ;}

        catch (ArithmeticException e) {
          System.out.println("une division par 0 est impossible !");}

        try{
          Expression b = new Division(s,f);
          System.out.println(b + " = " + b.valeur()) ;}
        catch (Exception e) {
          System.err.println("Une erreur s'est produite " + e);}

    }
}
