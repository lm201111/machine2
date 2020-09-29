public class CoffeeMachine
{
    private int[] drinkPrices;
    private String[] drinkNames;

    public CoffeeMachine(int[] Prices,String[] Names)
    {
        this.drinkPrices = Prices;
        this.drinkNames = Names;
    }

    public boolean checkPrices(int moneyAmount)
    {
        boolean canBuyAnything = false;
        for(int i = 0; i < drinkPrices.length; i = i + 1)
        {
            if(moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " + drinkNames[i]);
                canBuyAnything = true;
            }
        }
        return canBuyAnything;
    }
}
