public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("coca-cola");
        customer.setAge(180);
        customer.setPhoneNumber(123456789);
        customer.setCredit(112233);
        System.out.println("Customer");
        customer.showData();
        System.out.println("======================");

        Worker worker = new Worker();
        worker.setName("Cristian");
        worker.setAge(29);
        worker.setPhoneNumber(69548714);
        worker.setSalary(5000);
        System.out.println("Worker");
        worker.showData();
    }
}