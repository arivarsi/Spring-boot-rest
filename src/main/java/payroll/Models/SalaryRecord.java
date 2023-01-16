package payroll.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class SalaryRecord {
   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String employeeName;
    private Double salary;
    private Date dateofpay;
    private boolean isprocessed;
    public SalaryRecord(){}
    public SalaryRecord(String employeeName, Double salary, Date dateofpay, boolean isprocessed) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.dateofpay = dateofpay;
        this.isprocessed = isprocessed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateofpay() {
        return dateofpay;
    }

    public void setDateofpay(Date dateofpay) {
        this.dateofpay = dateofpay;
    }

    public boolean isIsprocessed() {
        return isprocessed;
    }

    public void setIsprocessed(boolean isprocessed) {
        this.isprocessed = isprocessed;
    }
    //private
    // other fields, getters and setters
}
