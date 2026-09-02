package org.example.editor_video;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

public class BorderViewer {
    int width = 900;
    int height = 450;
    VBox children;

    BorderViewer(Rectangle node) {
        VBox rct = new VBox();
        rct.setPadding(new Insets(4));
        rct.getChildren().add(node);
        rct.setMinWidth(width);
        rct.setMinHeight(height);
        this.children = rct;
    }

    public void reductionWidth() {
        if(this.width == 0) return;
        this.width--;
    }

    public void expandingWidth() {
        if(this.width > 1000) return;
        this.width++;
    }
}
