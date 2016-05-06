
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.scene.control.TextField;

public class Calculator  extends Application{
	  @Override  
	  public void start(Stage primaryStage) { 
		  Button b1=new Button("X");
		  b1.setShape(new Circle(1));
		  Button b2=new Button("-");
		  b2.setShape(new Circle(1));
		  Button b3=new Button("[]");
		  b3.setShape(new Circle(1));
		  Label l1=new Label("Tashenrechner");
		  l1.setStyle(" -fx-padding: 5; -fx-font-size: 15;");
		  HBox h1=new HBox(2);
		  h1.setStyle("-fx-background-color: #ebe7e2");
		  h1.getChildren().addAll(b1,b2,b3,l1);
		  BorderPane pane=new BorderPane();
		  BorderPane paneForTextField = new BorderPane();
		  paneForTextField.setPadding(new Insets(5, 5, 5, 5)); 
		  TextField tf = new TextField(); 
		  tf.setAlignment(Pos.BOTTOM_RIGHT); 
		  tf.setStyle("-fx-border-color: #69c4e2");
		  paneForTextField.setCenter(tf);
		  GridPane p1=new GridPane();
		  p1.setPadding(new Insets(5, 5, 5, 5)); 
		  p1.setAlignment(Pos.TOP_CENTER);
		  VBox v=new VBox();
		  v.getChildren().addAll(h1,paneForTextField);
		  pane.setTop(v); 
		  HBox h2=new HBox(4);
		  h2.setPadding(new Insets(0, 5, 5, 5)); 
		  HBox h3=new HBox(4);
		  h3.setPadding(new Insets(0, 5, 5, 5)); 
		  HBox h4=new HBox(4);
		  h4.setPadding(new Insets(0, 5, 5, 5)); 
		  HBox h5=new HBox(4);
		  h5.setPadding(new Insets(0, 5, 5, 5)); 
		  Button b4=new Button("7");
		  b4.setPrefWidth(30);
		 // b4.setPrefSize(pane.getPrefWidth(), pane.getPrefHeight()); 
		  Button b5=new Button("8");
		  b5.setPrefWidth(30);
		  Button b6=new Button("9");
		  b6.setPrefWidth(30);
		  Button b7=new Button("%");
		  b7.setPrefWidth(30);
		  Button b8=new Button("");
		  b8.setPrefWidth(30);
		  Button b9=new Button("");
		  b9.setPrefWidth(30);
		  h2.getChildren().addAll(b4,b5,b6,b7,b8,b9);
		  Button b10=new Button("4");
		  b10.setPrefWidth(30);
		  Button b11=new Button("5");
		  b11.setPrefWidth(30);
		  Button b12=new Button("6");
		  b12.setPrefWidth(30);
		  Button b13=new Button("*");
		  b13.setPrefWidth(30);
		  Button b14=new Button("(");
		  b14.setPrefWidth(30);
		  Button b15=new Button(")");
		  b15.setPrefWidth(30);
		  h3.getChildren().addAll(b10,b11,b12,b13,b14,b15);
		  Button b16=new Button("1");
		  b16.setPrefWidth(30);
		  Button b17=new Button("2");
		  b17.setPrefWidth(30);
		  Button b18=new Button("3");
		  b18.setPrefWidth(30);
		  Button b19=new Button("-");
		  b19.setPrefWidth(30);
		  Button b20=new Button("x");
		  b20.setPrefWidth(30);
		  Button b21=new Button("/");
		  b21.setPrefWidth(30);
		  h4.getChildren().addAll(b16,b17,b18,b19,b20,b21);
		  Button b22=new Button("0");
		  b22.setPrefWidth(30);
		  Button b23=new Button(".");
		  b23.setPrefWidth(30);
		  Button b24=new Button("%");
		  b24.setPrefWidth(30);
		  Button b25=new Button("+");
		  b25.setPrefWidth(30);
		  Button b26=new Button("=");
		  b26.setPrefWidth(60);
		  h5.getChildren().addAll(b22,b23,b24,b25,b26);
		  VBox v1=new VBox();
		  v1.getChildren().addAll(h2,h3,h4,h5);
		  v1.setAlignment(Pos.CENTER);
		  v1.setStyle("-fx-background-color: #ebe7e2");
		  pane.setCenter(v1); 
		  h2.setPrefSize(pane.getPrefWidth(), pane.getPrefHeight()); 
		  
		  Scene scene = new Scene(pane, 190, 190);   
		  primaryStage.setTitle("Calculator");
		  primaryStage.setScene(scene);
		  primaryStage.setResizable(false);
		  primaryStage.show(); 

}
	  public static void main(String[] args) {
	        Application.launch(args);

	    }
}
	  
