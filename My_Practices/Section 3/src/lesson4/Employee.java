package lesson4;

public class Employee implements Comparable <lesson4.Employee> {
    String name;
    int payment;
    String title;

    public Employee(String name, int payment, String title) {
        this.name = name;
        this.payment = payment;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(lesson4.Employee o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", payment=" + payment +
                ", title='" + title + '\'' +
                '}';
    }
}
