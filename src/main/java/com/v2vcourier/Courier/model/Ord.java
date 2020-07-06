package com.v2vcourier.Courier.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.time.Instant;


@Entity
@Table
public class Ord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Oid;
    @Column
    private String SName;
    @Column
    private String Src;
    @Column
    private String Des;
    @Column
    private String Mat;
    @Column
    private String RName;
    @Column
    @Lob
    private String SAddr;
    @Column
    @Lob
    private String RAddr;
    @Column
    private Instant DOBo;
    @Column
    private String TotalW;
    @Column
    private String Category;
    @Column
    private String DOD;
    @Column
    @Pattern(regexp = "(^$|[0-9]{10})")
    private String Sph;
    @Pattern(regexp = "(^$|[0-9]{10})")
    private String Rph;


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

    public Instant getDOBo() {
        return DOBo;
    }

    public void setDOBo(Instant DOBo) {
        this.DOBo = DOBo;
    }

    public String getTotalW() {
        return TotalW;
    }

    public void setTotalW(String totalW) {
        this.TotalW = totalW;
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


    public String getSph() {
        return Sph;
    }

    public void setSph(String sph) {
       this.Sph = sph;
    }

    public String getRph() {
        return Rph;
    }

    public void setRph(String rph) {
        this.Rph = rph;
    }
}
