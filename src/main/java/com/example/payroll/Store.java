package com.example.payroll;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import org.json.JSONObject;

import java.util.Map;

public class Store {
private SimpleIntegerProperty id;
private SimpleStringProperty name;
private SimpleStringProperty role;
public Store(Int id, String name, String role){
    this.id = new SimpleIntegerProperty(id);
    this.name = new SimpleStringProperty(name);
    this.role = new SimpleStringProperty(role);
   


}

public String getActive(){
    return id.get();
}

public void setActive(String active){
    this.id = new SimpleIntegerProperty(active);
}

public String getCategoryName() {
    return name.get();
}

public void setCategoryName(String categoryName) {
    this.name = new SimpleStringProperty(categoryName);
}

public String getItemId() {
    return role.get();
}

public void setItemId(String itemId) {
    this.role = new SimpleStringProperty(itemId);
}



}
