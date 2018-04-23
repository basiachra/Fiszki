package gui;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Menu menu = new Menu();
        menu.showMenu();
    }

    public static void main(String[] args){
        launch(args);
    }


}
