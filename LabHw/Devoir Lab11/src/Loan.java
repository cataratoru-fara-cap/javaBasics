public class Loan {
    private int id;
    private int number;
    private String firstName;
    private String lastName;
    private String address;
    private String frequency;
    private double sum;
    protected double instalment;
    private double unpaidSum;

    public Loan(String firstName, String lastName, String address, double sum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.sum = sum;
        this.unpaidSum = sum;
    }
    
    public Loan(String firstName, String lastName, String address, String frequency, double sum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.frequency = frequency;
        this.sum = sum;
        this.unpaidSum = sum;

    }

    public double getUnpaidSum() {
        return this.unpaidSum;
    }

    public double getSum(){
        return this.sum;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getFrequency() {
        return frequency;
    }

    public double getInstalment() {
        return instalment;
    }

    public void setUnpaidSum(double unpaidSum) {
        this.unpaidSum = unpaidSum;
    }

    public void computeInstalment() {
        this.instalment = getSum() / 10;
        System.out.println("Instalment to be paid is " + this.instalment);
    }
    
    public void payInstalment() {
        if (getUnpaidSum() > 0.1) {
            System.out.println("Your Debt is " + getUnpaidSum());
            setUnpaidSum(getUnpaidSum() - getInstalment());
        } else {
            System.out.println("No More Dept");
        }
    }

    @Override
    public String toString() {
        return "Loan [id=" + id + ", number=" + number + ", firstName=" + firstName + ", lastName=" + lastName
                + ", address=" + address + ", frequency=" + frequency + ", sum=" + sum + ", instalment=" + instalment
                + ", unpaidSum=" + unpaidSum + "]";
    }
}

