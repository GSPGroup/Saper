package objects;

public class Button {
	private String btnText;
	private String btnTextToShow;
	private boolean btnDisable;
	private boolean btnTextVisible;

	public Button(String btnText, String btnTextToShow, boolean btnDisable, boolean btnTextVisible) {
		super();
		this.btnText = btnText;
		this.btnTextToShow = btnTextToShow;
		this.btnDisable = btnDisable;
		this.btnTextVisible = btnTextVisible;
	}

	public String getBtnText() {
		return btnText;
	}

	public void setBtnText(String btnText) {
		this.btnText = btnText;
	}

	public String getBtnTextToShow() {
		return btnTextToShow;
	}

	public void setBtnTextToShow(String btnTextToShow) {
		this.btnTextToShow = btnTextToShow;
	}

	public boolean isBtnDisable() {
		return btnDisable;
	}

	public void setBtnDisable(boolean btnDisable) {
		this.btnDisable = btnDisable;
	}

	public boolean isBtnTextVisible() {
		return btnTextVisible;
	}

	public void setBtnTextVisible(boolean btnTextVisible) {
		this.btnTextVisible = btnTextVisible;
	}

}
