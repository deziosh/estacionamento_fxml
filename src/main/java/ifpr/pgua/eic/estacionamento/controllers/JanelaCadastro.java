package ifpr.pgua.eic.estacionamento.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ifpr.pgua.eic.estacionamento.App;
import ifpr.pgua.eic.estacionamento.models.Estacionamento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class JanelaCadastro implements Initializable {
    
    //declaração dos componentes JavaFX. O nome do atributo
    //deve ser igual a propriedade fx:id no FXML.

    @FXML
    private TextField tfPlaca;

    @FXML
    private TextField tfModelo;

    @FXML
    private ComboBox<String> cbFabricante;

    @FXML
    private TextField tfCor;

    @FXML
    private TextField tfAnoFabricacao;

    private Estacionamento estacionamento;

    public JanelaCadastro(Estacionamento estacionamento){
        this.estacionamento = estacionamento;
    }


    @FXML
    private void cadastrar(ActionEvent evento){
        String placa = tfPlaca.getText();
        String modelo = tfModelo.getText();
        String fabricante = cbFabricante.getValue();
        String cor = tfCor.getText();
        String sAnoFabricacao = tfAnoFabricacao.getText();

        int anoFabricacao = Integer.valueOf(sAnoFabricacao);

        if(estacionamento.cadastraVeiculo(placa, modelo, fabricante, anoFabricacao, cor)){
            Alert alert = new Alert(AlertType.INFORMATION,"Cadastro realizado");
            alert.showAndWait();
            limpar();
        }else{
            Alert alert = new Alert(AlertType.INFORMATION,"Cadastro não realizado");
            alert.showAndWait();  
        }
    }

    @FXML
    private void cancelar(ActionEvent evento){
        App.popScreen();
    }


    private void limpar(){
        tfPlaca.clear();
        tfModelo.clear();
        cbFabricante.getSelectionModel().clearSelection();
        tfCor.clear();
        tfAnoFabricacao.clear();
    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        cbFabricante.getItems().add("Fiat");       
        cbFabricante.getItems().add("Volvo"); 
        cbFabricante.getItems().add("Honda"); 
        cbFabricante.getItems().add("Toyota"); 
        cbFabricante.getItems().add("Ford"); 

    }


}
