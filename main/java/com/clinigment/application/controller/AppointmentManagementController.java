
package com.clinigment.application.controller;

import com.clinigment.application.abstracts.LayoutController;
import com.clinigment.application.navigator.LayoutContentNavigator;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author lastminute84
 */
public class AppointmentManagementController extends LayoutController implements Initializable {

    private static AppointmentManagementController instance;
    
    public static AppointmentManagementController getInstance() {
        if(instance == null) {
            instance = new AppointmentManagementController();
        }
        return instance;
    }
    
    public AppointmentManagementController() {
        super();
    }
    
    //@FXML
    //private StackPane addNewPatientStack, patientTableContainer;
    
    @FXML
    private TabPane tabPane;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        instance = this;
        System.out.println("Object reference in init 1: " + this);
        //LayoutContentNavigator.loadLayout(LayoutContentNavigator.ADD_NEW_PATIENT1, this);
        //LayoutContentNavigator.loadLayout(LayoutContentNavigator.PATIENT_TABLE_VIEW, this, patientTableContainer);
        //switchPane(1);
        System.out.println("Object reference in init 2: " + this);
    }    

    @Override
    public void setLayout(Node node) {
        //addNewPatientStack.getChildren().setAll(node);
        //tableBorderPane.setCenter(node);
    }

    @Override
    public void setLayout(Node node, Pane container) {
        container.getChildren().setAll(node);
    }
    
    public void switchPane(int tabIndex) {
        //System.out.println("TabPane: " + tabPane);
        //System.out.println("SelectionModel: " + tabPane.getSelectionModel());
        tabPane.getSelectionModel().select(tabIndex);
        System.out.println("Object reference in switchPane: " + this);
    }

    

}
