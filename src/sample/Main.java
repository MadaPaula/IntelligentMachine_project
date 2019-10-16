package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import sample.state.Stari;

public class Main extends Application {

    public static Scene scene;
    TextArea textArea;
    RadioButton starePornitaRb;
    RadioButton stareOpritaRb;
    Button comanda1;
    Button comanda2;
    CheckBox abonatMasina;
    RadioButton utilizator1;
    RadioButton utilizator2;

    Controller controller;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        scene = new Scene(root, 600, 500);
        primaryStage.setScene(scene);

        textArea = (TextArea) scene.lookup("#textArea");

        starePornitaRb = (RadioButton) scene.lookup("#starePornitaRb");
        starePornitaRb.setOnAction(this::handlerStarePornita);

        stareOpritaRb = (RadioButton) scene.lookup("#stareOpritaRb");
        stareOpritaRb.setOnAction(this::handlerStareOprita);

        comanda1 = (Button) scene.lookup("#comanda1");
        comanda1.setOnAction(this::handlerComandaPlecare);

        comanda2 = (Button) scene.lookup("#comanda2");
        comanda2.setOnAction(this::handlerComandaParcare);

        abonatMasina = (CheckBox) scene.lookup("#abonat");
        abonatMasina.setOnAction(this::handlerAbonat);

        utilizator1 = (RadioButton) scene.lookup("#utilizator1");
        utilizator1.setOnAction(this::handlerUtilizatorCurent);


        utilizator2 = (RadioButton) scene.lookup("#utilizator2");
        utilizator2.setOnAction(this::handlerUtilizatorCurent);

        controller = new Controller(textArea);

        primaryStage.show();
    }

    private void handlerUtilizatorCurent(ActionEvent actionEvent) {
        controller.handleUtilizatorCurent(utilizator1, utilizator2, abonatMasina);
    }


    private void handlerAbonat(ActionEvent actionEvent) {
        controller.handleAbonat(abonatMasina.isSelected());
    }

    private void handlerComandaPlecare(ActionEvent actionEvent) {
        controller.handleComandaPlecare();
    }

    private void handlerComandaParcare(ActionEvent actionEvent) {
        controller.handleComandaParcare();
    }

    private void handlerStareOprita(ActionEvent actionEvent) {
        controller.handleSchimbareStare(Stari.OPRITA);
    }

    private void handlerStarePornita(ActionEvent actionEvent) {
        controller.handleSchimbareStare(Stari.PORNITA);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
