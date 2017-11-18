package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dasun on 11/18/17.
 */

public class AccountDBHelper extends SQLiteOpenHelper{

    private static final String DB_NAME = "account.db";
    private static final String DB_VERSION = "1";

    public AccountDBHelper(Context context) {
        super(context, DB_NAME, null, Integer.parseInt(DB_VERSION));
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE account " +
                "(account_number VARCHAR(20), " +
                "balance DECIMAL(6,2), " +
                "bank_name VARCHAR(30), " +
                "holder_name VARCHAR(50), " +
                "PRIMARY KEY (account_number))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS account");
        onCreate(sqLiteDatabase);
    }

}
