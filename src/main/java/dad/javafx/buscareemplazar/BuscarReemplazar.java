package dad.javafx.buscareemplazar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarReemplazar extends Application {
	
	private Label buscarLabel;
	private Label reemplazarLabel;
	
	private TextField buscarText;
	private TextField reemplazarText;
	
	
	private Button buscarButton;
	private Button reemplazarButton;
	private Button reemplazarTodoButton;
	private Button cerrarButton;
	private Button ayudaButton;
	
	private CheckBox mayusminusCBox;
	private CheckBox buscarCBox;
	private CheckBox expresionCBox;
	private CheckBox resaltarCBox;
	
	
	
	
	
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		GridPane busqPane= new GridPane();
		
		buscarLabel= new Label("Buscar:");
		reemplazarLabel= new Label("Reemplazar con:");
		buscarText= new TextField();
		reemplazarText= new TextField();
		
		
		
		
		busqPane.addRow(0,buscarLabel,buscarText);
		busqPane.addRow(1,reemplazarLabel,reemplazarText);
	
		GridPane checkPane=new GridPane();
		
		mayusminusCBox= new CheckBox("Mayúsculas y minúsculas");
		buscarCBox= new CheckBox("Buscar hacia atrás");
		checkPane.addRow(0,mayusminusCBox,buscarCBox);
		expresionCBox= new CheckBox("Expresión regular");
		resaltarCBox= new CheckBox("Resaltar resultados");
		checkPane.addRow(1, expresionCBox,resaltarCBox);
		
		checkPane.setHgap(5);
		checkPane.setVgap(5);
		
		busqPane.add(checkPane,1,2);
		
		
		
		
		
		

	

		
		buscarButton= new Button("Buscar");
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		reemplazarButton= new Button("Reemplazar");
		reemplazarButton.setMaxWidth(Double.MAX_VALUE);
		reemplazarTodoButton= new Button("Reemplazar todo");
		reemplazarTodoButton.setMaxWidth(Double.MAX_VALUE);
		cerrarButton= new Button("Cerrar");
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		ayudaButton= new Button("Ayuda");
		ayudaButton.setMaxWidth(Double.MAX_VALUE);
		
		
	
		
		


		busqPane.setHgap(5);
		busqPane.setVgap(5);
		
	
		
		
		
		VBox botonesBox= new VBox(5,buscarButton,reemplazarButton,reemplazarTodoButton,cerrarButton,ayudaButton);
		
		
		
		
		ColumnConstraints[] cols = {
				
				new ColumnConstraints(),
				new ColumnConstraints()
		};
		
		cols[1].setFillWidth(true);
		cols[1].setHgrow(Priority.ALWAYS);
		
		
		
		busqPane.getColumnConstraints().addAll(cols);
		
		
		BorderPane root= new BorderPane();
		root.setCenter(busqPane);
		root.setRight(botonesBox);
		root.setPadding(new Insets(5));
		
		BorderPane.setMargin(busqPane,new Insets(5));
		BorderPane.setAlignment(botonesBox, Pos.CENTER);
		
		
		Scene scene= new Scene(root,620,180);
		
		
		
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		
		launch();
		
	}

}

