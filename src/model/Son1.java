package model;

import javafx.application.Platform;
import view.ScreenView;

public class Son1 extends Father {

    Grandson1 grandson1;

    @Override
    public void run() {
        grandson1 = new Grandson1();
        
        for (int i = 0; i <= 61; i++) {
            int finalI = i;
            
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    if (finalI == 0) {
                        System.out.println("The first son was born.");
                        ScreenView.son1YearsLbl.setText("The first son was born.");
                    } else {
                        System.out.println("I am the first son. I am " + finalI + " years old.");
                        ScreenView.son1YearsLbl.setText("Age: " + finalI);
                    } // Fim do else

                    if (finalI <= 0 && finalI < 5) {
                        ScreenView.son1View.setImage(Son1ImagesPath.getBabyImg());
                        ScreenView.son1View.setFitHeight(100);
                    } else if (finalI >= 5 && finalI < 12) {
                        ScreenView.son1View.setImage(Son1ImagesPath.getKidImg());
                        ScreenView.son1View.setFitHeight(125);
                    } else if (finalI >= 12 && finalI < 24) {
                        ScreenView.son1View.setImage(Son1ImagesPath.getTeenImg());
                        ScreenView.son1View.setFitHeight(125);
                        if (finalI == 16 && !grandson1.isAlive()) {
                            grandson1.start();
                        }
                    } else if (finalI >= 24 && finalI < 40) {
                        ScreenView.son1View.setImage(Son1ImagesPath.getAdultImg());
                        ScreenView.son1View.setFitHeight(125);
                    } else if (finalI >= 40 && finalI < 55) {
                        ScreenView.son1View.setImage(Son1ImagesPath.getOldImg());
                        ScreenView.son1View.setFitHeight(125);
                    } else if (finalI >= 55) {
                        ScreenView.son1View.setImage(Son1ImagesPath.getSeniorImg());
                        ScreenView.son1View.setFitHeight(125);
                        
                        if (finalI == 61) {
                            System.out.println("The first son died.");
                            ScreenView.son1YearsLbl.setText("Died at age: " + String.valueOf(finalI));
                            ScreenView.son1View.setFitHeight(125);
                            ScreenView.son1View.setImage(FatherImagesPath.getGraveImg());
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
} // Fim da classe Son1

