package encapsulation;

public class Policy {
private String  policyId;
private double premium;
public void setPolicyId(String policyId) {
    this.policyId = policyId;
}
public void setPremium(int age) {
    if (age < 18) {
        premium = 0;  // Not eligible
    } else if (age <= 30) {
        premium = 5000;
    } else if (age <= 50) {
        premium = 10000;
    } else {
        premium = 15000;
    }
}
public String getPolicyId() {
    return policyId;
}


public double getPremium() {
    return premium;
}

}
