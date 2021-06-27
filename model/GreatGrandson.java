package model;

import javafx.application.Platform;
import view.ScreenView;

public class GreatGrandson extends Grandson1 {

    @Override
    public void run() {
        for (int i = 0; i <= 12; i++) {
            int finalI = i;
            
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    if (finalI == 0) {
                        System.out.println("The great grandson was born.");
                        ScreenView.greatGrandsonYearsLbl.setText("The great grandson was born.");
                    } else {
                        System.out.println("I am the great grandson. I am " + finalI + " years old.");
                        ScreenView.greatGrandsonYearsLbl.setText("Age: " + finalI);
                    } // Fim do else

                    if (finalI >= 0 && finalI < 4) {
                        ScreenView.greatGrandsonView.setImage(GreatGrandsonImagesPath.getBabyImg());
                        ScreenView.greatGrandsonView.setFitHeight(125);
                    } else if (finalI >= 4 && finalI < 8) {
                        ScreenView.greatGrandsonView.setImage(GreatGrandsonImagesPath.getChildrenImg());
                        ScreenView.greatGrandsonView.setFitHeight(125);
                    } else if (finalI >= 8) {
                        ScreenView.greatGrandsonView.setImage(GreatGrandsonImagesPath.getKidImg());
                        ScreenView.greatGrandsonView.setFitHeight(125);

                        if (finalI == 12) {
                            System.out.println("The great grandson died.");
                            ScreenView.greatGrandsonYearsLbl.setText("Died at age: " + finalI);
                            ScreenView.greatGrandsonView.setImage(GreatGrandsonImagesPath.getGraveImg());
                            ScreenView.greatGrandsonView.setFitHeight(125);
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
} // Fim da classe GreatGrandson
