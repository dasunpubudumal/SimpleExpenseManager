package lk.ac.mrt.cse.dbs.simpleexpensemanager.control;

import lk.ac.mrt.cse.dbs.simpleexpensemanager.control.exception.ExpenseManagerException;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.AccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.TransactionDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentMemoryAccountDAO;
import lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl.PersistentMemoryTransactionDAO;

/**
 * Created by dasun on 11/18/17.
 */

public class PersistentExpenseManager extends ExpenseManager {

    @Override
    public void setup() throws ExpenseManagerException {
        TransactionDAO persistentTransactionDAO = new PersistentMemoryTransactionDAO();
        //Set the transactionDAO as in InMemoryDemoExpenseManager

        AccountDAO persistentAccountDAO = new PersistentMemoryAccountDAO();
        //Set accountDAO as in InMemoryDemoExpenseManager.

        //Add dummy data here.
    }
}
