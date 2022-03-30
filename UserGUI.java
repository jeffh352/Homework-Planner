import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserGUI extends Application {
	
	private TextField firstName = new TextField();
	private TextField lastName = new TextField();
	private TextField userName = new TextField();
	private TextField passWord = new TextField();
	private TextField gradeLevel = new TextField();
	private Button conti=new Button("Continue");
	private Button createAccount = new Button("Create New Account");
	private Button login = new Button("Log in");
	private Button createNew= new Button("New User? Create an Account!");
	
	@Override //Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		GridPane gridPane0 = new GridPane();
		gridPane0.setHgap(5);
		gridPane0.setVgap(5);
		gridPane0.add(conti, 0, 3);
		gridPane0.setAlignment(Pos.CENTER);
		gridPane0.add(new Label("Welcome to Homework Planner!"), 0, 0);
		gridPane0.add(new Label("Created By:"), 0, 1);
		gridPane0.add(new Label("Jo Mama"), 0, 2);
		  
		  //process event 
		  conti.setOnAction(e -> logIn(primaryStage));
		  
		// Create a scene and place it in the stage
	       Scene scene = new Scene(gridPane0, 400, 250);
		   primaryStage.setTitle("Homework Planner"); // Set title
		   primaryStage.setScene(scene); // Place the scene in the stage
		   primaryStage.show(); // Display the stage
		  }
		
			
	public void logIn(Stage stage) {
		Stage logIn=new Stage();
		stage.close();
		
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(new Label("User Name:"), 0, 2);
		gridPane.add(userName, 1, 2);
		gridPane.add(new Label("Password:"), 0, 3);
		gridPane.add(passWord, 1, 3);
		gridPane.add(login, 0, 5);
		gridPane.add(createNew, 0, 6);
		
		  //Set properties for UI
		  gridPane.setAlignment(Pos.CENTER);
		  firstName.setAlignment(Pos.BOTTOM_LEFT);
		  lastName.setAlignment(Pos.BOTTOM_LEFT);
		  userName.setAlignment(Pos.BOTTOM_LEFT);
		  passWord.setAlignment(Pos.BOTTOM_LEFT);
		  gradeLevel.setAlignment(Pos.BOTTOM_LEFT);
		  
		  //process event 
		  login.setOnAction(e -> displayAccountCreated(logIn));
		  createNew.setOnAction(e->createNewAccount(logIn));
		  
		// Create a scene and place it in the stage
	       Scene scene = new Scene(gridPane, 400, 250);
		   logIn.setTitle("Log In"); // Set title
		   logIn.setScene(scene); // Place the scene in the stage
		   logIn.show(); // Display the stage
	}
	public void displayAccountCreated(Stage stage) {
				stage.close();
				Stage welcome=new Stage();
				String str=userName.getText();
				
				GridPane gridPane2=new GridPane();
				gridPane2.setAlignment(Pos.CENTER);
				Scene scene2=new Scene(gridPane2, 400, 250);
				gridPane2.setHgap(5);
				gridPane2.setVgap(5);
				gridPane2.add(new Label("Welcome "+str), 0, 0);
				
				welcome.setTitle("Welcome! "+str);
				welcome.setScene(scene2);
				welcome.show();
			}
			
	public void createNewAccount(Stage stage) {
				Stage createNew=new Stage();
				stage.close();
				
				GridPane gridPane3=new GridPane();
				gridPane3.setAlignment(Pos.CENTER);
				Scene scene3=new Scene(gridPane3, 400, 250);
				gridPane3.setHgap(5);
				gridPane3.setVgap(5);
				gridPane3.add(new Label("First Name:"), 0, 0);
				gridPane3.add(firstName, 1, 0);
				gridPane3.add(new Label("Last Name:"), 0, 1);
				gridPane3.add(lastName, 1, 1);
				gridPane3.add(new Label("User Name:"), 0, 2);
				gridPane3.add(userName, 1, 2);
				gridPane3.add(new Label("Password:"), 0, 3);
				gridPane3.add(passWord, 1, 3);
				gridPane3.add(new Label("Grade Level:"), 0, 4);
				gridPane3.add(gradeLevel, 1, 4);
				gridPane3.add(createAccount, 1, 5);
				
				createAccount.setOnAction(e-> accountCreated(createNew));
				
				createNew.setTitle("New Account");
				createNew.setScene(scene3);
				createNew.show();
			}
			
	public void accountCreated(Stage stage) {
				Stage accountCreated=new Stage();
				stage.close();
				
				GridPane gridPane4=new GridPane();
				gridPane4.setAlignment(Pos.CENTER);
				Scene scene4=new Scene(gridPane4, 400, 250);
				gridPane4.setHgap(5);
				gridPane4.setVgap(5);
				gridPane4.add(new Label("Account Created"), 0, 0);
				gridPane4.add(conti, 0, 1);
				
				conti.setOnAction(e->logIn(accountCreated));
				accountCreated.setTitle("Done");
				accountCreated.setScene(scene4);
				accountCreated.show();
			}

	
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	

}