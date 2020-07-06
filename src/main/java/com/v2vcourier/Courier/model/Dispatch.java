package com.v2vcourier.Courier.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.time.Instant;

@Entity
@Table
public class Dispatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long DiId;
    @Column
    private String Shipn;
    @Column
    private String Recen;
    @Column
    private String ReceA;
    @Column
    @Pattern(regexp = "(^$|[0-9]{10})")
    private String Ph;
    @Column
    private String Assigned;
    @Column
    private String Desti;
    @Column
    private String DaDi;
    @Column
    private Instant dispatchedOn;

    public Long getDiId() {
        return DiId;
    }

    public void setDiId(Long diId) {
        this.DiId = diId;
    }

    public String getShipn() {
        return Shipn;
    }

    public void setShipn(String shipn) {
        this.Shipn = shipn;
    }

    public String getRecen() {
        return Recen;
    }

    public void setRecen(String recen) {
        this.Recen = recen;
    }

    public String getReceA() {
        return ReceA;
    }

    public void setReceA(String receA) {
        this.ReceA = receA;
    }

    public String getPh() {
        return Ph;
    }

    public void setPh(String ph) {
        this.Ph = ph;
    }

    public String getAssigned() {
        return Assigned;
    }

    public void setAssigned(String assigned) {
        this.Assigned = assigned;
    }

    public String getDesti() {
        return Desti;
    }

    public void setDesti(String desti) {
        this.Desti = desti;
    }

    public String getDaDi() {
        return DaDi;
    }

    public void setDaDi(String daDi) {
       this. DaDi = daDi;
    }
    public Instant getdispatchedOn() {
        return dispatchedOn;
    }

    public void setdispatchedOn(Instant dispatchedOn) {
        this.dispatchedOn = dispatchedOn;
    }
}
