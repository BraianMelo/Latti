package com.braian.latti;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.text.Font;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
    	
    	Font fonte = Font.loadFont(getClass().getResourceAsStream("css/fontes/Chonky_Bunny.ttf"), 10);
    	Image icone = new Image(getClass().getResourceAsStream("imagens/icon-latti.png"));

        scene = new Scene(loadFXML("Menu"));
        stage.getIcons().add(icone);
        stage.setTitle("Latti");
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("fxmls/"+ fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
