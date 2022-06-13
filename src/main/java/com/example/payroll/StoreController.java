package com.example.payroll;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.fxml.Initializable;

public class StoreController implements Initializable{
    public TableView<Store> table1;
    public TableColumn<Store, Integer> colid;
    public TableColumn<Store, String> colname;
    public TableColumn <Store, String> colrole;
   String url = "http://localhost:8080/employees"
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colid.setCellValueFactory(new PropertyValueFactory<>("id"));
        colname.setCellValueFactory(new PropertyValueFactory<>("name"));
        colrole.setCellValueFactory(new PropertyValueFactory<>("role"));
       
    }
    ObservableList<Store> data = FXCollections.observableArrayList();

 
}
