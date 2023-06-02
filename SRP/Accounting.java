public class Accounting {
    public int calculateAfterTaxSalary(Employee worker) {
        int tax = (int) (worker.getBaseSalary() * 0.25); 
        return worker.getBaseSalary() - tax;
    }


}
