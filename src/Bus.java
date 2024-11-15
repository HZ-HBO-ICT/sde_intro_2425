public class Bus {

    private Person _driver;
    private Person _seat1;
    private Person _seat2;
    private Person _seat3;
    private Person _seat4;

    public Bus(Person driver) {
        this._driver = driver;
    }

    public void enter(Person student) {

        if (this._seat1 == null) {
            this._seat1 = student;

        } else if (this._seat2 == null) {
            this._seat2 = student;

        } else if (this._seat3 == null) {
            this._seat3 = student;

        } else if (this._seat4 == null) {
            this._seat4 = student;

        } else {
            System.out.println("Wegwezen " + student.getName() + "!");
        }
    }
}
