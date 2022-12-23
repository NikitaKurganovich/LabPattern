package com.example;

import java.io.Serializable;
import java.util.List;

public class AllUsers implements Serializable{
    private List<Account> accountList;

    public AllUsers(List<Account> _accountList){
        this.accountList = _accountList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
}
