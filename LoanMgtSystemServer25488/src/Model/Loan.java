package Model;

import Utils.LoanStatusUtil;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Loan implements Serializable {

    @Id
    @Column(name = "violation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private double interest_rate;
    private int duration; // in months

    @Enumerated(EnumType.STRING)
    private LoanStatusUtil status;

    private double payback;
    private double payback_month;
    @OneToOne
    private Customer customer;

    public Loan() {
    }

    public Loan(Long id) {
        this.id = id;
    }

    public Loan(Long id, double amount, double interest_rate, int duration, LoanStatusUtil status, double payback, double payback_month, Customer customer) {
        this.id = id;
        this.amount = amount;
        this.interest_rate = interest_rate;
        this.duration = duration;
        this.status = status;
        this.payback = payback;
        this.payback_month = payback_month;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LoanStatusUtil getStatus() {
        return status;
    }

    public void setStatus(LoanStatusUtil status) {
        this.status = status;
    }

    public double getPayback() {
        return payback;
    }

    public void setPayback(double payback) {
        this.payback = payback;
    }

    public double getPayback_month() {
        return payback_month;
    }

    public void setPayback_month(double payback_month) {
        this.payback_month = payback_month;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
