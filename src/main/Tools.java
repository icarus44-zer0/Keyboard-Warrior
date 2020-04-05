package main;

/*
*   Usefult tools can be written here!
*/
public class Tools {

	public static boolean containsLoggerKey(String key) {
		switch (key) {
			case "Tab":
				return false;
			case "Space":
				return false;
			case "Shift":
				return false;
			case "Return":
				return false;
			case "Delete":
				return false;
			case "Backspace":
				return false;
			case "Enter":
				return false;
			case "Ctrl":
				return false;
			case "Alt":
				return false;
			case "Meta":
				return false;
			case "Escape":
				return false;
			case "Undefined":
				return false;
			case "Left":
				return false;
			case "Down":
				return false;
			case "Right":
				return false;
			case "Up":
				return false;
			case "Unknown keyCode: 0xe36":
				return false;
			default:
				return true;
		}

	}
}