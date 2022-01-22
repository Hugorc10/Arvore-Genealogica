/*
 * Created by Hugo Teixeira Mafra <hugorc10@hotmail.com> on 26/07/2018. Last modification on 29/07/2018.
 * <p>
 * Enrollment number: 201611540
 * <p>
 * Family Tree with Thread it is a software that simulates a family tree using thread in java,
 * in order to better understand the operation of processes and their hierarchy.
 * <p>
 * Family Tree with Thread is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * Family Tree with Thread is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * To see the GNU General Public License
 * please visit this site: <http://www.gnu.org/licenses/>.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.ScreenView;

public class Principal extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Family Tree with Thread.");

        ScreenView screenView = new ScreenView();
        primaryStage.setScene(new Scene(screenView.createContent()));
        // Seta como nao redimensionavel
        primaryStage.setResizable(true);
        // A largura e a altura da janela sera igual ao tamanho do conteudo da cena
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    } // fim do metodo main
} // Fim da classe Principal
