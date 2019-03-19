package mikeycards;

public class Main {

    public static void main(String[] args) {
        CashRegister mikesCafe = new CashRegister();
        System.out.println(mikesCafe);

        MikeyCards cardOfMike = new MikeyCards(2);

        System.out.println("the card balance " + cardOfMike.balance() + " pounds");

        boolean succeeded = mikesCafe.payLarge(cardOfMike);
        System.out.println("payment success: " + succeeded);

        mikesCafe.loadMoneyToCard(cardOfMike, 100);

        succeeded = mikesCafe.payLarge(cardOfMike);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfMike.balance() + " pounds");

        System.out.println(mikesCafe);
    }

}
