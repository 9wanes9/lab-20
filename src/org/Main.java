package org;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.*;

public class Main extends Application{
    Label response;
         static Button baget=new Button("Zhmi");
         Button sushka=new Button("Poimai");
    public static void main(String[] args) {
        System.out.println("Play JFX");
        launch(args);
    }
    public void init(){
        System.out.println("В теле метода init()");
    }
    public void start(Stage myStage){
        System.out.println("В теле метода start()");
        myStage.setTitle("JFX Skeleton");
        FlowPane rootNode=new FlowPane(10,10);
        Scene myScene=new Scene(rootNode, 400,200);
        myStage.setScene(myScene);
        response = new Label ( " Push а Buton") ;
        baget.setOnAction ( new EventHandler<ActionEvent> (){
        @Override
        public void handle( ActionEvent ae) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information");
            alert.setHeaderText(null);
            alert.setContentText("Zacroi");
            alert.showAndWait();
            response . setText ( "Zhmi was pressed.") ;
        }
    } ) ;
        sushka.setOnAction ( new EventHandler<ActionEvent> (){
            @Override
            public void handle( ActionEvent ae) {
                response . setText ( "Poimai was pressed.") ; 
            }
        } ) ;
         sushka.setOnMouseEntered(event -> {
            double x = 2.5*sushka.getWidth() + (Math.random() * 100);
            double y = 2.5*sushka.getHeight() + (Math.random() * 80);
            sushka.setLayoutX(x);
            sushka.setLayoutY(y);
        });
        Pane pane = new Pane();
        response.setLayoutX(50.0);
        response.setLayoutY(5.0);
        sushka.setLayoutX(140.0);
        pane.getChildren().addAll(baget,response,sushka);
        rootNode.getChildren().addAll(pane);
        myStage.show();
    }
}



