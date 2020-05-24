package Mortgage;

public class Users {

        /*

            Create private following variables
            String username
            String WhichCondition

            String houseType

            int roomCount
            int downPayment
            int longTerm

            StatesTax statesTax;

        Create a constructor  using all the variables.

         */

    private String username;
    private String whichCondition;

    private String houseType;

    private int roomCount;
    private int downPayment;
    private int longTerm;

    private StatesTax statesTax;

    public Users(String username, String whichCondition, String houseType, int roomCount, int downPayment, int longTerm ,StatesTax statesTax) {

        this.username = username;
        this.whichCondition = whichCondition;
        this.houseType = houseType;
        this.roomCount = roomCount;
        this.downPayment = downPayment;
        this.longTerm = longTerm;
        this.statesTax = statesTax;


    }


    /*
        All variables are read-only
     */
    public String getWhichCondition() {
        return whichCondition;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getRoomCount() {
        return roomCount;
    }
    public StatesTax getStatesTax() {
        return statesTax;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public int getLongTerm() {
        return longTerm;
    }

    public String getUsername(){
        return username;
    }


}

