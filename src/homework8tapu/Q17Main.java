package homework8tapu;
/*Write a class with the name Main. The class needs to have a main metho*/
public class Q17Main {
    public static void main(String[] args) {
      Q17Carpet carpet = new Q17Carpet(3.5);
      Q17Floor floor = new Q17Floor(2.75,4.0);
      Q17Calculator calculator = new Q17Calculator(floor,carpet);
      System.out.println("total = "+ calculator.getTotalCost());
      carpet = new Q17Carpet(1.5);
      floor =new Q17Floor(5.4,4.5);
      calculator = new Q17Calculator(floor,carpet);
      System.out.println("total = "+calculator.getTotalCost());
    }
}
