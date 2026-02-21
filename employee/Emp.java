package employee;

public class Emp {
    public String name;
    public int emp_id;
    public String category;
    public double basic_pay, hra, da, net_pay, pf, gross_pay, income_tax, allowance;

    public Emp(String name, int emp_id, String category, double basic_pay) {
        this.name = name;
        this.emp_id = emp_id;
        this.category = category;
        this.basic_pay = basic_pay;
        calculate();
    }

    private void calculate() {
        hra = 0.2 * basic_pay;
        da = 0.1 * basic_pay;
        pf = 0.12 * basic_pay;
        allowance = 0.05 * basic_pay;
        gross_pay = basic_pay + hra + da + allowance;
        income_tax = 0.1 * gross_pay;
        net_pay = gross_pay - (pf + income_tax);
    }

    public void printDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        System.out.println("Allowance: " + allowance);
        System.out.println("Gross Pay: " + gross_pay);
        System.out.println("Income Tax: " + income_tax);
        System.out.println("Net Pay: " + net_pay);
    }
}
