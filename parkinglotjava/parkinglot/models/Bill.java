package parkinglotjava.parkinglot.models;

import java.util.List;
import java.util.Date;

public class Bill {

    Date exitTime;

    Ticket token;

    Gate ExitedAt;

    List<Payment> payments;

    int TotalAmount;

    BillStatus billStatus;

    // getters and setters for the above attributes

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket getToken() {
        return token;
    }

    public void setToken(Ticket token) {
        this.token = token;
    }

    public Gate getExitedAt() {
        return ExitedAt;
    }

    public void setExitedAt(Gate exitedAt) {
        ExitedAt = exitedAt;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public int getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        TotalAmount = totalAmount;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
    
}
