/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scheduleapp;

/**
 *
 * @author tvnmt
 */
public class Member extends User{

    double rating;
    level Rank;
    enum level {BEGINER , INTERMEDIATE, ADVANCED}
    public Member() {
    }

    public Member(String username, String emale, String phoneNumber) {
        super(username, emale, phoneNumber);
        
    }    
}
