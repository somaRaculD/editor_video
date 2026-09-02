module org.example.editor_video {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.editor_video to javafx.fxml;
    exports org.example.editor_video;
}