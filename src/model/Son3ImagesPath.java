package model;

import javafx.scene.image.Image;

public class Son3ImagesPath {

    private static final Image babyImg = new Image(Father.class.getResourceAsStream("/img/son3/baby4.png"));
    private static final Image childrenImg = new Image(Father.class.getResourceAsStream("/img/son3/children4.png"));
    private static final Image kidImg = new Image(Father.class.getResourceAsStream("/img/son3/kid4.png"));
    private static final Image teenImg = new Image(Father.class.getResourceAsStream("/img/son3/teen4.png"));
    private static final Image youngAdultImg = new Image(Father.class.getResourceAsStream("/img/son3/young_adult4.png"));
    private static final Image adultImg = new Image(Father.class.getResourceAsStream("/img/son3/adult4.png"));
    private static final Image oldImg = new Image(Father.class.getResourceAsStream("/img/son3/old4.png"));
    private static final Image graveImg = new Image(Father.class.getResourceAsStream("/img/son3/grave4.png"));

    public static Image getBabyImg() {
        return babyImg;
    }

    public static Image getChildrenImg() {
        return childrenImg;
    }

    public static Image getKidImg() {
        return kidImg;
    }

    public static Image getTeenImg() {
        return teenImg;
    }

    public static Image getYoungAdultImg() {
        return youngAdultImg;
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
