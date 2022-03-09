package Course;

import java.math.BigDecimal;
import java.util.Arrays;

public class Cart {
    /*Constructors
    Fields
    Methods
    Initialisation blocks
    Nested classes
    */
    private static final int DEFAULT_CART_CAPACITY = 10;
    private static final int MONEY_SCALE = 2;
    private static final double DEFAULT_TAX_RATE = 0.15;
    private static final String DEFAULT_TAX_TYPE = "incomeTax";
    private static final double DEFAULT_DISCOUNT_RATE = 0;
    private static final String DEFAULT_DISCOUNT_NAME = "zeroDiscount";

    private static int cartCounter;

    private int id;
    private int userId;
    private BigDecimal totalNetPrice; // without taxes
    private BigDecimal totalGrossPrice; // with taxes
    private BigDecimal totalTax;
    private Tax tax;
    private Product[] products;
    private int indexToAddNewProduct;
    private Discount discount;

    // static initialisation block
    static {
        System.out.println("Cart.class is uploaded int JVM");
    }

    // non-static initialisation block
    {
        cartCounter++;
        userId = 1;
        tax = new Tax(DEFAULT_TAX_TYPE, DEFAULT_TAX_RATE);
        discount = new Discount(DEFAULT_DISCOUNT_NAME, DEFAULT_DISCOUNT_RATE);
    }

    //Constructors
//    public Cart() {
//
//    }
//
//    public Cart(int id, int userId) {
//        this.id = id;
//        this.userId = userId;
//    }


    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", userId=" + userId +
                ", totalNetPrice=" + totalNetPrice +
                ", totalGrossPrice=" + totalGrossPrice +
                ", totalTax=" + totalTax +
                ", tax=" + tax +
                ", products=" + Arrays.toString(products) +
                ", indexToAddNewProduct=" + indexToAddNewProduct +
                ", discount=" + discount +
                '}';
    }

    public static class Tax {
        private String taxType;
        private double taxRate;

        public Tax(String taxType, double taxRate) {
            this.taxType = taxType;
            this.taxRate = taxRate;
        }

        public String getTaxType() {
            return taxType;
        }

        public void setTaxType(String taxType) {
            this.taxType = taxType;
        }

        public double getTaxRate() {
            return taxRate;
        }

        public void setTaxRate(double taxRate) {
            this.taxRate = taxRate;
        }
    }

    public class Discount {
        private String discountName;
        private double discountRate;

        public Discount(String discountName, double discountRate) {
            this.discountName = discountName;
            this.discountRate = discountRate;
        }

        public String getDiscountName() {
            return discountName;
        }

        public void setDiscountName(String discountName) {
            this.discountName = discountName;
        }

        public double getDiscountRate() {
            return discountRate;
        }

        public void setDiscountRate(double discountRate) {
            this.discountRate = discountRate;
        }
    }
}
