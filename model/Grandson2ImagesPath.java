package model;

import javafx.scene.image.Image;

public class Grandson2ImagesPath {

    private static final Image babyImg = new Image(Father.class.getResourceAsStream("/img/grandson2/baby6.png"));
    private static final Image kidImg = new Image(Father.class.getResourceAsStream("/img/grandson2/kid6.png"));
    private static final Image teenImg = new Image(Father.class.getResourceAsStream("/img/grandson2/teen6.png"));
    private static final Image adultImg = new Image(Father.class.getResourceAsStream("/img/grandson2/adult6.png"));
    private static final Image graveImg = new Image(Father.class.getResourceAsStream("/img/grandson2/grave6.png"));

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

    public static Image getGraveImg() {
        return graveImg;
    }
}
