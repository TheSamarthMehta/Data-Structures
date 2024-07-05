import java.util.Scanner;
class BankAccount{
	String account_number;
	double balance;
	String account_holder;
	String name;
		public BankAccount(String account_number, double balance, String account_holder, String name){
			this.account_holder = account_holder;
			this.balance = balance;
			this.account_number = account_number;
			this.name = name;
		}
		public void deposit_money(){

		}
		public void withdraw_money(){

		}
		public void check_balance(){

		}
}
public class DemoBankAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BankAccount[] ba1 = new BankAccount[1];
	}
	
}