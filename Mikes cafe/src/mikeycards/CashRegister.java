
package mikeycards;


public class CashRegister {
    double cashInRegister;
    double priceOfSmall;
    double priceOfLarge;
    int smallSold;
    int largeSold;
    
    public CashRegister() {
        this.cashInRegister = 1000;
        this.priceOfSmall = 2.50;
        this.priceOfLarge = 4.00;
        this.smallSold = 0;
        this.largeSold = 0;
    }
    
    public double paySmall(double cashGiven) {
        if (cashGiven >= this.priceOfSmall) {
            this.cashInRegister += this.priceOfSmall;
            this.smallSold++;
            return cashGiven - this.priceOfSmall;
        } else {
            return cashGiven;
        }
    }
    
    public boolean paySmall(MikeyCards card) {
        if (card.balance() >= this.priceOfSmall) {
            card.pay(this.priceOfSmall);
            this.smallSold++;
            return true;
        } else {
            return false;
        }
    }
    
    public double payLarge(double cashGiven) {
        if (cashGiven >= this.priceOfLarge) {
            this.cashInRegister += this.priceOfLarge;
            this.largeSold++;
            return cashGiven - this.priceOfLarge;
        } else {
            return cashGiven;
        }
    }
    
    public boolean payLarge(MikeyCards card) {
        if (card.balance() >= this.priceOfLarge) {
            card.pay(this.priceOfLarge);
            this.largeSold++;
            return true;
        } else {
            return false;
        }
    }
    
     public String toString() {
        return "money in register "+cashInRegister+" small lunches sold: "+smallSold+" large lunches sold: "+largeSold;
    }
     
     public void loadMoneyToCard(MikeyCards card, double sum) {
         if (sum < 0) {
             return;
         }
         
         card.loadMoney(sum);
         this.cashInRegister += sum;
     }
}
