public class SRP {
    public static void main(String[] args) {
        Employee person1 = new Employee("Игорь", 100500);
        Accounting headOffice = new Accounting();
        System.out.println(person1.getEmpInfo());
        System.out.println("After tax salary: " + headOffice.calculateAfterTaxSalary(person1));
    }
}
