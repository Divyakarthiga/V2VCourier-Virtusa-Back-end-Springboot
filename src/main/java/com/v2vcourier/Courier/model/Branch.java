package com.v2vcourier.Courier.model;

import javax.persistence.*;

@Entity
@Table
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Bid;
    @Column
    private String BName;
    @Column
    private String MainBrAdd;

    public String getBName() {
        return BName;
    }

    public void setBName(String BName) {
        this.BName = BName;
    }

    public Long getBid() {
        return Bid;
    }

    public void setBid(Long bid) {
        this.Bid = bid;
    }

    public String getMainBrAdd() {
        return MainBrAdd;
    }

    public void setMainBrAdd(String mainBrAdd) {
        this.MainBrAdd = mainBrAdd;
    }
}
