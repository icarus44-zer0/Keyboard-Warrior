// package com.purplecobras.keyboardwarrior.gui.v2;

// import com.purplecobras.keyboardwarrior.Shortcut_Map;

// public class GUI_DataElements {
//     // private static String[] tableModel_colNames = GUI_ShortcutTable.list;
//     public static GUI_DataElements instance = null;
//     // private Object[][] tableModel_data;
//     // private Object[] shortcutMap_Values;
//     // private Object[] shortcutMap_Keys;
//     // private Object[][] shortcutGridArray;
//     // private String[] keyList;

//     private Shortcut_Map shortcut_Map;
//     private String[] keyArray;
//     private String[] valueArray;
//     private Object[] keyObject;
//     private Object[] valueObject;
//     private Object[][] gridData;
//     private final String[] tableColNames = { "Keys", "Values" };

//     private GUI_DataElements() {
//         shortcut_Map = Shortcut_Map.getInstance();
//         keyArray = shortcut_Map.get_Shortcut_Map().keySet().toArray(new String[0]);
//         valueArray = shortcut_Map.get_Shortcut_Map().values().toArray(new String[0]);
//         keyObject = shortcut_Map.get_Shortcut_Map().keySet().toArray();
//         valueObject = shortcut_Map.get_Shortcut_Map().values().toArray();
//         gridData = concat(keyObject, valueObject);
//     }

//     public static GUI_DataElements getInstance() {
//         if (instance == null) {
//             instance = new GUI_DataElements();
//         }
//         return instance;
//     }

//     private static void updateShortcutSerFile() {
//         Shortcut_Map shortcut_map = Shortcut_Map.getInstance();
//         shortcut_map.updateShortcutSerFile();

//     }

//     // private static void addNewSCtoSC_MAP() {
//     // Shortcut_Map shortcut_map = Shortcut_Map.getInstance();
//     // String add_key = newShortcut_ShortcutKeyFeild.getText();
//     // String add_value = newShortcut_ShortcutValueFeild.getText();
//     // shortcut_map.get_Shortcut_Map().put(add_key, add_value);
//     // }

//     public static void setInstance(GUI_DataElements instance) {
//         GUI_DataElements.instance = instance;
//     }

//     public String[] getKeyArray() {
//         return keyArray;
//     }

//     public String[] getValueArray() {
//         return valueArray;
//     }


//     public refreshTable() {
//         Shortcut_Map shortcut_map = Shortcut_Map.getInstance();
//         shortcutMap_Keys = shortcut_map.get_Shortcut_Map().keySet().toArray();
//         shortcutMap_Values = shortcut_map.get_Shortcut_Map().values().toArray();
//         shortcutGridArray = concat(shortcutMap_Keys, shortcutMap_Values);
//         shortcutTableModel.setData(shortcutGridArray);
//         tableList.setModel(shortcutTableModel);
//     }

//     // /**
//     // *
//     // */
//     // private static void deleteFromSCMAP() {
//     // int row = tableList.getSelectedRow();
//     // Object keyRemove = tableList.getValueAt(row, 0);
//     // Object valueRemove = tableList.getValueAt(row, 1);
//     // Shortcut_Map scm = Shortcut_Map.getInstance();
//     // if (displayDeleteMessage(valueRemove) == 0) {
//     // scm.get_Shortcut_Map().remove(keyRemove);
//     // scm.updateShortcutSerFile();
//     // }

//     // // displayDeleteMessage(valueRemove);
//     // }

//     // private static int displayDeleteMessage(Object valueRemove) {
//     // JFrame scDeletedPopUpFrame = new JFrame();
//     // int value = JOptionPane.showConfirmDialog(scDeletedPopUpFrame, valueRemove,
//     // "Remove",
//     // JOptionPane.YES_NO_OPTION);
//     // // JOptionPane.showMessageDialog(scRemovedPopUp, valueRemove.toString() +
//     // // "\nShortcut Removed");
//     // return value;
//     // }

//     // /**
//     // *
//     // * @param key
//     // * @param val
//     // * @return
//     // */
//     private static Object[][] concat(Object[] key, Object[] val) {
//         Object res[][] = new Object[key.length][2];
//         if (key.length != val.length) {
//             throw new IllegalArgumentException("lenght are not equal, cannot perform");
//         }
//         for (int i = 0; i < key.length; i++) {
//             res[i][0] = key[i];
//             res[i][1] = val[i];
//         }
//         return res;
//     }

//     public Object[] getKeyObject() {
//         return keyObject;
//     }

//     public void setKeyObject(Object[] keyObject) {
//         this.keyObject = keyObject;
//     }

//     public Object[] getValueObject() {
//         return valueObject;
//     }

//     public void setValueObject(Object[] valueObject) {
//         this.valueObject = valueObject;
//     }

//     public Object[][] getGridData() {
//         return gridData;
//     }

//     public void setGridData(Object[][] gridData) {
//         this.gridData = gridData;
//     }

//     public void setGridData(Object[][] gridData) {
//         this.gridData = gridData;
//     }

//     public String[] getTableColNames() {
//         return tableColNames;
//     }

// }