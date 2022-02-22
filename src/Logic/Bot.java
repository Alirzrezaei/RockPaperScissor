/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Random;

/**
 *
 * @author Rezaei
 */
public class Bot{
    
   
    
    protected Symbols ai(){
        
        Random rand = new Random();
        return Symbols.values()[rand.nextInt(3)];
    }
}
