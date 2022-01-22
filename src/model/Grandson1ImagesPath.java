package model;

import javafx.scene.image.Image;

public class Grandson1ImagesPath {

    private static final Image babyImg = new Image(Father.class.getResourceAsStream("/img/grandson1/baby5.png"));
    private static final Image kidImg = new Image(Father.class.getResourceAsStream("/img/grandson1/kid5.png"));
    private static final Image teenImg = new Image(Father.class.getResourceAsStream("/img/grandson1/teen5.png"));
    private static final Image youngImg = new Image(Father.class.getResourceAsStream("/img/grandson1/young5.png"));
    private static final Image adultImg = new Image(Father.class.getResourceAsStream("/img/grandson1/adult5.png"));
    private static final Image graveImg = new Image(Father.class.getResourceAsStream("/img/grandson1/grave5.png"));

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

    public static Image getGraveImg() {
        return graveImg;
    }
}
