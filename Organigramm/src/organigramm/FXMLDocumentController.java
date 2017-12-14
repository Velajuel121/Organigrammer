/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organigramm;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

/**
 *
 * @author felix
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button addNew;
    @FXML
    private Button delete;
    @FXML
    private Button edit;
    @FXML
    private Button exit;
    @FXML
    private TableView employeeTableView;
    
    @FXML
    private void handleAddNewEmployeeButton(ActionEvent event) {
        System.out.println("Clicked Add button");
    }
    
    @FXML
    private void handleDeleteEmployeeButton(ActionEvent event) {
        System.out.println("Clicked delete button");
        
    }
    @FXML
    private void handleEditEmployeeButton(ActionEvent event) {
        System.out.println("Clicked Edit button");
        
    }
    @FXML
    private void handleExitButton(ActionEvent event) {
        System.exit(0);
        
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
