public class HouseholdProductLoan extends Loan{

    public HouseholdProductLoan(String firstName, String lastName, String address, double sum) {
        super(firstName, lastName, address, sum);
        setUnpaidSum(this.getSum());

    }

    public HouseholdProductLoan(String firstName, String lastName, String address, String frequency, double sum) {
        super(firstName, lastName, address, frequency, sum);
        setUnpaidSum(this.getSum() + this.getSum() / 100 * 7 * 3);

    }

    @Override
    public void computeInstalment() {
        String frequency = super.getFrequency();
    
        if ( (frequency != null) && (frequency.equals("Trimestriele")) )
            this.instalment = super.getSum() / 3 + super.getSum()/ 100 * 7;
        else    
            super.computeInstalment();
    }
}
