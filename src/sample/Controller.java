package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import modelos.Esfera;

public class Controller {

    private Button calVol;
    @FXML
    private TextField radio;
    @FXML
    private TextField resultado;
    @FXML
    private TextField resultado1;
    @FXML
    private TextField resultado2;
    @FXML
    private TextField resultado3;
    @FXML

    public void Volumen(ActionEvent event){
        try{
            int rad = Integer.parseInt(this.radio.getText());
            if(rad >= 0){
                Esfera v = new Esfera(rad);
                double resultado = v.volumen();
                this.resultado.setText(resultado + "");
            }
            else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText(null);
                a.setTitle("Error");
                a.setContentText("El número no es válido");
                a.showAndWait();
            }

        }catch (NumberFormatException e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("Error");
            alerta.setContentText("Formato Incorrecto");
            alerta.showAndWait();
        }
    }

    public void Superficie(ActionEvent event){
        try{
            int rad = Integer.parseInt(this.radio.getText());
            if(rad >= 0){
                Esfera v = new Esfera(rad);
                double resultado = v.superficie();
                this.resultado1.setText(resultado + "");
            }
            else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText(null);
                a.setTitle("Error");
                a.setContentText("El número no es válido");
                a.showAndWait();
            }

        }catch (NumberFormatException e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("Error");
            alerta.setContentText("Formato Incorrecto");
            alerta.showAndWait();
        }
    }

    public void Area(ActionEvent event){
        try{
            int rad = Integer.parseInt(this.radio.getText());
            if(rad >= 0){
                Esfera v = new Esfera(rad);
                double resultado = v.areaCirculo();
                this.resultado2.setText(resultado + "");
            }
            else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText(null);
                a.setTitle("Error");
                a.setContentText("El número no es válido");
                a.showAndWait();
            }

        }catch (NumberFormatException e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("Error");
            alerta.setContentText("Formato Incorrecto");
            alerta.showAndWait();
        }
    }

    public void Perimetro(ActionEvent event){
        try{
            int rad = Integer.parseInt(this.radio.getText());
            if(rad >= 0){
                Esfera v = new Esfera(rad);
                double resultado = v.perimetroCirculo();
                this.resultado3.setText(resultado + "");
            }
            else {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText(null);
                a.setTitle("Error");
                a.setContentText("El número no es válido");
                a.showAndWait();
            }

        }catch (NumberFormatException e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("Error");
            alerta.setContentText("Formato Incorrecto");
            alerta.showAndWait();
        }
    }

}
