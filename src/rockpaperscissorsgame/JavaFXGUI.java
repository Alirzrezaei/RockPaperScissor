/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissorsgame;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author Rezaei
 */
public class JavaFXGUI {
    private ImageView imgVwHuman;
    private ImageView imgVwBot;
    
    private Label lblHumanWins;
    private Label lblBotWins;
    
    private Pane pnHuman;
    private Pane pnBot;
    private Label lblWinner;
    
    private String WINNER_TEXT = "The winner is ";
    
    private String imgPaper = "rockpaperscissorsgame/img/paper.png";
    private String imgRock = "rockpaperscissorsgame/img/rock.png";
    private String imgScissors = "rockpaperscissorsgame/img/scissors.png";
    
    public JavaFXGUI(Label lblHumanWins, Label lblBotWins, ImageView imgVwHuman, ImageView imgVwBot, Label lblWinner){
        
        this.pnBot = pnBot;
        this.pnHuman = pnHuman;
        this.lblWinner = lblWinner;
        
        this.lblBotWins = lblBotWins;
        this.lblHumanWins = lblHumanWins;
        
        this.imgVwHuman = imgVwHuman;
        this.imgVwBot =imgVwBot;
        this.lblWinner.setText(this.WINNER_TEXT);
            
    }
    public void reset(){
        
    }
    public void updateGUI(int humanWins, int botWins, String humanChoice, String botChoice, String winner){
        String s = this.WINNER_TEXT + winner;
        
        this.lblWinner.setText(s);
        
        if(!botChoice.equals("")){
            this.imgVwBot.setImage(new Image(getImage(botChoice)));
        }else{
            this.imgVwBot.setImage(null);
        }
        if(!humanChoice.equals("")){
            this.imgVwHuman.setImage(new Image(getImage(humanChoice)));
        }else{
            this.imgVwHuman.setImage(null);
        }
        
        
        this.lblBotWins.setText(""+botWins);
        this.lblHumanWins.setText(""+humanWins);
        
        
    }
    private String getImage(String playerChoice){
        
        if(playerChoice.equals("PAPER")){
            return imgPaper;
        }else if(playerChoice.equals("ROCK")){
            return imgRock;
        }else if(playerChoice.equals("SCISSORS")){
            return imgScissors;
        }
        
        return "";
    }
}
