package logic;

public class Logic2 {

	public static String CPUClickedButton;
	public boolean isCPUTurn = false;
	public boolean isCPUFirstMove = true;
	public static Boolean whosMoveAfterRandom;
	public static String CPUClicked;
	public static String winner;

	public String btn1 = "";
	public String btn2 = "";
	public String btn3 = "";
	public String btn4 = "";
	public String btn5 = "";
	public String btn6 = "";
	public String btn7 = "";
	public String btn8 = "";
	public String btn9 = "";
	public boolean lH1 = false;
	public boolean lH2 = false;
	public boolean lH3 = false;
	public boolean lV1 = false;
	public boolean lV2 = false;
	public boolean lV3 = false;
	public boolean lD1 = false;
	public boolean lD2 = false;
	public boolean btn1Enable = true;
	public boolean btn2Enable = true;
	public boolean btn3Enable = true;
	public boolean btn4Enable = true;
	public boolean btn5Enable = true;
	public boolean btn6Enable = true;
	public boolean btn7Enable = true;
	public boolean btn8Enable = true;
	public boolean btn9Enable = true;

	public boolean random() { // who will play first CPU or Player
		double rand = (Math.random());
		if (rand < 0.5) {
			whosMoveAfterRandom = false;
			isCPUTurn = false;
			return false;

		} else {
			whosMoveAfterRandom = true;
			isCPUTurn = true;
			return true;
		}
	}

	public String CPUMMadeMove() { // cpu turn to make his move
		isCPUTurn = true;
		if (isCPUFirstMove) { // cpu first move
			if (btn5 == "") {
				btn5 = "O";
				isCPUFirstMove = false;
				isCPUTurn = false;
			} else if ((btn1 == "") && (isCPUTurn)) {
				btn1 = "O";
				isCPUFirstMove = false;
				isCPUTurn = false;
			}
		} else {
			if (isCPUTurn) {

				cpuNextMove();
				isCPUTurn = false;
			}
		}

		return CPUClickedButton;

	}

	public boolean cpuNextMove() {

		if (cpuWillWin()) {
			System.out.println("CPU Last Move");
			isCPUTurn = false;
			winner = "CPU";
			disableButtons();
			return true;
		}

		if (isCPUTurn == true) {

			if (playerWillWin()) {
				System.out.println("Player Last Move");
				isCPUTurn = false;
				return true;

			} else {
				if (isCPUTurn == true) {
				if (findCorner()) {
					System.out.println("Corner");
					return true;
				} else {
					findFreeCell();
					return true;
				}
			}
			}
		}
		return false;

	}

