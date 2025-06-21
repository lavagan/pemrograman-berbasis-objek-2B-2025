/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public interface Reservable {
    void reserve(String reserver);
    void cancelReservation();
    boolean isReserved();
    String getReserver();
}
