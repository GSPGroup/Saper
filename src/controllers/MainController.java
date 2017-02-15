
package controllers;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import logic.DrawField;

public class MainController {

	@FXML
	private Button b1;
	@FXML
	private Button b2;
	@FXML
	private Button b3;
	@FXML
	private Button b4;
	@FXML
	private Button b5;
	@FXML
	private Button b6;
	@FXML
	private Button b7;
	@FXML
	private Button b8;
	@FXML
	private Button b9;
	@FXML
	private Button b10;
	@FXML
	private Button b11;
	@FXML
	private Button b12;
	@FXML
	private Button b13;
	@FXML
	private Button b14;
	@FXML
	private Button b15;
	@FXML
	private Button b16;
	@FXML
	private Button b17;
	@FXML
	private Button b18;
	@FXML
	private Button b19;
	@FXML
	private Button b20;
	@FXML
	private Button b21;
	@FXML
	private Button b22;
	@FXML
	private Button b23;
	@FXML
	private Button b24;
	@FXML
	private Button b25;
	@FXML
	private Button b26;
	@FXML
	private Button b27;
	@FXML
	private Button b28;
	@FXML
	private Button b29;
	@FXML
	private Button b30;
	@FXML
	private Button b31;
	@FXML
	private Button b32;
	@FXML
	private Button b33;
	@FXML
	private Button b34;
	@FXML
	private Button b35;
	@FXML
	private Button b36;
	@FXML
	private Button b37;
	@FXML
	private Button b38;
	@FXML
	private Button b39;
	@FXML
	private Button b40;
	@FXML
	private Button b41;
	@FXML
	private Button b42;
	@FXML
	private Button b43;
	@FXML
	private Button b44;
	@FXML
	private Button b45;
	@FXML
	private Button b46;
	@FXML
	private Button b47;
	@FXML
	private Button b48;
	@FXML
	private Button b49;
	@FXML
	private Button b50;
	@FXML
	private Button b51;
	@FXML
	private Button b52;
	@FXML
	private Button b53;
	@FXML
	private Button b54;
	@FXML
	private Button b55;
	@FXML
	private Button b56;
	@FXML
	private Button b57;
	@FXML
	private Button b58;
	@FXML
	private Button b59;
	@FXML
	private Button b60;
	@FXML
	private Button b61;
	@FXML
	private Button b62;
	@FXML
	private Button b63;
	@FXML
	private Button b64;
	@FXML
	private Button b65;
	@FXML
	private Button b66;
	@FXML
	private Button b67;
	@FXML
	private Button b68;
	@FXML
	private Button b69;
	@FXML
	private Button b70;
	@FXML
	private Button b71;
	@FXML
	private Button b72;
	@FXML
	private Button b73;
	@FXML
	private Button b74;
	@FXML
	private Button b75;
	@FXML
	private Button b76;
	@FXML
	private Button b77;
	@FXML
	private Button b78;
	@FXML
	private Button b79;
	@FXML
	private Button b80;
	@FXML
	private Button b81;
	@FXML
	private Button b82;
	@FXML
	private Button b83;
	@FXML
	private Button b84;
	@FXML
	private Button b85;
	@FXML
	private Button b86;
	@FXML
	private Button b87;
	@FXML
	private Button b88;
	@FXML
	private Button b89;
	@FXML
	private Button b90;
	@FXML
	private Button b91;
	@FXML
	private Button b92;
	@FXML
	private Button b93;
	@FXML
	private Button b94;
	@FXML
	private Button b95;
	@FXML
	private Button b96;
	@FXML
	private Button b97;
	@FXML
	private Button b98;
	@FXML
	private Button b99;
	@FXML
	private Button b100;

	private static final DrawField DF = new DrawField();

	private String valueOfClickedButton;
	private Button buttonToMakeChange;
	private boolean wasClicked = false;
	private boolean isRun = true;
	private Scene sc;
	private String idwka;
	public String curentID;

	@FXML
	private void initialize() {
	}

	@FXML
	public void mouseClick(MouseEvent event) {

		Object source = event.getSource();
		Button clickedButton = (Button) source;
		sc = ((Node) source).getScene();

		valueOfClickedButton = DF.valueOfButton(clickedButton.getId());
		buttonToMakeChange = clickedButton;

		clickedButton.setDisable(true);
		clickedButton.setText(valueOfClickedButton);

		if (valueOfClickedButton == "X") {
			buttonToMakeChange.setStyle(" -fx-base: red;");
			System.out.println("boom");
			gameOver();
			win();
		}
		wasClicked = true;
		isRun = false;
	}

	public void gameOver() {

		for (int i = 1; i < 101; i++) {
			String curentID = "#b" + i;

			Button nodeToFind = (Button) sc.lookup(curentID);

			if (nodeToFind.isDisable() == false) {
				nodeToFind.setDisable(true);
				nodeToFind.setText(DF.valueOfButton("b" + i));
			}
		}

	}

	public void win() { // доробити виграш повідомлення
		int count = 0;

		if (count == 1) {
			System.out.println("WIN");
		}
	}

}///////////////// CLASS END

// for(int i=1;i<101;i++){
// String id ="b"+i;
// System.out.println(id);
// buttonToMakeChange.setId(id);
// buttonToMakeChange.setDisable(true);
// wasClicked = true;
// initialize();
// }
// }

// public void mLeft(ActionEvent actionEvent) {
//
// Object source = actionEvent.getSource();
////
//// if (!(source instanceof Button)) {
//// return;
//// }
////
//
// Button clickedButton = (Button) source;
//
//
//
//// clickedButton.setOnMousePressed(new EventHandler() {
////
////
////
//// @Override
//// public void handle(Event event) {
////// delta = new Vec2f((float) (mouseEvent.getSceneX() -
// node.getLayoutX()), (float) (mouseEvent.getSceneY() -
// node.getLayoutY()));
////// Main.this.node = node;
//// if (event.getButton() == MouseButton.SECONDARY){
////
////
//// }
//// }
//// });
//
//
//// String but=clickedButton.getOnMouseClicked().handle(arg0);
//
//// if (clickedButton.getButton() == MouseButton.SECONDARY){
//// isRotate = true;
//// }
//
//// whatButtonWasClickedByPlayerForLogic(clickedButton.getId());
//// initialize();
//// lg.isCPUTurn = true;
//// lg.CPUMMadeMove();
//// if (lg.draw() == true) {
////
//// }
//// lg.putLine();
//// initialize();
//
// }
//
// public void whatButtonWasClickedByPlayerForLogic(String clickedButton) {
//
// switch (clickedButton) {
// case "b1":
// lg.btn1 = "X";
// break;
// case "b2":
// lg.btn2 = "X";
// break;
// case "b3":
// lg.btn3 = "X";
// break;
// case "b4":
// lg.btn4 = "X";
// break;
// case "b5":
// lg.btn5 = "X";
// break;
// case "b6":
// lg.btn6 = "X";
// break;
// case "b7":
// lg.btn7 = "X";
// break;
// case "b8":
// lg.btn8 = "X";
// break;
// case "b9":
// lg.btn9 = "X";
// break;
// }
//
// }
//
//
//
