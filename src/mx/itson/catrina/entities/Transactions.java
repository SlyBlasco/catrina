/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import mx.itson.catrina.enums.TypeTransaction;

/**
 *
 * @author Luis Blasco, Mario Le Blohic, Emiliano Bojorquez
 * Clase que crea las variables necesarias de una transaccion.
 */
public class Transactions {
    private String date;
    private String description;
    private double amount;
    private TypeTransaction type;
    
    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the type
     */
    public TypeTransaction getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(TypeTransaction type) {
        this.type = type;
    }
}
