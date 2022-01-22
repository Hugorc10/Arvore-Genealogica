package model;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import view.ScreenView;

public class Father extends Thread {

    Son1 son1;
    Son2 son2;
    Son3 son3;

    @Override
    public void run() {
        son1 = new Son1();
        son2 = new Son2();
        son3 = new Son3();
        
        for (int i = 0; i <= 90; i++) {
            int finalI = i;
            
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    if (finalI == 0) {
                        System.out.println("The father was born.");
                        ScreenView.fatherYearsLbl.setText("The father was born.");
                    } else {
                        System.out.println("I am the father. I am " + finalI + " years old.");
                        ScreenView.fatherYearsLbl.setText("Age: " + finalI);
                    } // fim do else

                    if (finalI >= 0 && finalI < 4) {
                        ScreenView.fatherView.setImage(FatherImagesPath.getBabyImg());
                        ScreenView.fatherView.setFitHeight(100);
                    } else if (finalI >= 4 && finalI < 12) {
                        ScreenView.fatherView.setImage(FatherImagesPath.getKidImg());
                        ScreenView.fatherView.setFitHeight(125);
                    } else if (finalI >= 12 && finalI < 18) {
                        ScreenView.fatherView.setImage(FatherImagesPath.getTeenImg());
                        ScreenView.fatherView.setFitHeight(125);
                    } else if (finalI >= 18 && finalI < 30) {
                        ScreenView.fatherView.setImage(FatherImagesPath.getYoungImg());
                        ScreenView.fatherView.setFitHeight(125);
                        if (finalI == 22 && !son1.isAlive()) {
                            son1.start();
                        } // Fim do if
                        if (finalI == 25 && !son2.isAlive()) {
                            son2.start();
                        } // Fim do if
                    } else if (finalI >= 30 && finalI < 50) {
                        ScreenView.fatherView.setImage(FatherImagesPath.getAdultImg());
                        ScreenView.fatherView.setFitHeight(125);

                        if (finalI == 32 && !son3.isAlive()) {
                            son3.start();
                        } // Fim do if
                    } else if (finalI == 50 && finalI < 70) {
                        ScreenView.fatherView.setImage(FatherImagesPath.getOldImg());
                        ScreenView.fatherView.setFitHeight(125);
                    } else if (finalI >= 70) {
                        ScreenView.fatherView.setImage(FatherImagesPath.getSeniorImg());
                        ScreenView.fatherView.setFitHeight(125);

                        if (finalI == 90) {
                            System.out.println("The father died.");
                            ScreenView.fatherYearsLbl.setText("Died at age " + String.valueOf(finalI));
                            ScreenView.fatherView.setImage(FatherImagesPath.getGraveImg());
    
                            Pane secondPane = new Pane();
                            secondPane.setPrefSize(711, 400);
    
                            Image rickAndMortyImg = new Image(Father.class.getResourceAsStream("/img/gif/rick_and_morty.gif"));
    
                            BackgroundSize backgroundSize = new BackgroundSize(711, 400, true,
                                    true, true, false);
    
                            BackgroundImage backgroundImage = new BackgroundImage(rickAndMortyImg, null, null,
                                    BackgroundPosition.CENTER, backgroundSize);
    
                            Background background = new Background(backgroundImage);
    
                            secondPane.setBackground(background);
    
                            Stage stage = new Stage();
                            stage.setTitle("Rick and Morty");
                            stage.setScene(new Scene(secondPane));
                            stage.setResizable(false);
                            stage.show();
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
} // Fim da classe Father
