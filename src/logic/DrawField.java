package logic;

import javafx.scene.control.Button;

public class DrawField {
	public Button b1;
	public Button b2;
	public Button b3;
	public Button b4;
	public Button b5;
	public Button b6;
	public Button b7;
	public Button b8;
	public Button b9;
	public Button b10;
	public Button b11;
	public Button b12;
	public Button b13;
	public Button b14;
	public Button b15;
	public Button b16;
	public Button b17;
	public Button b18;
	public Button b19;
	public Button b20;
	public Button b21;
	public Button b22;
	public Button b23;
	public Button b24;
	public Button b25;
	public Button b26;
	public Button b27;
	public Button b28;
	public Button b29;
	public Button b30;
	public Button b31;
	public Button b32;
	public Button b33;
	public Button b34;
	public Button b35;
	public Button b36;
	public Button b37;
	public Button b38;
	public Button b39;
	public Button b40;
	public Button b41;
	public Button b42;
	public Button b43;
	public Button b44;
	public Button b45;
	public Button b46;
	public Button b47;
	public Button b48;
	public Button b49;
	public Button b50;
	public Button b51;
	public Button b52;
	public Button b53;
	public Button b54;
	public Button b55;
	public Button b56;
	public Button b57;
	public Button b58;
	public Button b59;
	public Button b60;
	public Button b61;
	public Button b62;
	public Button b63;
	public Button b64;
	public Button b65;
	public Button b66;
	public Button b67;
	public Button b68;
	public Button b69;
	public Button b70;
	public Button b71;
	public Button b72;
	public Button b73;
	public Button b74;
	public Button b75;
	public Button b76;
	public Button b77;
	public Button b78;
	public Button b79;
	public Button b80;
	public Button b81;
	public Button b82;
	public Button b83;
	public Button b84;
	public Button b85;
	public Button b86;
	public Button b87;
	public Button b88;
	public Button b89;
	public Button b90;
	public Button b91;
	public Button b92;
	public Button b93;
	public Button b94;
	public Button b95;
	public Button b96;
	public Button b97;
	public Button b98;
	public Button b99;
	public Button b100;

	public int number = 0;
	private static int i = 0;
	private static int j = 0;

	private static CreateField makeField = new CreateField();

	public void makeField() {
		makeField.createFieldForForm();
	}

	public String valueOfButton(String bID) {
		whatNumberForButton(bID);
		whatCellInArray();
		String value = Integer.toString(makeField.pole[i][j]);
		if(makeField.pole[i][j]==-1){
			value="X";
			
		}
		return value;
	}

	public int whatNumberForButton(String bID) {// what number of button that
												// was clicked
		number = Integer.parseInt(bID.replace('b', '0'));
		return number;
	}

	public int[][] whatCellInArray() { // coordinates for array
		int[][] arr = new int[1][1];
		double newNumber = (number - 1) / 10;
		i = (int) newNumber;
		j = (number - (int) (newNumber * 10)) - 1;
		return arr;
	}

}
