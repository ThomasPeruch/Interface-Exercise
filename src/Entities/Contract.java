package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Integer idContract;
    private Date date;
    private Double totalValue;

    private List<Installment> installments = new ArrayList<>();

    public Contract(Integer idContract, Date date, Double totalValue) {
        this.idContract = idContract;
        this.date = date;
        this.totalValue = totalValue;
    }


    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Integer getIdContract() {
        return idContract;
    }

    public void setIdContract(Integer idContract) {
        this.idContract = idContract;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void addInstallment(Installment installment) {
        installments.add(installment);
    }
    public void removeInstallment(Installment installment) {
        installments.remove(installment);
    }
}
