package com.purplecobras.keyboardwarrior.gui.v2;

public class GUI_DataElements {
    //private static String[] tableModel_colNames = GUI_ShortcutTable.list;
    private static Object[][] tableModel_data;
    private static Object[] shortcutMap_Values;
    private static Object[] shortcutMap_Keys;
    private static Object[][] shortcutGridArray;



//     /**
//      * 
//      */
//     private static void deleteFromSCMAP() {
//         int row = tableList.getSelectedRow();
//         Object keyRemove = tableList.getValueAt(row, 0);
//         Object valueRemove = tableList.getValueAt(row, 1);
//         Shortcut_Map scm = Shortcut_Map.getInstance();
//         if (displayDeleteMessage(valueRemove)==0){
//          scm.get_Shortcut_Map().remove(keyRemove);
//          scm.updateShortcutSerFile();
//          updateJTable();
//         }

//         //displayDeleteMessage(valueRemove);
//  }


     /**
     * 
     * @param key
     * @param val
     * @return
     */
    private static Object[][] concat(Object[] key, Object[] val) {
        Object res[][] = new Object[key.length][2];
        if (key.length != val.length) {
            throw new IllegalArgumentException("lenght are not equal, cannot perform");
        }
        for (int i = 0; i < key.length; i++) {
            res[i][0] = key[i];
            res[i][1] = val[i];
        }
        return res;
    }

}