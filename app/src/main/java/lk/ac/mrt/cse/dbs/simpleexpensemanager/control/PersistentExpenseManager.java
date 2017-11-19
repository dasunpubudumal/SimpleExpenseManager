package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

import android.app.ActivityManager;
import android.content.Context;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.control.exception.ExpenseManagerException;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentMemoryAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentMemoryTransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.model.Account;

/**
 * Created by dasun on 11/18/17.
 */

public class PersistentExpenseManager extends ExpenseManager {

    private Context context;    //Get the context.

    public PersistentExpenseManager(Context context){
        this.context = context;
    }

    @Override
    public void setup() throws ExpenseManagerException {
        TransactionDAO persistentTransactionDAO = new PersistentMemoryTransactionDAO();
        setTransactionsDAO(persistentTransactionDAO);
        //Set the transactionDAO as in InMemoryDemoExpenseManager

        AccountDAO persistentAccountDAO = new PersistentMemoryAccountDAO(this.context);
        setAccountsDAO(persistentAccountDAO);
        //Set accountDAO as in InMemoryDemoExpenseManager.

        Account dummyAcct1 = new Account("12345A", "Yoda Bank", "Anakin Skywalker", 10000.0);
        Account dummyAcct2 = new Account("78945Z", "Clone BC", "Obi-Wan Kenobi", 80000.0);
        getAccountsDAO().addAccount(dummyAcct1);


        //Add dummy data here.
    }
}
