/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.catrina.enums;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Luis Blasco, Mario Le Blohic, Emiliano Bojorquez
 * Clase enum que crea los depositos y los retiros y los serializa dependiendo de su numero.
 */
public enum TypeTransaction {
    // Reconoce el numero 1, como viene en el .json como DEPOSIT.
    @SerializedName("1")
            DEPOSIT,
    // Reconoce el numero 2, como viene en el .json como WITHDRAW.
    @SerializedName("2")
            WITHDRAW
}
