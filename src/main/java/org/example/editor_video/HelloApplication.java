package org.example.editor_video;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import javax.swing.text.html.CSS;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(new Group());
        new ViewerMovie(scene.getRoot());
        stage.setTitle("Editor Video");
        stage.setScene(scene);
        stage.show();
    }
}
