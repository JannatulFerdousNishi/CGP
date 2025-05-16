/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Jannatul Ferdous
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private ComboBox<String> isDepertmentCombobox;
    @FXML
    private DatePicker dobDatePicker;
    @FXML
    private TableView<Student> tableTableView;
    @FXML
    private TableColumn<Student,String > nameGTableColumn;
    @FXML
    private TableColumn<Student, Integer> idTableColumn;
    @FXML
    private TableColumn<Student, Float> cgpTableColumn;
    @FXML
    private TableColumn<Student,String > depertmentTableColumn;
    @FXML
    private TableColumn<Student,String > dateOfBirthTableColumn;
    @FXML
    private TextArea displayTextArea;
    @FXML
    private TextField CGPTextField;
    
    ArrayList<Student> studentList;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        studentList = new ArrayList<>();
        isDepertmentCombobox.getItems().addAll("CSE",
                                               "EEE",
                                               "BBA",
                                               "LLB",
                                               "ENV");
        
    }    

    @FXML
    private void addButtonOnClicked(ActionEvent event) {
       
       Student tmp = new Student(nameTextField.getText(),
                                 Integer.parseInt(idTextField.getText()),
                                 Float.parseFloat(CGPTextField.getText()),
                                 dobDatePicker.getValue(),
                                 isDepertmentCombobox.getValue()
        );
        studentList.add(tmp);
        displayTextArea.clear();
        
    }

    @FXML
    private void refreashButtonOnClick(ActionEvent event) {
        
        System.out.println("clicked in refreash");

        
    }

        
        

    private void getValue() {
        throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
