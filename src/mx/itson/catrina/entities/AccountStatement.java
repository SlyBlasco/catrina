/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import com.google.gson.Gson;
import java.util.List;

/**
 *
 * @author Luis Blasco, Mario Le Blohic, Emiliano Bojorquez
 *  Clase central en el que se inician las variables de una cuenta, se instancian las otras clases y se crea el metodo de deserializacion.
 */
public class AccountStatement {
    private String account;
    private String clabe;
    private String currency;
    private Customer customer;
    private List<Transactions> transactions;
    // Método para deserializar un json y llevar los datos a sus variables.
    public AccountStatement deserialize(String json){
        AccountStatement AS = new AccountStatement();
        
        try{
            AS = new Gson().fromJson(json, AccountStatement.class);
        } catch(Exception ex){
            System.err.print("Ocurrio un error: "+ ex.getMessage());
        }
        return AS;
    }
    
   /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return the clabe
     */
    public String getClabe() {
        return clabe;
    }

    /**
     * @param clabe the clabe to set
     */
    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the transactions
     */
    public List<Transactions> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    } 
    
}
