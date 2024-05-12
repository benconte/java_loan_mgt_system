package Model;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author auguste
 */
@Entity
public class Customer implements Serializable {
    @Id
    @Column(name="customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customer_id;
    private String contact_number;
    private String address;
    private Boolean email;
    private Boolean password;
    @OneToOne(mappedBy = "customer")
    private Loan loan;

    public Customer() {
    }

    public Customer(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Customer(Long customer_id, String contact_number, String address, Boolean email, Boolean password, Loan loan) {
        this.customer_id = customer_id;
        this.contact_number = contact_number;
        this.address = address;
        this.email = email;
        this.password = password;
        this.loan = loan;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getEmail() {
        return email;
    }

    public void setEmail(Boolean email) {
        this.email = email;
    }

    public Boolean getPassword() {
        return password;
    }

    public void setPassword(Boolean password) {
        this.password = password;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }
    
    
}
