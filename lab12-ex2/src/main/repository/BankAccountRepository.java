package main.repository;

import main.config.*;
import main.model.*;

import java.sql.*;

public class BankAccountRepository {
    /*
    *   Statement
    *   PreparedStatement
    *   CallableStatement
    *
    * */

    public void addBankAccount(BankAccount bankAccount) {
        String sql = "insert into bankaccounts values (null, ?, ?, ?, ?) ";
        try (PreparedStatement statement = DatabaseConnection.getInstance().prepareStatement(sql)) {//try with resources
          statement.setString(1, bankAccount.getAccountNumber());
          statement.setDouble(2, bankAccount.getBalance());
          statement.setString(3, bankAccount.getType().toString());
          statement.setString(4, bankAccount.getCardNumber());
          statement.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }

    }
}
