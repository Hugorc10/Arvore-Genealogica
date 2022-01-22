package model;

import javafx.application.Platform;
import view.ScreenView;

public class Son2 extends Father {

    Grandson2 grandson2;

    @Override
    public void run() {
        grandson2 = new Grandson2();
        
        for (int i = 0; i <= 55; i++) {
            int finalI = i;
            
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    if (finalI == 0) {
                        System.out.println("The second son was born.");
                        ScreenView.son2YearsLbl.setText("The second son was born.");
                    } else {
                        System.out.println("I am the second son. I am " + finalI + " years old");
                        ScreenView.son2YearsLbl.setText("Age: " + finalI);
                    } // Fim do else

                    if (finalI >= 0 && finalI < 5) {
                        ScreenView.son2View.setImage(Son2ImagesPath.getBabyImg());
                        ScreenView.son2View.setFitHeight(125);
                    } else if (finalI >= 5 && finalI < 12) {
                        ScreenView.son2View.setImage(Son2ImagesPath.getKidImg());
                        ScreenView.son2View.setFitHeight(125);
                    } else if (finalI >= 12 && finalI < 18) {
                        ScreenView.son2View.setImage(Son2ImagesPath.getTeenImg());
                        ScreenView.son2View.setFitHeight(125);
                    } else if (finalI >= 18 && finalI < 30) {
                        ScreenView.son2View.setImage(Son2ImagesPath.getAdultImg());
                        ScreenView.son2View.setFitHeight(125);
                        if (finalI == 20) {
                            grandson2.start();
                        }
                    } else if (finalI >= 30) {
                        ScreenView.son2View.setImage(Son2ImagesPath.getOldImg());
                        ScreenView.son2View.setFitHeight(125);
                        
                        if (finalI == 55) {
                            System.out.println("The second son died.");
                            ScreenView.son2YearsLbl.setText("Died at age: " + String.valueOf(finalI));
                            ScreenView.son2View.setFitHeight(125);
                            ScreenView.son2View.setImage(FatherImagesPath.getGraveImg());
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
} // Fim da classe Son2
