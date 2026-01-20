package encapsulation;

public class BankAcc {
private long  AccNo;
private double bal;
public long getAccNo() {
	return AccNo;
}
public void setAccNo(long accNo) {
	AccNo = accNo;
}
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	if(bal<0) {
		this.bal=0;
	}
	else {
		this.bal=bal;
	}
}



}
