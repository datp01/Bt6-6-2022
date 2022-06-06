import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static long balanceNumber = 1000000;
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();
    public long getBalanceNumber() {
        return balanceNumber;
    }
    public static long transfer(long money) {
        if (money < 50000) {
            System.out.println("Số tiền tối thiểu phải là 50000");
        } else if (money > balanceNumber) {
            System.out.println("Tài khoản không đủ số dư");
        }else {
            System.out.println("Chuyển khoản thành công" + (balanceNumber - money));
        }
        return balanceNumber;
    }
    public void actionTransfer(){

    }
    public void getHistory(){

    }
    public static String formatMoney(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        //100000->100,000.00
        return formatter.format(money);
    }

}
