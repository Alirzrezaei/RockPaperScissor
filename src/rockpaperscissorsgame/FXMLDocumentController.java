/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissorsgame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import Logic.Game;

/**
 *
 * @author Rezaei
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label lblHumanWins;
    @FXML
    private Label lblBotWins;
    @FXML
    private Pane pnHuman;
    @FXML
    private Pane pnBot;
    
    
    
    
    private JavaFXGUI gui;
    @FXML
    private Pane pnRock;
    @FXML
    private Pane pnScissors;
    @FXML
    private Pane pnPaper;
    
    private Game game;
    @FXML
    private Label lblWinner;
    @FXML
    private ImageView imgVwHuman;
    @FXML
    private ImageView imgVwBot;
    @FXML
    private Button btnReset;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        this.gui = new JavaFXGUI(lblHumanWins, lblBotWins, imgVwHuman, imgVwBot, lblWinner);
         this.game = new Game(gui);
        
        
    }    

    @FXML
    private void pnRockOnMouseClick(MouseEvent event) {
        this.game.doPlay("ROCK");
    }

    @FXML
    private void PnScissorsOnMouseClick(MouseEvent event) {
        this.game.doPlay("SCISSORS");
    }

    @FXML
    private void pnPaperOnMouseClick(MouseEvent event) {
        this.game.doPlay("PAPER");
    }

    @FXML
    private void btnResetOnMouseClick(MouseEvent event) {
        this.game.reset();
    }
    
    
}
