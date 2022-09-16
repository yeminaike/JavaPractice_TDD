package TDD.Bank_Account;

import TDD.Bank_Account.Account;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void depositMoneyTest(){
        Account myAccount = new Account();
        myAccount.deposit(3000);
        int balance = myAccount.getBalance();
        assertEquals(3000, balance);
    }
    @Test
    public void negativeDepositShouldNotWorkTest(){
        Account myAccount = new Account();
        myAccount.deposit(10000);
        assertEquals(10000, myAccount.getBalance());
        myAccount.deposit(-5000);
        assertEquals(10000, myAccount.getBalance());
    }
    @Test
    public void withdrawMoneyTest(){
        Account myAccount = new Account();
        myAccount.deposit(25000);
        assertEquals(25000, myAccount.getBalance());
        myAccount.withdraw(30000);
        assertEquals(25000, myAccount.getBalance());
    }
}