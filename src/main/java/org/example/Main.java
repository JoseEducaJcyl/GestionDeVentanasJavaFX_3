package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Boton con entrada de texto");
        Button boton = new Button("Ingresar texto");
        boton.setOnAction(e -> {
            mostrarDialogo();
        });

        Scene scene = new Scene(boton,100,100);
        stage.setScene(scene);
        stage.show();

    }
    private void mostrarDialogo(){
        TextInputDialog dialogo = new TextInputDialog();
        dialogo.setTitle("Ingresar Texto");
        dialogo.setContentText("NOMBRE: ");

        Optional<String> resultado = dialogo.showAndWait();

        if(resultado.isPresent()){
            String texto = resultado.get();
            System.out.println("Texto ingresado: " + texto);
        }else{
            System.out.println("Error al ingresar");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
