package com.v2vcourier.Courier.dto;

import com.v2vcourier.Courier.model.Dispatch;

import java.time.Instant;

public class DispatchDto {

    private Long DiId;
    private String Shipn;
    private String Recen;
    private String ReceA;
    private String Ph;
    private String Assigned;
    private String Desti;
    private String DaDi;
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
       this. Shipn = shipn;
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
       this. Ph = ph;
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
       this. Desti = desti;
    }

    public String getDaDi() {
        return DaDi;
    }

    public void setDaDi(String daDi) {
       this. DaDi = daDi;
    }

    public Instant getDispatchedOn() {
        return dispatchedOn;
    }

    public void setDispatchedOn(Instant dispatchedOn) {
        this.dispatchedOn = dispatchedOn;
    }
}
