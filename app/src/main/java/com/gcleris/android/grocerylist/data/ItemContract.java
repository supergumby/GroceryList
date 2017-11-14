//package com.gcleris.android.grocerylist.data;
//
//import android.provider.BaseColumns;
//
///**
// * Created by gcler on 2017-10-28.
// */
//
//public class ItemContract {
//    //To prevent someone from accidentally instantiating the contract class,
//    // make the constructor private.
//    private ItemContract() {}
//
//     /**    Inner class that defines the table contents
//      *     and constant values for the items database table.
//      */
//    public static final class ItemEntry implements BaseColumns {
//        public final static String TABLE_NAME = "items";
//        public final static String _ID = BaseColumns._ID;
//        public final static String COLUMN_NAME_POSITION ="position";
//        public final static String COLUMN_NAME_QTY = "qty";
//        public final static String COLUMN_NAME_ITEM_BOUGHT = "itemBought";
//        public final static String COLUMN_NAME_ESSENTIAL = "essential";
//        public final static String COLUMN_NAME_ITEM_TO_BUY = "itemToBuy";
//
//        /**
//         * Possible values for the position of the item in the grocery store.
//         */
//        public static final int POSITION_UNKNOWN = 0;
//        public static final int POSITION_BEGINING = 1;
//        public static final int POSITION_MIDDLE_BEGINNING = 2;
//        public static final int POSITION_MIDDLE = 3;
//        public static final int POSITION_MIDDLE_END = 4;
//        public static final int POSITION_END = 5;
//
//    }
//
//}
