/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Hp
 */
public class PasswordConfig {
    
      public String encrypt(String text){
        return BCrypt.hashpw(text,BCrypt.gensalt(10));
    }
    public boolean decrypt(String rowPassword, String encryptedPassword){
        return BCrypt.checkpw(rowPassword,encryptedPassword);
    }
    
}
