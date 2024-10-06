package p245;

public class Account {
	 private int balance;

	    public Account(int initialBalance) {
	        this.balance = initialBalance;
	    }

	    public void displayBalance() {
	        System.out.println("잔금은 " + balance + "원입니다.");
	    }

	    public void withdraw(int amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println(amount + "원 인출");
	            displayBalance();
	        } else {
	            System.out.println("잔액이 부족합니다.");
	        }
	    }

	    public static void main(String[] args) {
	        Account account = new Account(6600);  // 초기 잔액 6600원
	        account.displayBalance();  // 잔금은 6600원입니다.
	        account.withdraw(1000);    // 1000원 인출
	    }
}
