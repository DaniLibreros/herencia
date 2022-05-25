public class Customer extends Person {

    public int credit;

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void showData () {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Phone: " + this.phoneNumber);
        System.out.println("Credit: " + this.credit);
    }
}
