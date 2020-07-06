package com.v2vcourier.Courier.dto;

import java.time.Instant;

public class OrdDto {

    private Long Oid;
    private String SName;
    private String Src;
    private String Des;
    private String Mat;
    private String RName;
    private String SAddr;
    private String RAddr;
    private Instant DOBo;
    private String TotalW;
    private String Category;
    private String DOD;
    private String Rph;
    private String Sph;
    public Long getOid() {
        return Oid;
    }

    public void setOid(Long oid) {
        this.Oid = oid;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String sName) {
        this.SName = sName;
    }

    public String getSrc() {
        return Src;
    }

    public void setSrc(String src) {
        this.Src = src;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        this. Des = des;
    }

    public String getMat()
    {
        return Mat;
    }

    public  void setMat(String mat)
    {
        this.Mat=mat;
    }
    public String getRName() {
        return RName;
    }

    public void setRName(String rName) {
        this.RName = rName;
    }

    public String getSAddr() {
        return SAddr;
    }

    public void setSAddr(String SAddr) {
        this.SAddr = SAddr;
    }

    public String getRAddr() {
        return RAddr;
    }

    public void setRAddr(String RAddr) {
        this.RAddr = RAddr;
    }



    public String getTotalW() {
        return TotalW;
    }

    public void setTotalW(String totalW) {
        this.TotalW = totalW;
    }

    public Instant getDOBo() {
        return DOBo;
    }

    public void setDOBo(Instant DOBo) {
        this.DOBo = DOBo;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        this.Category = category;
    }


    public String getDOD() {
        return DOD;
    }

    public void setDOD(String DOD) {
        this.DOD = DOD;
    }

    public String getRph() {
        return Rph;
    }

    public void setRph(String rph) {
        this.Rph = rph;
    }

    public String getSph() {
        return Sph;
    }

    public void setSph(String sph) {
        this.Sph = sph;
    }
}
