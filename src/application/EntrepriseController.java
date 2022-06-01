package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import application.connection.Connexion;
import application.entities.Entreprise;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EntrepriseController implements Initializable {
	
	@FXML
	 private TextField tfName;
	
	 
	 
	 @FXML
	 private Button addBtn;


	public void initialize(URL arg0, ResourceBundle arg1) {


	}
		public void addmethode () {

			Connection con = Connexion.getCon();
			System.out.println(Connexion.getCon());

			PreparedStatement ps;
			try {
				ps = con.prepareStatement("insert into entreprise values(?)");

				String newNom=tfName.getText();  	
				
				Entreprise e = new Entreprise(newNom);	
					ps.setString(1,e.getNomE());  
					ps.executeUpdate();  	
					System.out.println("effected");
				con.close();


			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  			 

		}





}
