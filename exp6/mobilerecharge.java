

abstract class mobilerecharged {
         String planName;
    double planAmount;
    int validityDays;
    mobilerecharged(String planName, double planAmount, int validityDays) {
        this.planName = planName;
        this.planAmount = planAmount;
        this.validityDays = validityDays;
    }
    abstract void displayPlanDetails();
     abstract double calculateRechargeAmount(double talkTime);
}
class PrepaidRecharge extends mobilerecharged{
    PrepaidRecharge(String planName, double planAmount, int validityDays) {
        super(planName, planAmount, validityDays);
    }

    void displayPlanDetails() {
        System.out.println("Prepaid Plan: " + planName);
        System.out.println("Amount: " + planAmount);
        System.out.println("Validity: " + validityDays + " days");
    }

    double calculateRechargeAmount(double talkTime) {
        return planAmount + talkTime;
    }
}
class postpaidRecharge extends mobilerecharged{
    postpaidRecharge(String planName, double planAmount, int validityDays) {
        super(planName, planAmount, validityDays);
    }

    void displayPlanDetails() {
        System.out.println("Postpaid Plan: " + planName);
        System.out.println("Amount: " + planAmount);
        System.out.println("Validity: " + validityDays + " days");
    }

    double calculateRechargeAmount(double talkTime) {
        return planAmount + (talkTime * 0.5); // Assuming postpaid charges are based on talk time
    }
}

public class mobilerecharge {
    public static void main(String[] args) {
        PrepaidRecharge prepaidPlan = new PrepaidRecharge("Prepaid Plan A", 100, 30);
        postpaidRecharge postpaidPlan = new postpaidRecharge("Postpaid Plan B", 200, 30);

        prepaidPlan.displayPlanDetails();
        System.out.println("Total Recharge Amount (Prepaid): " + prepaidPlan.calculateRechargeAmount(50));

        postpaidPlan.displayPlanDetails();
        System.out.println("Total Recharge Amount (Postpaid): " + postpaidPlan.calculateRechargeAmount(50));
    }
}
