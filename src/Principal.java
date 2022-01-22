/**
 * Created by Hugo Teixeira Mafra <hugorc10@hotmail.com> on 26/07/2018. Last modification on 29/07/2018.
 * <br>
 * Enrollment number: 201611540
 * <br>
 * Family Tree with Thread it is a software that simulates a family tree using thread in java,
 * in order to better understand the operation of processes and their hierarchy.
 * <br>
 * MIT License
 * <br>
 * Copyright (c) 2018 Hugo Mafra
 * <br>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <br>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <br>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
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
        // A largura e a altura da janela serao igual ao tamanho do conteudo da cena
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    } // fim do metodo main
} // Fim da classe Principal
