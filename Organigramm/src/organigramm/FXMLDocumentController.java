/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organigramm;

import backend.Employee;
import backend.Skills;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
    private TableView<Employee> employeeTableView;
    
    @FXML
    private TableColumn title;
    @FXML
    private TableColumn id;
    @FXML
    private TableColumn ssn;
    @FXML
    private TableColumn fn;
    @FXML
    private TableColumn ln;
//    @FXML
//    private TableColumn skills;
    @FXML
    private TableColumn birthdate;
    @FXML
    private TableColumn adress;
    @FXML
    private TableColumn town;
    @FXML
    private TableColumn sex;
    @FXML
    private TableColumn email;
    @FXML
    private TableColumn yearsIn;
    
    
    @FXML
    private TextField primarySchool;
    @FXML
    private TextField secondarySchool;
    @FXML
    private TextField college;
    @FXML
    private TextArea education;
    @FXML
    private TextArea certificates;
    @FXML
    private TextArea expireDate;
    
    
    private ObservableList<Employee> employees;
    
    @FXML
    private void handleAddNewEmployeeButton(ActionEvent event) {
        System.out.println("Clicked Add button");
        TableRow<Employee> newRow = new TableRow<>();
        Employee emp = new Employee(title.getText(), Integer.getInteger(id.getText()), Integer.getInteger(ssn.getText()), fn.getText(), ln.getText(), new Skills(primarySchool.getText(), secondarySchool.getText(), college.getText(), education.getText(), Double.parseDouble(yearsIn.getText()), certificates.getText(), expireDate.getText()), Date.valueOf(birthdate.getText()), adress.getText(), town.getText(), sex.getText().charAt(0), email.getText(), Integer.getInteger(yearsIn.getText()));
        employees.add(emp);
        employeeTableView.getItems().add(emp);
    }
    
    @FXML
    private void handleDeleteEmployeeButton(ActionEvent event) {
        Employee emp = employeeTableView.getSelectionModel().getSelectedItem();
        employees.remove(emp);
        employeeTableView.getItems().remove(emp);
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
