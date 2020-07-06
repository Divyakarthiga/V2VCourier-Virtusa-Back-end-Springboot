package com.v2vcourier.Courier.model;

import javax.persistence.*;

@Entity
@Table
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Did;
    @Column
    private String BBname;
    @Column
    private String BL;
    @Column
    private String Shin;
    @Column
    private String DB;
    @Column
    private String DofD;

    public Long getDid() {
        return Did;
    }

    public void setDid(Long did) {
        Did = did;
    }

    public String getBBname() {
        return BBname;
    }

    public void setBBname(String BBname) {
        this.BBname = BBname;
    }

    public String getBL() {
        return BL;
    }

    public void setBL(String BL) {
        this.BL = BL;
    }

    public String getShin() {
        return Shin;
    }

    public void setShin(String shin) {
       this.Shin = shin;
    }

    public String getDB() {
        return DB;
    }

    public void setDB(String DB) {
        this.DB = DB;
    }

    public String getDofD() {
        return DofD;
    }

    public void setDofD(String dofD) {
       this. DofD = dofD;
    }
}
