class Baja
{
   void drinks()
   {
    System.out.println("Baja drinks local daru");
   }
}
class Baba extends Baja
{
  void eats()
  {
    System.out.println("Father eats masu vat");
  }
}

class Chora extends Baba
{
    void reads()
    {
        System.out.println("Chora reads java");
    }
}

public class MultiLevelinheritace {
    public static void main(String[] args) {
        Chora chora=new Chora();
        chora.drinks();
        chora.eats();
        chora.reads();
    }
}
