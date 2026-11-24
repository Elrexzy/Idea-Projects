import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test

    public void iHaveAnAccount() {
        Account account = new Account();
        assertEquals(0, account.getBalance());
    }

    @Test
    public void checkBalanceIS_5K_AfterDepositing_5K() {
        Account account = new Account();
        assertEquals(0, account.getBalance());

        account.deposit(5_000);
        assertEquals(5_000, account.getBalance());

    }

    @Test
    public void withdraw3kFromAccount() {
        Account account = new Account();
        assertEquals(0, account.getBalance());

        account.deposit(5_000);
        assertEquals(5_000, account.getBalance());


        account.withdraw(10_000);
        assertEquals(5_000, account.getBalance());

        account.withdraw(2_000);
        assertEquals(3_000, account.getBalance());

    }

    @Test
    public void accountPinHasBeenCreated_andCanBeUsed() {
        Account account = new Account();
        account.setPin(1234);
        assertTrue(account.verifyPin(1234));
    }

    @Test
    public void accountCannotAcceptAPinWithLessThanFourDigits() {
        Account account = new Account();
        account.setPin(123);
        assertFalse(account.verifyPin(123));
    }


    @Test
    public void accountCannotAcceptAPinWithMoreThanFourDigits() {
        Account account = new Account();
        account.setPin(12345);
        assertFalse(account.verifyPin(12345));
    }


    @Test
    public void accountOwnerIsAbleToChangePin() {

        Account account = new Account();
        account.setPin(1234);

        account.changePin(1234, 5678);

        assertTrue(account.verifyPin(5678));
        assertFalse(account.verifyPin(1234));
    }


    @Test
    public void accountPinCannotChangeIfTheOtherPinUsedBeforeIsNotCorrect() {

        Account account = new Account();
        account.setPin(1234);

        account.changePin(4321, 5678);

        assertTrue(account.verifyPin(1234));
        assertFalse(account.verifyPin(5678));
    }


    @Test
    public void accountPinCannotBeChangedToAnInvalidPin() {

        Account account = new Account();
        account.setPin(1234);

        account.changePin(1234, 123);

        assertTrue(account.verifyPin(1234));
    }


}

