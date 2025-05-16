
import java.time.LocalDate;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jannatul Ferdous
 */
public class Student {

    static void add(ArrayList<Student> studentList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    protected String nameTextField;
    protected int idTextField;
    protected float CGPTextField;
   
    protected  LocalDate dobDatePicker;
    protected String isDepertmentCombobox;

    public Student(String nameTextField, int idTextField, float CGPTextField, LocalDate dobDatePicker, String isDepertmentCombobox) {
        this.nameTextField = nameTextField;
        this.idTextField = idTextField;
        this.CGPTextField = CGPTextField;
        this.dobDatePicker = dobDatePicker;
        this.isDepertmentCombobox = isDepertmentCombobox;
    }

    public String getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(String nameTextField) {
        this.nameTextField = nameTextField;
    }

    public int getIdTextField() {
        return idTextField;
    }

    public void setIdTextField(int idTextField) {
        this.idTextField = idTextField;
    }

    public float getCGPTextField() {
        return CGPTextField;
    }

    public void setCGPTextField(float CGPTextField) {
        this.CGPTextField = CGPTextField;
    }

    public LocalDate getDobDatePicker() {
        return dobDatePicker;
    }

    public void setDobDatePicker(LocalDate dobDatePicker) {
        this.dobDatePicker = dobDatePicker;
    }

    public String getIsDepertmentCombobox() {
        return isDepertmentCombobox;
    }

    public void setIsDepertmentCombobox(String isDepertmentCombobox) {
        this.isDepertmentCombobox = isDepertmentCombobox;
    }

    @Override
    public String toString() {
        return "Student{" + "nameTextField=" + nameTextField + ", "
                          + "idTextField=" + idTextField + ", "
                          + "CGPTextField=" + CGPTextField + ", "
                          + "dobDatePicker=" + dobDatePicker + ","
                          + " isDepertmentCombobox=" + isDepertmentCombobox + '}';
    }

    
    
    
}