	public boolean cpuWillWin() {
		///////////////// first horisontal

		if ((btn1 == "") && (btn2 == "O") && (btn3 == "O")) {
			btn1 = "O";
			return true;
		}
		if ((btn1 == "O") && (btn2 == "") && (btn3 == "O")) {
			btn2 = "O";
			return true;
		}
		if ((btn1 == "O") && (btn2 == "O") && (btn3 == "")) {
			btn3 = "O";
			return true;
		}
		///////////////// second horisontal
		if ((btn4 == "") && (btn5 == "O") && (btn6 == "O")) {
			btn4 = "O";
			return true;
		}
		if ((btn4 == "O") && (btn5 == "") && (btn6 == "O")) {
			btn5 = "O";
			return true;
		}
		if ((btn4 == "O") && (btn5 == "O") && (btn6 == "")) {
			btn6 = "O";
			return true;
		}
		///////////////// third horisontal
		if ((btn7 == "") && (btn8 == "O") && (btn9 == "O")) {
			btn7 = "O";
			return true;
		}
		if ((btn7 == "O") && (btn8 == "") && (btn9 == "O")) {
			btn8 = "O";
			return true;
		}
		if ((btn7 == "O") && (btn8 == "O") && (btn9 == "")) {
			btn9 = "O";
			return true;
		}

		///////////////// first vertical
		if ((btn1 == "") && (btn4 == "O") && (btn7 == "O")) {
			btn1 = "O";
			return true;
		}
		if ((btn1 == "O") && (btn4 == "") && (btn7 == "O")) {
			btn4 = "O";
			return true;
		}
		if ((btn1 == "O") && (btn4 == "O") && (btn7 == "")) {
			btn7 = "O";
			return true;
		}

		///////////////// second vertical
		if ((btn2 == "") && (btn5 == "O") && (btn8 == "O")) {
			btn2 = "O";
			return true;
		}
		if ((btn2 == "O") && (btn5 == "") && (btn8 == "O")) {
			btn5 = "O";
			return true;
		}
		if ((btn2 == "O") && (btn5 == "O") && (btn8 == "")) {
			btn8 = "O";
			return true;
		}

		///////////////// third vertical
		if ((btn3 == "") && (btn6 == "O") && (btn9 == "O")) {
			btn3 = "O";
			return true;
		}
		if ((btn3 == "O") && (btn6 == "") && (btn9 == "O")) {
			btn6 = "O";
			return true;
		}
		if ((btn3 == "O") && (btn6 == "O") && (btn9 == "")) {
			btn9 = "O";
			return true;
		}

		///////////////// left diagonal
		if ((btn1 == "") && (btn5 == "O") && (btn9 == "O")) {
			btn1 = "O";
			return true;
		}
		if ((btn1 == "O") && (btn5 == "") && (btn9 == "O")) {
			btn5 = "O";
			return true;
		}
		if ((btn1 == "O") && (btn5 == "O") && (btn9 == "")) {
			btn9 = "O";
			return true;
		}
		///////////////// right diagonal
		if ((btn3 == "") && (btn5 == "O") && (btn7 == "O")) {
			btn3 = "O";
			return true;
		}
		if ((btn3 == "O") && (btn5 == "") && (btn7 == "O")) {
			btn5 = "O";
			return true;
		}
		if ((btn3 == "O") && (btn5 == "O") && (btn7 == "")) {
			btn7 = "O";
			return true;
		}

		return false;
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean playerWillWin() {
		///////////////// first horisontal
		if ((btn1 == "") && (btn2 == "X") && (btn3 == "X")) {
			btn1 = "O";

			return true;
		}
		if ((btn1 == "X") && (btn2 == "") && (btn3 == "X")) {
			btn2 = "O";
			return true;
		}
		if ((btn1 == "X") && (btn2 == "X") && (btn3 == "")) {
			btn3 = "O";
			return true;
		}

		///////////////// second horisontal
		if ((btn4 == "") && (btn5 == "X") && (btn6 == "X")) {
			btn4 = "O";

			return true;
		}
		if ((btn4 == "X") && (btn5 == "") && (btn6 == "X")) {
			btn5 = "O";
			return true;
		}
		if ((btn4 == "X") && (btn5 == "X") && (btn6 == "")) {
			btn6 = "O";
			return true;
		}
		///////////////// third horisontal
		if ((btn7 == "") && (btn8 == "X") && (btn9 == "X")) {
			btn7 = "O";
			return true;
		}
		if ((btn7 == "X") && (btn8 == "") && (btn9 == "X")) {
			btn8 = "O";
			return true;
		}
		if ((btn7 == "X") && (btn8 == "X") && (btn9 == "")) {
			btn9 = "O";
			return true;
		}

		///////////////// first vertical
		if ((btn1 == "") && (btn4 == "X") && (btn7 == "X")) {
			btn1 = "O";
			return true;
		}
		if ((btn1 == "X") && (btn4 == "") && (btn7 == "X")) {
			btn4 = "O";
			return true;
		}
		if ((btn1 == "X") && (btn4 == "X") && (btn7 == "")) {
			btn7 = "O";
			return true;
		}

		///////////////// second vertical
		if ((btn2 == "") && (btn5 == "X") && (btn8 == "X")) {
			btn2 = "O";
			return true;
		}
		if ((btn2 == "X") && (btn5 == "") && (btn8 == "X")) {
			btn5 = "O";
			return true;
		}
		if ((btn2 == "X") && (btn5 == "X") && (btn8 == "")) {
			btn8 = "O";
			return true;
		}

		///////////////// third vertical
		if ((btn3 == "") && (btn6 == "X") && (btn9 == "X")) {
			btn3 = "O";
			return true;
		}
		if ((btn3 == "X") && (btn6 == "") && (btn9 == "X")) {
			btn6 = "O";
			return true;
		}
		if ((btn3 == "X") && (btn6 == "X") && (btn9 == "")) {
			btn9 = "O";
			return true;
		}

		///////////////// left diagonal
		if ((btn1 == "") && (btn5 == "X") && (btn9 == "X")) {
			btn1 = "O";
			return true;
		}
		if ((btn1 == "X") && (btn5 == "") && (btn9 == "X")) {
			btn5 = "O";
			return true;
		}
		if ((btn1 == "X") && (btn5 == "O") && (btn9 == "")) {
			btn9 = "O";
			return true;
		}
		///////////////// right diagonal
		if ((btn3 == "") && (btn5 == "X") && (btn7 == "X")) {
			btn3 = "O";
			return true;
		}
		if ((btn3 == "X") && (btn5 == "") && (btn7 == "X")) {
			btn5 = "O";
			return true;
		}
		if ((btn3 == "X") && (btn5 == "X") && (btn7 == "")) {
			btn7 = "O";
			return true;
		}

		return false;
	}

	//////////////////////////////////////////////////////////////////////////

	public boolean findCorner() {
		///////////////// first horisontal
		if (isCPUTurn == false) {
			return false;

		}
		if (btn1 == "") {
			btn1 = "O";
			return true;
		}
		if (btn3 == "") {
			btn3 = "O";
			return true;
		}
		if (btn7 == "") {
			btn7 = "O";
			return true;
		}
		if (btn9 == "") {
			btn9 = "O";
			return true;
		}

		return false;
	}

	public boolean findFreeCell() {
		if (isCPUTurn == false) {
			return false;

		}

		if (btn1 == "") {
			btn1 = "O";
			return true;
		}
		if (btn2 == "") {
			btn2 = "O";
			return true;
		}
		if (btn3 == "") {
			btn3 = "O";
			return true;
		}
		if (btn4 == "") {
			btn4 = "O";
			return true;
		}
		if (btn5 == "") {
			btn5 = "O";
			return true;
		}
		if (btn6 == "") {
			btn6 = "O";
			return true;
		}
		if (btn7 == "") {
			btn7 = "O";
			return true;
		}
		if (btn8 == "") {
			btn8 = "O";
			return true;
		}
		if (btn9 == "") {
			btn9 = "O";
			return true;
		}

		return false;
	}

	public boolean draw() {
		if ((btn1 == "") || (btn2 == "") || (btn3 == "") || (btn4 == "") || (btn5 == "") || (btn6 == "") || (btn7 == "")
				|| (btn8 == "") || (btn9 == "")) {
			return false;
		}

		return true;

	}

	public void restart() {
		btn1 = "";
		btn2 = "";
		btn3 = "";
		btn4 = "";
		btn5 = "";
		btn6 = "";
		btn7 = "";
		btn8 = "";
		btn9 = "";

		isCPUTurn = false;
		isCPUFirstMove = true;
		whosMoveAfterRandom = null;
		winner = null;

		lH1 = false;
		lH2 = false;
		lH3 = false;
		lV1 = false;
		lV2 = false;
		lV3 = false;
		lD1 = false;
		lD2 = false;

		btn1Enable = true;
		btn2Enable = true;
		btn3Enable = true;
		btn4Enable = true;
		btn5Enable = true;
		btn6Enable = true;
		btn7Enable = true;
		btn8Enable = true;
		btn9Enable = true;

	}

	public void putLine() {
		 

		/// Horisontal
		if (((btn1 == "O") && (btn2 == "O") && (btn3 == "O")) || ((btn1 == "X") && (btn2 == "X") && (btn3 == "X"))) {
			lH1 = true;
		}
		if (((btn4 == "O") && (btn5 == "O") && (btn6 == "O")) || ((btn4 == "X") && (btn5 == "X") && (btn6 == "X"))) {
			lH2 = true;
		}
		if (((btn7 == "O") && (btn8 == "O") && (btn9 == "O")) || ((btn7 == "X") && (btn8 == "X") && (btn9 == "X"))) {
			lH3 = true;
		}

		/// Vertical
		if (((btn1 == "O") && (btn4 == "O") && (btn7 == "O")) || ((btn1 == "X") && (btn4 == "X") && (btn7 == "X"))) {
			lV1 = true;
		}
		if (((btn2 == "O") && (btn5 == "O") && (btn8 == "O")) || ((btn2 == "X") && (btn5 == "X") && (btn8 == "X"))) {
			lV2 = true;
		}
		if (((btn3 == "O") && (btn6 == "O") && (btn9 == "O")) || ((btn3 == "X") && (btn6 == "X") && (btn9 == "X"))) {
			lV3 = true;
		}

		/// Diagonal
		if (((btn1 == "O") && (btn5 == "O") && (btn9 == "O")) || ((btn1 == "X") && (btn5 == "X") && (btn9 == "X"))) {
			lD1 = true;
		}
		if (((btn3 == "O") && (btn5 == "O") && (btn7 == "O")) || ((btn3 == "X") && (btn5 == "X") && (btn7 == "X"))) {
			lD2 = true;
		}

	}

	public void disableButtons() {

		btn1Enable = false;
		btn2Enable = false;
		btn3Enable = false;
		btn4Enable = false;
		btn5Enable = false;
		btn6Enable = false;
		btn7Enable = false;
		btn8Enable = false;
		btn9Enable = false;
	}

}///////////// CLASS END
