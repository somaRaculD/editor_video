package org.example.editor_video;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class ViewerMovie {
   public ViewerMovie(Node node) {
       Rectangle rct = new Rectangle(900, 450);
       rct.setFill(new Color(0.1,0.1,0.1,0.9));
       Group gp = ((Group)node);
       gp.getChildren().add(new BorderViewer(rct).children);
   }
}
