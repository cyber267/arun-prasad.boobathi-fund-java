package fr.epita.arun.datamodel;

import java.time.LocalDate;

public class Patient {
    private String patNum;
    private String patLastname;
    private String patFirstname;
    private String patAddress;
    private String patTel;
    private String patInsuranceId;
    private LocalDate patSubscriptionDate;

    public String getPatNum() {
        return patNum;
    }

    public void setPatNum(String patNum) {
        this.patNum = patNum;
    }

    public String getPatLastname() {
        return patLastname;
    }

    public void setPatLastname(String patLastname) {
        this.patLastname = patLastname;
    }

    public String getPatFirstname() {
        return patFirstname;
    }

    public void setPatFirstname(String patFirstname) {
        this.patFirstname = patFirstname;
    }

    public String getPatAddress() {
        return patAddress;
    }

    public void setPatAddress(String patAddress) {
        this.patAddress = patAddress;
    }

    public String getPatTel() {
        return patTel;
    }

    public void setPatTel(String patTel) {
        this.patTel = patTel;
    }

    public String getPatInsuranceId() {
        return patInsuranceId;
    }

    public void setPatInsuranceId(String patInsuranceId) {
        this.patInsuranceId = patInsuranceId;
    }

    public LocalDate getPatSubscriptionDate() {
        return patSubscriptionDate;
    }

    public void setPatSubscriptionDate(LocalDate patSubscriptionDate) {
        this.patSubscriptionDate = patSubscriptionDate;
    }

    public String toString() {
//        return "Person [name=" + name + ", weight=" + weight + "]";
        return "exam [num=" + patNum + ", last=" + patLastname + ",first=" + patFirstname + "]";

    }
}


