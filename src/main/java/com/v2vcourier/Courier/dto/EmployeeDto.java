package com.v2vcourier.Courier.dto;

public class EmployeeDto {

    private String EmployeeName;
    private Long EmpId;
    private String EmpEmail;
    private String ro;
    private String BranchNam;
    private String BranchLo;
    private String Sal;

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.EmployeeName = employeeName;
    }

    public Long getEmpId() {
        return EmpId;
    }

    public void setEmpId(Long empId) {
        this.EmpId = empId;
    }

    public String getEmpEmail() {
        return EmpEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.EmpEmail = empEmail;
    }

    public String getRo() {
        return ro;
    }

    public void setRo(String ro) {
        this.ro = ro;
    }

    public String getBranchNam() {
        return BranchNam;
    }

    public void setBranchNam(String branchNam) {
       this. BranchNam = branchNam;
    }

    public String getBranchLo() {
        return BranchLo;
    }

    public void setBranchLo(String branchLo) {
        this.BranchLo = branchLo;
    }

    public String getSal() {
        return Sal;
    }

    public void setSal(String sal) {
        this.Sal = sal;
    }
}
