package com.v2vcourier.Courier.dto;

public class BranchDto {
    private Long Bid;
    private String BName;
    private String MainBrAdd;

    public Long getBid() {
        return Bid;
    }

    public void setBid(Long bid) {
        this.Bid = bid;
    }

    public String getBName() {
        return BName;
    }

    public void setBName(String BName) {
        this.BName = BName;
    }

    public String getMainBrAdd() {
        return MainBrAdd;
    }

    public void setMainBrAdd(String mainBrAdd) {
        this.MainBrAdd = mainBrAdd;
    }
}
