package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ejemplo1 extends Application {

	@Override
	public void start(Stage stage) {
		
		//Creamos un GridPane
		GridPane grid = new GridPane();
		
		//Ponemos un titulo al formulario y le damos formato.
		Text formulario= new Text("Formulario Mascotas");
		formulario.setFill(Color.AQUA);
		formulario.setFont(Font.font("Calibri", FontWeight.BLACK, FontPosture.ITALIC, 50));
	
		Text nombre = new Text("Nombre:");
		TextField txtnombre= new TextField();
		
		Text edad = new Text("Edad:");
		ComboBox<Integer> edad1 = new ComboBox<Integer>();
		for(int i = 1; i <= 20; i++) {
			edad1.getItems().add(i);
		}
		
		Text raza = new Text("Raza:");
		ComboBox<String> raza1 = new ComboBox<String>();
		raza1.getItems().addAll("pastor alemán", "bulldog", "chihuahua", "pitbull", "pomeramia");
		
		
		CheckBox pedigri = new CheckBox ("¿Tiene pedigrí?");
		pedigri.setSelected(true);
		
		
		Text precio = new Text("Precio:");
		//creamos un slider (barrita deslizante)
		
        Slider slider= new Slider(1,2000,10);
        //muestra los numeros debajo del slider.
		slider.setShowTickLabels(true);
		//Indica si el valor del control deslizante siempre debe estar alineado
		//con las marcas de graduación. Esto se respeta incluso si no se muestran
		//las marcas de verificación.
		slider.setSnapToTicks(true);
			
		//Especifica si la implementación de la máscara debe mostrar marcas de verificación.
		slider.setShowTickMarks(true);
				
		//La unidad de distancia entre las principales marcas de graduación. Por ejemplo, si 
		//el mínimo es 0 y el máximo es 100 y el majorTickUnit es 25, entonces habría 5 marcas
		//de graduación: una en la posición 0, una en la posición 25, una en la posición 50, 
		//una en la posición 75 y una última en la posición 100.
		slider.setMajorTickUnit(10.0);
				
		//El número de tics menores que se colocarán entre dos ticks principales. Este número 
		//debe ser positivo o cero. Los valores fuera de rango deshabilitarán los ticks menores, 
		//al igual que un valor de cero.
		slider.setMinorTickCount(3);
		
		Button boton = new Button("Mostrar");
		
		
		BackgroundImage myBI= new BackgroundImage(new Image("application/perro.jpg"),
		BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		BackgroundSize.DEFAULT);
		grid.setBackground(new Background(myBI));
		
		grid.setAlignment(Pos.TOP_CENTER);
		GridPane.setMargin(nombre, new Insets(10,10,10,10));
		GridPane.setMargin(txtnombre, new Insets(10,10,10,10));
		GridPane.setMargin(edad, new Insets(10,10,10,10));
		GridPane.setMargin(edad1, new Insets(10,10,10,10));
		GridPane.setMargin(raza, new Insets(10,10,10,10));
		GridPane.setMargin(raza1, new Insets(10,10,10,10));
		GridPane.setMargin(pedigri, new Insets(10,10,10,10));
		GridPane.setMargin(precio, new Insets(10,10,10,10));
		GridPane.setMargin(slider, new Insets(10,10,10,10));
		GridPane.setMargin(boton, new Insets(10,10,10,10));
		
		GridPane.setColumnSpan(formulario, 2);
		GridPane.setColumnSpan(slider, 2);
		GridPane.setColumnSpan(pedigri, 2);
		
		grid.add(formulario, 0, 0);
		grid.add(nombre, 0, 1);
		grid.add(edad, 0, 2);
		grid.add(raza, 0, 3);
		grid.add(pedigri, 0, 4);
		grid.add(precio, 0, 5);
		
		grid.add(txtnombre, 1, 1);
		grid.add(edad1, 1, 2);
		grid.add(raza1, 1, 3);
		grid.add(slider, 1, 5);
		grid.add(boton, 1, 6);
		
		
		Scene scene = new Scene(grid,500.0,330.0);
		stage.setScene(scene);
		
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
