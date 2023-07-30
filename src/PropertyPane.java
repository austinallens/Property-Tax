/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem Exam 2
 * File Name: PropertyPane.java
 */

//Creates the Pane for PropertyTax.java to display

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.geometry.*;

public class PropertyPane extends GridPane {
    
    // Variables
    private Label result1, result2;
    private TextField actValue, perTax;
    public PropertyPane() {
        //Creates all the Labels so they can be added into the scene
        
        Label inputLabel1 = new Label("Actual Value");
        GridPane.setHalignment(inputLabel1,HPos.RIGHT);
        
        Label inputLabel2 = new Label("Property Tax Percentage"
                + " \n(ex. 0.64 or 0.0064)");
        GridPane.setHalignment(inputLabel2,HPos.RIGHT);
        
        Label outputLabel1 = new Label("Assesment Value");
        GridPane.setHalignment(outputLabel1, HPos.RIGHT);
        
        Label outputLabel2 = new Label("Property Tax");
        GridPane.setHalignment(outputLabel2,HPos.RIGHT);
                
        result1 = new Label ("---");
        GridPane.setHalignment(result1, HPos.CENTER);
        
        result2 = new Label ("---");
        GridPane.setHalignment(result2, HPos.CENTER);
        
        //Sets up the Text fields for Actual Value and the Property Tax Percent
        
        actValue = new TextField();
        actValue.setPrefWidth(50);
        actValue.setAlignment(Pos.CENTER);
        actValue.setOnAction(this::processReturn);
        
        perTax = new TextField();
        perTax.setPrefWidth(50);
        perTax.setAlignment(Pos.CENTER);
        perTax.setOnAction(this::processReturn);
        
        //Sets up the Scene and positioning of the labels and Text Fields
        
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        
        add (inputLabel1, 0,0);
        add (actValue,1,0);
        add (inputLabel2,0,1);
        add (perTax, 1, 1);
        add(outputLabel1,1,2);
        add(outputLabel2,1,3);
        add(result1,0,2);
        add(result2,0,3);
    }
    public void processReturn(ActionEvent Event){
        //Reads the input and does the required math
        
        double actualValue = Double.parseDouble(actValue.getText());
        double percentTax = Double.parseDouble(perTax.getText());
        double asValue = (actualValue) * .6;
        result1.setText(asValue + "");
        double propTax = (asValue) * percentTax;
        result2.setText(propTax + "");

        
    }
}
