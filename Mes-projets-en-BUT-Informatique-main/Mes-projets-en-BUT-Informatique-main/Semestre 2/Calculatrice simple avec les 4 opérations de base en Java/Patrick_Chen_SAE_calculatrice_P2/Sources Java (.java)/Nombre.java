/**
 * @author Patrick Chen
 * classe Nombre
 * classe test
*/

public class Nombre extends Expression{
  private int valeurnombre ;

  /*
   *@return int
  */
  public int valeur(){
    return valeurnombre;
  }


  /*
   * @param int valeur
   * instancie la valeur
  */
  public Nombre(int valeurnombre){
    this.valeurnombre = valeurnombre;
  }
  /*
   * @return l'affichage de la valeur
  */
  public String toString(){
   return  String.valueOf(valeur());

  }



  /*
   * constructeur
  */

  //getter
  public int getvaleurnombre(){
    return this.valeurnombre;
  }

  //setter
  public void setvaleurnombre(int val){
    this.valeurnombre = val;
  }
}
