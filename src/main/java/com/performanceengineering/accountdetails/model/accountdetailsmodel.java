package com.performanceengineering.accountdetails.model;

public class accountdetailsmodel {

    private String accId;
    private String accnumber;

    public accountdetailsmodel(String accId, String accnumber) {
        this.accId = accId;
        this.accnumber = accnumber;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public String getAccnumber() {
        return accnumber;
    }

    public void setAccnumber(String accnumber) {
        this.accnumber = accnumber;
    }

}
