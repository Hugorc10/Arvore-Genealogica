package model;

import javafx.application.Platform;
import view.ScreenView;

public class Grandson1 extends Son1 {

    GreatGrandson greatGrandson;

    @Override
    public void run() {
        greatGrandson = new GreatGrandson();
        
        for (int i = 0; i <= 35; i++) {
            int finalI = i;
            
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    if (finalI == 0) {
                        System.out.println("The first grandson was born.");
                        ScreenView.grandson1YearsLbl.setText("The father was born.");
                    } else {
                        System.out.println("I am the first grandson. I am " + finalI + " years old.");
                        ScreenView.grandson1YearsLbl.setText("Age: " + finalI);
                    } // Fim do else

                    if (finalI >= 0 && finalI < 5) {
                        ScreenView.grandson1View.setImage(Grandson1ImagesPath.getBabyImg());
                        ScreenView.grandson1View.setFitHeight(125);
                    } else if (finalI >= 5 && finalI < 12) {
                        ScreenView.grandson1View.setImage(Grandson1ImagesPath.getKidImg());
                        ScreenView.grandson1View.setFitHeight(125);
                    } else if (finalI >= 12 && finalI < 18) {
                        ScreenView.grandson1View.setImage(Grandson1ImagesPath.getTeenImg());
                        ScreenView.grandson1View.setFitHeight(125);
                    } else if (finalI >= 18 && finalI < 30) {
                        ScreenView.grandson1View.setImage(Grandson1ImagesPath.getYoungImg());
                        ScreenView.grandson1View.setFitHeight(125);
                    } else if (finalI >= 30) {
                        ScreenView.grandson1View.setImage(Grandson1ImagesPath.getAdultImg());
                        ScreenView.grandson1View.setFitHeight(125);

                        if (finalI == 30) {
                            greatGrandson.start();
                        } // Fim do if
                        if (finalI == 35) {
                            System.out.println("The first grandson died.");
                            ScreenView.grandson1YearsLbl.setText("Died at age: " + finalI);
                            ScreenView.grandson1View.setFitHeight(125);
                            ScreenView.grandson1View.setImage(Grandson1ImagesPath.getGraveImg());
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
} // Fim da classe Grandson1
