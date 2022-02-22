/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import rockpaperscissorsgame.JavaFXGUI;

/**
 *
 * @author Rezaei
 */
public class Game {
    
    private Bot botPlayer;
    private Symbols humanSymbol;
    private Symbols botSymbol;
    private String winner;
    
    private int humanWins = 0;
    private int botWins = 0;
    private JavaFXGUI gui;
    
    public Game(JavaFXGUI gui){
        
      
        this.botPlayer = new Bot();
        
        this.botSymbol = Symbols.PAPER;
        this.humanSymbol = Symbols.PAPER;
        this.gui = gui;
        

    }
    
    public void doPlay(String humanChoice){
        humanChoice = humanChoice.toUpperCase();
        if(humanChoice.equals("PAPER")){
            this.humanSymbol = Symbols.PAPER;
        }else if(humanChoice.equals("ROCK")){
            this.humanSymbol = Symbols.ROCK;
        }else if(humanChoice.equals("SCISSORS")){
            this.humanSymbol = Symbols.SCISSORS;
        }
        botPlay();
    }
    private void botPlay(){
        this.botSymbol = botPlayer.ai();
        winner();
        updateGUI();
    }
    private void updateGUI(){
        this.gui.updateGUI(humanWins, botWins, this.humanSymbol.toString(), this.botSymbol.toString(), winner);
    }
    private void winner(){
        
        if(this.humanSymbol == this.botSymbol){
            this.winner = "nobody";
        }else if(this.humanSymbol == Symbols.PAPER){
            if(this.botSymbol == Symbols.ROCK){
                this.winner = "human";
            }else{
                this.winner = "bot";
            }
        }else if(this.humanSymbol == Symbols.ROCK){
            if(this.botSymbol == Symbols.PAPER){
                this.winner = "bot";
            }else{
                this.winner = "human";
            }
        }else if(this.humanSymbol == Symbols.SCISSORS){
             if(this.botSymbol == Symbols.ROCK){
                this.winner = "bot";
            }else{
                this.winner = "human";
            }
        }
        
       if(this.winner.equals("human")){
           this.humanWins++;
       }else if(this.winner.equals("bot")){
           this.botWins++;
       }
    }
    public void reset(){
        this.humanWins = 0;
        this.botWins = 0;
        
        gui.updateGUI(humanWins, botWins, "", "", "");
    }
}
