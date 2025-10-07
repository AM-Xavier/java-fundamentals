
public class managementBank {

    class BankOperations {

        private double balance;
        private double deposit;
        private double withdraw;

        public double getBalance() {
            return this.balance;
        }

        public void setDeposit(double deposit) {
            this.deposit = deposit;
        }

        public void setWithdraw(double withdraw) {
            this.withdraw = withdraw;
        }
    }

    class Client {

        String name;
        String surname;
        String socialSecurityNumber;

        public Client(String name, String surname, String socialSecurityNumber) {
            this.name = name;
            this.surname = surname;
            this.socialSecurityNumber = socialSecurityNumber;
        }
    }
}
