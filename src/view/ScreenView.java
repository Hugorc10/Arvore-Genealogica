package view;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import model.Father;

public class ScreenView {
    public static ImageView fatherView;
    public static ImageView son1View;
    public static ImageView son2View;
    public static ImageView son3View;
    public static ImageView grandson1View;
    public static ImageView grandson2View;
    public static ImageView greatGrandsonView;
    public static Label fatherYearsLbl;
    public static Label son1YearsLbl;
    public static Label son2YearsLbl;
    public static Label son3YearsLbl;
    public static Label grandson1YearsLbl;
    public static Label grandson2YearsLbl;
    public static Label greatGrandsonYearsLbl;

    public ScreenView() {
        Father father = new Father();
        // A thread do pai ira morrer a aplicacao ser fechada 
        father.setDaemon(true);
        // Inicia a thread do pai
        father.start();
    } // Fim do construtor 

    /**
     * Instancia, configura e retorna o painel com todos os seus nos filhos
     * 
     * @return Parent O no raiz
     */
    public Parent createContent() throws InterruptedException {
        Pane root = new Pane();
        root.setPrefSize(810, 680);
        // Seta a cor do background do painel
        root.setStyle("-fx-background-color: paleturquoise;");

        // Label do pai
        Label fatherLbl = new Label("Father");
        fatherLbl.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
        fatherLbl.setLayoutX(25);
        fatherLbl.setLayoutY(25);

        fatherView = new ImageView();
        // A imagem tera a proporcao preservada
        fatherView.setPreserveRatio(true);
        // Seta uma melhor qualidade de algoritmo de filtragem, 
        // porem o carregamento da imagem ficara mais lento 
        fatherView.setSmooth(true);
        fatherView.setX(25);
        fatherView.setY(60);

        fatherYearsLbl = new Label();
        fatherYearsLbl.setFont(Font.font("Verdana", FontWeight.MEDIUM, 18));
        fatherYearsLbl.setLayoutX(25);
        fatherYearsLbl.setLayoutY(190);

        // Label do primeiro filho
        Label son1Lbl = new Label("First Son");
        son1Lbl.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
        son1Lbl.setLayoutX(200);
        son1Lbl.setLayoutY(25);

        son1View = new ImageView();
        // A imagem tera a proporcao preservada
        son1View.setPreserveRatio(true);
        // Seta uma melhor qualidade de algoritmo de filtragem, 
        // porem o carregamento da imagem ficara mais lento 
        son1View.setSmooth(true);
        son1View.setX(200);
        son1View.setY(60);

        son1YearsLbl = new Label();
        son1YearsLbl.setFont(Font.font("Verdana", FontWeight.MEDIUM, 18));
        son1YearsLbl.setLayoutX(200);
        son1YearsLbl.setLayoutY(190);

        // Label do segundo filho
        Label son2Lbl = new Label("Second Son");
        son2Lbl.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
        son2Lbl.setLayoutX(400);
        son2Lbl.setLayoutY(25);

        son2View = new ImageView();
        // A imagem tera a proporcao preservada
        son2View.setPreserveRatio(true);
        // Seta uma melhor qualidade de algoritmo de filtragem, 
        // porem o carregamento da imagem ficara mais lento 
        son2View.setSmooth(true);
        son2View.setX(400);
        son2View.setY(60);

        son2YearsLbl = new Label();
        son2YearsLbl.setFont(Font.font("Verdana", FontWeight.MEDIUM, 18));
        son2YearsLbl.setLayoutX(400);
        son2YearsLbl.setLayoutY(190);

        // Label do terceiro filho
        Label son3Lbl = new Label("Third Son");
        son3Lbl.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
        son3Lbl.setLayoutX(600);
        son3Lbl.setLayoutY(25);

        son3View = new ImageView();
        // A imagem tera a proporcao preservada
        son3View.setPreserveRatio(true);
        // Seta uma melhor qualidade de algoritmo de filtragem, 
        // porem o carregamento da imagem ficara mais lento 
        son3View.setSmooth(true);
        son3View.setX(600);
        son3View.setY(60);

        son3YearsLbl = new Label();
        son3YearsLbl.setFont(Font.font("Verdana", FontWeight.MEDIUM, 18));
        son3YearsLbl.setLayoutX(600);
        son3YearsLbl.setLayoutY(190);

        // Label do primeiro neto
        Label grandon1Lbl = new Label("First Grandson");
        grandon1Lbl.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
        grandon1Lbl.setLayoutX(25);
        grandon1Lbl.setLayoutY(250);

        grandson1View = new ImageView();
        // A imagem tera a proporcao preservada
        grandson1View.setPreserveRatio(true);
        // Seta uma melhor qualidade de algoritmo de filtragem, 
        // porem o carregamento da imagem ficara mais lento 
        grandson1View.setSmooth(true);
        grandson1View.setX(25);
        grandson1View.setY(290);

        grandson1YearsLbl = new Label();
        grandson1YearsLbl.setFont(Font.font("Verdana", FontWeight.MEDIUM, 18));
        grandson1YearsLbl.setLayoutX(25);
        grandson1YearsLbl.setLayoutY(420);

        // Label do segundo neto
        Label grandson2Lbl = new Label("Second Grandson");
        grandson2Lbl.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
        grandson2Lbl.setLayoutX(225);
        grandson2Lbl.setLayoutY(250);

        grandson2View = new ImageView();
        // A imagem tera a proporcao preservada
        grandson2View.setPreserveRatio(true);
        // Seta uma melhor qualidade de algoritmo de filtragem, 
        // porem o carregamento da imagem ficara mais lento 
        grandson2View.setSmooth(true);
        grandson2View.setX(225);
        grandson2View.setY(290);

        grandson2YearsLbl = new Label();
        grandson2YearsLbl.setFont(Font.font("Verdana", FontWeight.MEDIUM, 18));
        grandson2YearsLbl.setLayoutX(225);
        grandson2YearsLbl.setLayoutY(420);

        // Label do bisneto
        Label greatGrandsonLbl = new Label("Great Grandson");
        greatGrandsonLbl.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
        greatGrandsonLbl.setLayoutX(25);
        greatGrandsonLbl.setLayoutY(480);

        greatGrandsonView = new ImageView();
        // A imagem tera a proporcao preservada
        greatGrandsonView.setPreserveRatio(true);
        // Seta uma melhor qualidade de algoritmo de filtragem, 
        // porem o carregamento da imagem ficara mais lento 
        greatGrandsonView.setSmooth(true);
        greatGrandsonView.setX(25);
        greatGrandsonView.setY(510);

        greatGrandsonYearsLbl = new Label();
        greatGrandsonYearsLbl.setFont(Font.font("Verdana", FontWeight.MEDIUM, 18));
        greatGrandsonYearsLbl.setLayoutX(25);
        greatGrandsonYearsLbl.setLayoutY(640);

        root.getChildren().addAll(fatherLbl, son1Lbl, son2Lbl, son3Lbl, grandon1Lbl, grandson2Lbl, greatGrandsonLbl,
                fatherYearsLbl, son1YearsLbl, son2YearsLbl, son3YearsLbl, grandson1YearsLbl, grandson2YearsLbl, greatGrandsonYearsLbl,
                fatherView, son1View, son2View, son3View, grandson1View, grandson2View, greatGrandsonView);

        return root;
    } // Fim do metodo createContent
} // Fim da classe ScreenView
