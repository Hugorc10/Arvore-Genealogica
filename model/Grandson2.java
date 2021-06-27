package model;

import javafx.application.Platform;
import view.ScreenView;

public class Grandson2 extends Son2 {

    @Override
    public void run() {
        for (int i = 0; i <= 33; i++) {
            int finalI = i;
            
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    if (finalI == 0) {
                        System.out.println("The second grandson was born.");
                        ScreenView.grandson2YearsLbl.setText("The second grandson was born.");
                    } else {
                        System.out.println("I am the second grandson. I am " + finalI + " years old.");
                        ScreenView.grandson2YearsLbl.setText("Age: " + finalI);
                    } // Fim do else

                    if (finalI >= 0 && finalI < 5) {
                        ScreenView.grandson2View.setImage(Grandson2ImagesPath.getBabyImg());
                        ScreenView.grandson2View.setFitHeight(125);
                    } else if (finalI >= 5 && finalI < 12) {
                        ScreenView.grandson2View.setImage(Grandson2ImagesPath.getKidImg());
                        ScreenView.grandson2View.setFitHeight(125);
                    } else if (finalI >= 12 && finalI < 18) {
                        ScreenView.grandson2View.setImage(Grandson2ImagesPath.getTeenImg());
                    } else if (finalI >= 18) {
                        ScreenView.grandson2View.setImage(Grandson2ImagesPath.getAdultImg());
                        ScreenView.grandson2View.setFitHeight(125);

                        if (finalI == 33) {
                            System.out.println("The second grandson died.");
                            ScreenView.grandson2YearsLbl.setText("Died at age: " + finalI);
                            ScreenView.grandson2View.setFitHeight(125);
                            ScreenView.grandson2View.setImage(Grandson2ImagesPath.getGraveImg());
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
} // Fim da classe Grandson2
