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
import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.control.cell.PropertyValueFactory;

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
       
        nameGTableColumn.setCellValueFactory(new PropertyValueFactory<>("nameTextField"));
        //nameGTableColumn.setCellValueFactory(new PropertyValueFactory<Student,String>(s:"name"));
        //idTableColumn.serCallValueFactory(new PropertyValueFactory<Student, Integer>(s:"id"));
        //cgpTableColumn.serCallValueFactory(new PropertyValueFactory<Student, Float>(s:"cgp"));
        //depertmentTableColumn.serCallValueFactory(new PropertyValueFactory<Student,String>(s:"dep"));
        //dateOfBirthTableColumn.serCallValueFactory(new PropertyValueFactory<Student,String>(s:"dob"));
        //setupTable();
        
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
        String str="List of Students Information:\n";
        for(Student s: studentList){
            str  += s.toString();
        }
         
        displayTextArea.setText(str);
        
        
        //ObservableList<Student>currentTableData=student.getItem();
        //int currentStudentId =Integer.parseInt(nameTextField.getText());
        //for(Student student:currentTableData){
        //     if (student.getId==currentStudentId){
        //          student.setName(nameTextField.getText());
        //          student.setItems(currentTableData);
        //          student.refresh();
        //          break
        //      }
        //}
        tableTableView.getItems().add(tmp);
        
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
