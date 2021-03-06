package Mortgage;

    /*

        Create a enum name is StatesTax
            Add Enumerated data types as
                NEWYORK amount of the tax 20
                NEWJERSEY amount of the tax 15
                FLORIDA amount of the tax 5
                OHIO amount of the tax 12

           return the amount of the tax
    */

public enum StatesTax {
        NEWYORK(20) , NEWJERSEY(15) , FLORIDA(5) , OHIO(12);

    private int tax;

    StatesTax(int tax) {
        this.tax = tax;
    }

    public int getTax(){
        return tax;
    }

}
