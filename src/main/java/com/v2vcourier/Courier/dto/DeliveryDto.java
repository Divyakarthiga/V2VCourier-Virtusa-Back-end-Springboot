package com.v2vcourier.Courier.dto;

public class DeliveryDto {
    private Long Did;
    private String BBname;
    private String BL;
    private String Shin;
    private String DB;
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
        this.DofD = dofD;
    }
}
