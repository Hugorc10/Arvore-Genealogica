package model;

import javafx.scene.image.Image;

public class Son1ImagesPath {

    private static final Image babyImg = new Image(Father.class.getResourceAsStream("/img/son1/baby2.png"));
    private static final Image kidImg = new Image(Father.class.getResourceAsStream("/img/son1/kid2.png"));
    private static final Image teenImg = new Image(Father.class.getResourceAsStream("/img/son1/teen2.png"));
    private static final Image adultImg = new Image(Father.class.getResourceAsStream("/img/son1/adult2.png"));
    private static final Image oldImg = new Image(Father.class.getResourceAsStream("/img/son1/old2.png"));
    private static final Image seniorImg = new Image(Father.class.getResourceAsStream("/img/son1/very_old2.png"));
    private static final Image graveImg = new Image(Father.class.getResourceAsStream("/img/son1/grave2.png"));

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

    public static Image getSeniorImg() {
        return seniorImg;
    }

    public static Image getGraveImg() {
        return graveImg;
    }
}
