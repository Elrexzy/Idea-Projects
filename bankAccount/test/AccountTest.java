import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
}