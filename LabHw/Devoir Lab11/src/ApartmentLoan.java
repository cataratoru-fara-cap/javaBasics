public class ApartmentLoan extends Loan{

    public ApartmentLoan(String firstName, String lastName, String address, double sum) {
        super(firstName, lastName, address, sum);
        setUnpaidSum(this.getSum());
    }

    public ApartmentLoan(String firstName, String lastName, String address, String frequency, double sum) {
        super(firstName, lastName, address, frequency, sum);
        setUnpaidSum(this.getSum() + this.getSum() / 100 * 3 * 3);
    }

    @Override
    public void computeInstalment() {
        String frequency = super.getFrequency();

        if ((frequency != null) && (frequency.equals("Trimestriele")) )
            this.instalment = super.getSum() / super.getSum() / 100 * 3;
        else    
            super.computeInstalment();
    }
}