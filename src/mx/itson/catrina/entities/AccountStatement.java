/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import com.google.gson.Gson;
import java.util.List;

/**
 *
 * @author luism
 */
public class AccountStatement {
    private String account;
    private String clabe;
    private String currency;
    private Customer customer;
    private List<Transactions> transactions;

    public AccountStatement deserialize(String json){
        AccountStatement AS = new AccountStatement();
        
        try{
            AS = new Gson().fromJson(json, AccountStatement.class);
        } catch(Exception ex){
            System.err.print("Ocurrio un error: "+ ex.getMessage());
        }
        return AS;
    }
    
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    }
    
    
}
