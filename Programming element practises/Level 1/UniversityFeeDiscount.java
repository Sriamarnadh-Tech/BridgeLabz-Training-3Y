public class UniversityFeeDiscount {
    public static void main(String[] args) {
        int fee = 125000;                  // original fee
        int discountPercent = 10;          // discount percentage

        double discount = (fee * discountPercent) / 100.0; // discount amount
        double finalFee = fee - discount;  // fee after discount

        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee
        );
    }
}
