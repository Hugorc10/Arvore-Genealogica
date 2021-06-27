package model;

import javafx.scene.image.Image;

public class FatherImagesPath {

    private static final Image babyImg = new Image(Father.class.getResourceAsStream("/img/father/baby1.png"));
    private static final Image kidImg = new Image(Father.class.getResourceAsStream("/img/father/kid1.png"));
    private static final Image teenImg = new Image(Father.class.getResourceAsStream("/img/father/teen1.png"));
    private static final Image youngImg = new Image(Father.class.getResourceAsStream("/img/father/young1.png"));
    private static final Image adultImg = new Image(Father.class.getResourceAsStream("/img/father/adult1.png"));
    private static final Image oldImg = new Image(Father.class.getResourceAsStream("/img/father/old1.png"));
    private static final Image seniorImg = new Image(Father.class.getResourceAsStream("/img/father/very_old1.png"));
    private static final Image graveImg = new Image(Father.class.getResourceAsStream("/img/father/grave1.png"));

    public static Image getBabyImg() {
        return babyImg;
    }

    public static Image getKidImg() {
        return kidImg;
    }

    public static Image getTeenImg() {
        return teenImg;
    }

    public static Image getYoungImg() {
        return youngImg;
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
