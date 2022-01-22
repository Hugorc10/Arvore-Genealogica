package model;

import javafx.scene.image.Image;

public class Son2ImagesPath {

    private static final Image babyImg = new Image(Father.class.getResourceAsStream("/img/son2/baby3.png"));
    private static final Image kidImg = new Image(Father.class.getResourceAsStream("/img/son2/kid3.png"));
    private static final Image teenImg = new Image(Father.class.getResourceAsStream("/img/son2/teen3.png"));
    private static final Image adultImg = new Image(Father.class.getResourceAsStream("/img/son2/adult3.png"));
    private static final Image oldImg = new Image(Father.class.getResourceAsStream("/img/son2/old3.png"));
    private static final Image graveImg = new Image(Father.class.getResourceAsStream("/img/son2/grave3.png"));

    public static Image getBabyImg() {
        return babyImg;
    }

    public static Image getKidImg() {
        return kidImg;
    }

    public static Image getTeenImg() {
        return teenImg;
    }

    public static Image getAdultImg() {
        return adultImg;
    }

    public static Image getOldImg() {
        return oldImg;
    }

    public static Image getGraveImg() {
        return graveImg;
    }
}
