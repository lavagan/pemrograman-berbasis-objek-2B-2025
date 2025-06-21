/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public interface Borrowable {
    void borrow(String borrower);
    void returnBook();
    boolean isBorrowed();
    String getBorrower();
}
