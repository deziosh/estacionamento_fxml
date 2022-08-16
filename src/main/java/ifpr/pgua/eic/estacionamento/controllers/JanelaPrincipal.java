package ifpr.pgua.eic.estacionamento.controllers;

import ifpr.pgua.eic.estacionamento.App;
import ifpr.pgua.eic.estacionamento.utils.BorderPaneRegion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class JanelaPrincipal {
    

    @FXML
    private void carregaTelaCadastro(ActionEvent evento){
        App.changeScreenRegion("CADASTRO", BorderPaneRegion.CENTER);
    }

    @FXML
    private void carregaTelaListar(ActionEvent evento){
        App.changeScreenRegion("LISTAR", BorderPaneRegion.CENTER);
    }

}
