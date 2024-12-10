/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contatore_caratteri_orsi;

/**
 *
 * @author ospite
 */
public class contatore {
    public String parola;
    public int conta = 0;
    
    public int n_caratteri(String parola){
        for(int i=0; i< parola.length(); i++){
            conta = conta + 1;
            
        }
        System.out.println(conta);
        return conta;
    }
}
