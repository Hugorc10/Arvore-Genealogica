package model;

import javafx.application.Platform;
import view.ScreenView;

public class Son3 extends Father {

    @Override
    public void run() {
        for (int i = 0; i <= 55; i++) {
            int finalI = i;
            
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    if (finalI == 0) {
                        System.out.println("The third son was born.");
                        ScreenView.son3YearsLbl.setText("The third son was born.");
                    } else {
                        System.out.println("I am the third son. I am " + finalI + " years old.");
                        ScreenView.son3YearsLbl.setText("Age: " + String.valueOf(finalI));
                    } // Fim do else

                    if (finalI >= 0 && finalI < 4) {
                        ScreenView.son3View.setImage(Son3ImagesPath.getBabyImg());
                        ScreenView.son3View.setFitHeight(125);
                    } else if (finalI >= 4 && finalI < 11) {
                        ScreenView.son3View.setImage(Son3ImagesPath.getChildrenImg());
                        ScreenView.son3View.setFitHeight(125);
                    } else if (finalI >= 11 && finalI < 14) {
                        ScreenView.son3View.setImage(Son3ImagesPath.getKidImg());
                        ScreenView.son3View.setFitHeight(125);
                    } else if (finalI >= 14 && finalI < 18) {
                        ScreenView.son3View.setImage(Son3ImagesPath.getTeenImg());
                        ScreenView.son3View.setFitHeight(125);
                    } else if (finalI >= 18 && finalI < 25) {
                        ScreenView.son3View.setImage(Son3ImagesPath.getYoungAdultImg());
                        ScreenView.son3View.setFitHeight(125);
                    } else if (finalI >= 25 && finalI < 45) {
                        ScreenView.son3View.setImage(Son3ImagesPath.getAdultImg());
                        ScreenView.son3View.setFitHeight(125);
                    } else if (finalI >= 45) {
                        ScreenView.son3View.setImage(Son3ImagesPath.getOldImg());
                        ScreenView.son3View.setFitHeight(125);

                        if (finalI == 55) {
                            System.out.println("The third son died.");
                            ScreenView.son3YearsLbl.setText("Died at age: " + String.valueOf(finalI));
                            ScreenView.son3View.setFitHeight(125);
                            ScreenView.son3View.setImage(FatherImagesPath.getGraveImg());
                        } // Fim do if
                    } // Fim do else-if
                }
            });

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } // Fim do for
    } // Fim do metodo run
} // Fim da classe Son3
