/**
 * @author Patrick Chen
 * classe Soustraction
*/



public class Soustraction extends Operation{


  /**
    * @param Operande1 @param Operande2
    * Cette fonction sert a instancier les valeur.
    * @return rien
    */
  public Soustraction (Expression Operande1,Expression Operande2){
    super(Operande1,Operande2);
  }


  /**
    * Cette fonction ne sert à recuperer les valeur par la fonction getOperande.
    * @return les valeur recuperer
    */
  public int valeur(){
    return this.getOperande1().valeur() - this.getOperande2().valeur();

  }


  /**
    * Cette fonction sert a afficher.
    * @return l'affichage
    */
  public String toString(){

    return  getOperande1() + "-" + getOperande2();

  }


}
