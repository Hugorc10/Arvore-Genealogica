package model;

import javafx.scene.image.Image;

public class GreatGrandsonImagesPath {

    private static final Image babyImg = new Image(Father.class.getResourceAsStream("/img/greatgrandson/baby7.png"));
    private static final Image childrenImg = new Image(Father.class.getResourceAsStream("/img/greatgrandson/children7.png"));
    private static final Image kidImg = new Image(Father.class.getResourceAsStream("/img/greatgrandson/kid7.png"));
    private static final Image graveImg = new Image(Father.class.getResourceAsStream("/img/greatgrandson/grave7.png"));

    public static Image getBabyImg() {
        return babyImg;
    }

    public static Image getChildrenImg() {
        return childrenImg;
    }

    public static Image getKidImg() {
        return kidImg;
    }

    public static Image getGraveImg() {
        return graveImg;
    }
}
