public class Worker extends Person {
    public int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int mySalary) {
        this.salary = mySalary;
    }

    public void showData() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Phone: " + this.phoneNumber);
        System.out.println("Salary: " + this.salary);
    }
}
