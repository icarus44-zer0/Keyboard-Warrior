package keyboardwarrior;

import org.jnativehook.keyboard.NativeKeyEvent;
import java.awt.Robot;


public class KeyInterpreter{

    private KeyMap keymap;
    private KeyBuffer buffer;

    private Boolean isShift;
    private Boolean isCaps;
    private Boolean isWhiteSpace;
    private Boolean isRemove;
    private Boolean isNumeric;
    private Boolean isSpecial;
    private Boolean isAlpha;

    private Robot robot;

    public KeyInterpreter() {
        keymap = KeyMap.getInstance();
        buffer = KeyBuffer.getInstance();

        isShift = false;
        isCaps = false;
        isWhiteSpace = false;
        isRemove = false;
        isNumeric = false;
        isSpecial = false;
        isAlpha = false;
    }

    /**
     * Key Check Order (1) Delete, Backspace (2) Space, Tab, Return (3) A-Z w/ Shift
     * Modifier (4) A-Z w/ Caps Modifier (5) A-Z w/ Caps Modifier && Shift Modifier
     * (6) 0-9 w/ Shift Modifier (7) Special Keys w/ Shift Modifier (8) A-Z (9) 0-9
     * (10) Special Keys
     */
    public void interpret(int keyCode) {
        isWhiteSpacePress(keyCode);
        isRemovePress(keyCode);
        isNumPress(keyCode);
        isSpecialPress(keyCode);
        isAlphaPress(keyCode);

        if (isRemove) {
            remove();
        } else if (isWhiteSpace) {
            whiteSpace();
        } else if (isShift && isAlpha && !isCaps) {
            alphaModified(keyCode);
        } else if (isCaps && isAlpha && !isShift) {
            alphaModified(keyCode);
        } else if (isShift && isCaps && isAlpha) {
            alpha(keyCode);
        } else if (isShift && isNumeric) {
            numericModified(keyCode);
        } else if (isShift && isSpecial) {
            specialModified(keyCode);
        } else if (isAlpha) {
            alpha(keyCode);
        } else if (isNumeric) {
            numeric(keyCode);
        } else if (isSpecial) {
            special(keyCode);
        } else {
            return;
        }
    }

    private void isAlphaPress(int keyCode) {
        if (keymap.getAlpha().containsKey(keyCode)) {
            isAlpha = true;
        }
    }

    private void isNumPress(int keyCode) {
        if (keymap.getNumeric().containsKey(keyCode)) {
            isNumeric = true;
        }
    }

    private void isSpecialPress(int keyCode) {
        if (keymap.getSpecial().containsKey(keyCode)) {
            isSpecial = true;
        }
    }

    private void isWhiteSpacePress(int keyCode) {
        if (keyCode == NativeKeyEvent.VC_ENTER || keyCode == NativeKeyEvent.VC_TAB
                || keyCode == NativeKeyEvent.VC_SPACE) {
            isWhiteSpace = true;
        }
    }

    private void isRemovePress(int keyCode) {
        if (keyCode == NativeKeyEvent.VC_BACKSPACE || keyCode == NativeKeyEvent.VC_BACKSPACE) {
            isRemove = true;
        }
    }

    private void alpha(int keyCode) {
        buffer.add(keymap.getAlpha().get(keyCode));
        resetFlags();
    }

    private void numeric(int keyCode) {
        buffer.add(keymap.getNumeric().get(keyCode));
        resetFlags();
    }

    private void special(int keyCode) {
        buffer.add(keymap.getSpecial().get(keyCode));
        resetFlags();
    }

    private void alphaModified(int keyCode) {
        buffer.add(keymap.getAlpha().get(keyCode).toUpperCase());
        resetFlags();
    }

    private void numericModified(int keyCode) {
        buffer.add(keymap.getNumericMod().get(keyCode));
        resetFlags();
    }

    private void specialModified(int keyCode) {
        buffer.add(keymap.getSpecialMod().get(keyCode));
        resetFlags();
    }

    private void whiteSpace() {
        buffer.clear();
        resetFlags();
    }

    private void remove() {
        buffer.clear();
        resetFlags();
    }

    public void modifierRelesed(int keyCode) {
        if (keyCode == NativeKeyEvent.VC_SHIFT) {
            isShift = false;
        }
    }

    public void modifierPressed(int keyCode) {
       
        robot.waitForIdle();
        // if (keyCode == NativeKeyEvent.VC_CAPS_LOCK) {
        //     System.out.println(isCaps + " Caps presses");
        //     if (isCaps) {
        //         isCaps = false;
        //     } else if (!isCaps) {
        //         isCaps = true;
        //     }
        // }
        if (keyCode == NativeKeyEvent.VC_SHIFT) {
            isShift = true;
        }
    }

    private void resetFlags() {
        isWhiteSpace = false;
        isRemove = false;
        isNumeric = false;
        isSpecial = false;
        isAlpha = false;
    }
}
