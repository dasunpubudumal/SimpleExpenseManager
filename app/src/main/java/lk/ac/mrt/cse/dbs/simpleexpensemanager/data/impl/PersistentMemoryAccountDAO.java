package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.net.ConnectException;
import java.util.List;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.exception.InvalidAccountException;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.helper.AccountDBHelper;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.ExpenseType;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.ui.MainActivity;

/**
 * Created by dasun on 11/18/17.
 */

public class PersistentMemoryAccountDAO  implements AccountDAO {

    private final Context mContext;

    private final String ACCOUNT_NO;
    private final String BALANCE;
    private final String BANK_NAME;
    private final String ACCOUNT_HOLDER;

    public PersistentMemoryAccountDAO(Context context){
        this.mContext = context;
        ACCOUNT_NO = "account_number";
        BALANCE = "balance";
        BANK_NAME = "bank_name";
        ACCOUNT_HOLDER = "holder_name";
    }

    @Override
    public List<String> getAccountNumbersList() {
        return null;
    }

    @Override
    public List<Account> getAccountsList() {
        return null;
    }

    @Override
    public Account getAccount(String accountNo) throws InvalidAccountException {
        return null;
    }

    @Override
    public void addAccount(Account account) {
        AccountDBHelper accountDBHelper = AccountDBHelper.getInstance(mContext);
        SQLiteDatabase db = accountDBHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put( this.ACCOUNT_NO, account.getAccountNo());
        values.put( this.BALANCE, account.getBalance());
        values.put( this.BANK_NAME, account.getBankName());
        values.put( this.ACCOUNT_HOLDER, account.getAccountHolderName());

        db.insert("account", null, values);

    }

    @Override
    public void removeAccount(String accountNo) throws InvalidAccountException {

    }

    @Override
    public void updateBalance(String accountNo, ExpenseType expenseType, double amount) throws InvalidAccountException {

    }
}
