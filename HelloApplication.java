package com.example.java;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
//import javafx.scene.image.Image;
public class HelloApplication extends Application{
    public static void main(String[] args){
        launch(args); //this launch method will call the start method
        //this launch is a static method that belongs to the Application class
        //it should be written as Application.launch() but as it is static method,so it does not need so
    }
    public void start(Stage primaryStage)throws Exception{
        Group root=new Group();
        Scene scene=new Scene(root,600,600, Color.BEIGE); //have to pass a root node as an argument to the scene's constructor
        Stage stage=new Stage(); //we can use the Stage of that is given to the constructor also we can create a Stage if we want

        //adding text to scene
        Text text=new Text(); //we can set the text here in the constructor,or also we can use the setText method
        text.setText("WHOAAA!!!");
        text.setX(75); //we have to dictate from where that text will appear
        text.setY(75);
        text.setFont(Font.font("SAN_SERIF",30)); //setting the text font and size
        text.setFill(Color.DARKGOLDENROD); //setting the text color
        root.getChildren().add(text); //this is used with layouts and containers such as Pane,Group,HBox where we can add child nodes to arrange and display within the parent node

        //adding line to the scene
        Line line=new Line();
        line.setStartX(75);
        line.setStartY(80); //setting the starting coordinate
        line.setEndX(230); //x-axis 75 yo 230 and y will remain the same which makes it horizontal
        line.setEndY(80); //setting the ending coordinate
        line.setStrokeWidth(5); //how thick the line can be
        line.setStroke(Color.BLACK);
        line.setOpacity(0.5); //how transparent i want the text color to be
        line.setRotate(180); //in which angel we want the line to be
        root.getChildren().add(line);


        //adding rectangle to the scene
        Rectangle r=new Rectangle();
        r.setX(105);
        r.setY(82);
        r.setWidth(100);
        r.setHeight(100);
        r.setFill(Color.BLACK); //rectangle color
        r.setStrokeWidth(5); //border width
        r.setStroke(Color.BROWN); //border color
        root.getChildren().add(r);


        //adding a triangle in the scene
        Polygon triangle=new Polygon();
        triangle.getPoints().setAll(
                220.0,82.0,
                220.0,130.0,
                275.0,130.0
        );
        triangle.setFill(Color.BLACK);
        triangle.setStrokeWidth(3);
        triangle.setStroke(Color.BROWN);
        root.getChildren().add(triangle);


        //adding circle to the scene
        Circle c=new Circle();
        c.setCenterX(50);
        c.setCenterY(70);
        c.setRadius(20);
        c.setFill(Color.BLACK);
        c.setStroke(Color.BROWN);
        c.setStrokeWidth(3);
        root.getChildren().add(c);

        //adding image to the scene
        Image i=new Image("C:/Users/DELL/Downloads/tanjiro.jpg");
        ImageView view=new ImageView(i);
        view.setX(105);
        view.setY(190);
        view.setFitHeight(100.0);
        view.setFitWidth(100.0);
        root.getChildren().add(view);

        //creating the stage
        Image icon=new Image("C:/Users/DELL/Downloads/megumi.jpg"); //copy the path and change the brackets from \ to /
        stage.getIcons().add(icon);
        stage.setWidth(330);
        stage.setHeight(350);
        stage.setResizable(false);
        stage.setX(50); //from how far from the x-axis of the screen the window will appear
        stage.setY(50); //by default,it will appear from the middle,but we can change that by setting X and Y

        /*the fullscreen code
        stage.setFullScreen(true); //window will appear as full screen,and it will be written "press esc" by default
        stage.setFullScreenExitHint("YOU CAN'T ESCAPE UNLESS YOU PRESS Q"); //this way we can customize the default note of full screen window
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("Q")); //assigning the value by which the full screen window will be closed
        */

        stage.setTitle("Stage demo program woot woot");
        stage.setScene(scene);
        stage.show();
    }
}

