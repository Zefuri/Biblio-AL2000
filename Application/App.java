package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

 
import model.*;

public class App extends Application{
  public static AL2000 Machine;
  
  @Override
  public void start(Stage stage) throws Exception {
      Machine = new AL2000();
    
      try{
          Parent root;
          root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
          Scene scene = new Scene(root);
          stage.setTitle("AL 2000");
          stage.setScene(scene);
          stage.centerOnScreen();
          stage.show();
      }catch(IOException e){
          e.printStackTrace();
      }
  }

  public static void main(String[] args) {
      App.launch(App.class,args);
  }
}
