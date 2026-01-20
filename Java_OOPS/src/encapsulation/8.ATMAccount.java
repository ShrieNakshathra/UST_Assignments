package encapsulation;

public class ATMAccount {
private int pin;
private double bal;
public void setPin(int pin) {
	        if (pin >= 1000 && pin <= 9999) {
	            this.pin = pin;
 }
}

public void setBalance(double bal) {
    if (bal > 0) {
        this.bal = bal;
    }
}
public void withdraw(double amount) {
    if (amount <= 0) {
        return;
    }

    if (amount <= bal) {
        bal -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + bal);
    }
}
public double getBalance() {
    return bal;
}


}

