package com.example.payroll;

import javax.swing.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import javax.swing.table.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;

public class Table1 {
public static void main(String[] args) throws IOException, JSONException  {
      String urlstring = "http://localhost:8080/employees";
      URLEncoder.encode(urlstring, "UTF-8");
      URL url = new URL(urlstring);
      URLConnection conn = url.openConnection();
      InputStream is = conn.getInputStream();
      Scanner scan = new Scanner(is);
      String imageData = scan.nextLine();
      System.out.println(imageData);
      //JSONObject jsonObj = new JSONObject(imageData);
      
      JSONArray array = new JSONArray(imageData);
      System.out.println(array);
    
    JSONObject jObject = new JSONObject();
try{
  array.put(jObject);

}catch(Exception e){

}
JFrame jFrame = new JFrame();
DefaultTableModel model = new DefaultTableModel();

JTable jTable = new JTable(model);

model.addColumn("ID");
model.addColumn("NAME");
model.addColumn("ROLE");
try{
  for (int i=0;i<array.length();i++){
    model.addRow(new Object[]{array.getJSONObject(i).getString("role"),array.getJSONObject(i).getString("id"), array.getJSONObject(i).getString("name")});
  
  }
  

}catch(Exception e){

}
jTable.setBounds(30, 40, 230, 280);

JScrollPane jScrollPane = new JScrollPane(jTable);
jFrame.add(jTable);
jFrame.setSize(350, 300);
jFrame.setVisible(true);

}
}
