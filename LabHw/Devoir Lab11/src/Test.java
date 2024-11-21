public class Test {
    public static void main(String[] args) {
        ApartmentLoan mancave = new ApartmentLoan("Gabi", "Vaireanu", "Magvult", 1000.0);
        HouseholdProductLoan system = new HouseholdProductLoan("Gabi", "Vaireanu", "Magvult", "Trimestriele", 1000.0);
        
        mancave.computeInstalment();
        mancave.payInstalment();
        
        System.out.println(system.getLastName());

        system.computeInstalment();
        System.out.println(system.getUnpaidSum());
        
        system.payInstalment();
        system.payInstalment();
        system.payInstalment();
        system.payInstalment();


    }
}

