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
        // Se asigna el título de la ventana principal
        stage.setTitle("Boton con entrada de texto");

        // Se crea un botón con el texto "Ingresar texto"
        Button boton = new Button("Ingresar texto");

        // Se asigna una acción al botón cuando es presionado
        boton.setOnAction(e -> {
            // Cuando se pulsa el botón, se llama al método que muestra el diálogo de entrada
            mostrarDialogo();
        });

        // Se crea la escena con el botón como único elemento, de 100x100 píxeles
        Scene scene = new Scene(boton, 100, 100);
        // Se asigna la escena a la ventana
        stage.setScene(scene);
        // Se hace visible la ventana
        stage.show();
    }

    // Método privado que muestra un diálogo para ingresar texto
    private void mostrarDialogo(){
        // Se crea un cuadro de diálogo para entrada de texto
        TextInputDialog dialogo = new TextInputDialog();
        // Se establece el título del diálogo
        dialogo.setTitle("Ingresar Texto");
        // Se establece el mensaje que se muestra junto al campo de texto
        dialogo.setContentText("NOMBRE: ");

        // Se muestra el diálogo y se espera el resultado
        // Optional puede contener el valor ingresado o estar vacío si se canceló
        Optional<String> resultado = dialogo.showAndWait();

        // Se verifica si se ingresó texto (no se canceló el diálogo)
        if(resultado.isPresent()){
            // Se obtiene el texto ingresado por el usuario
            String texto = resultado.get();
            // Se imprime el texto en la consola
            System.out.println("Texto ingresado: " + texto);
        } else {
            // Si el usuario canceló el diálogo o cerró la ventana
            System.out.println("Error al ingresar");
        }
    }

    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        launch(args);
    }
}
