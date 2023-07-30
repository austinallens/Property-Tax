/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem Exam 2
 * File Name: PropertyTax.java
 */

//Displays PropertyPane.java

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PropertyTax extends Application {
    public void start(Stage s) {
        
        //Begins scene for Tax Calculator
        Scene scene = new Scene(new PropertyPane(), 300, 150);
        
        s.setTitle("Tax Calculator");
        s.setScene(scene);
        s.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
