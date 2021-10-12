package codeAnalysis.com.com;

import java.util.Collection;
import java.util.Objects;


public class RearrangeCode {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phone;
    private String email;
    private String notes;
    private Collection<Order> ordersById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    private void privateHelperMethod() {
        // does something in here
    }

    @Override
    public String toString() {
        return "RearrangeCode{" +
                "id=" + this.id +
                ", firstName='" + this.firstName + '\'' +
                ", middleName='" + this.middleName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", phone='" + this.phone + '\'' +
                ", email='" + this.email + '\'' +
                ", notes='" + this.notes + '\'' +
                ", ordersById=" + this.ordersById +
                '}';
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    //test
    //olololo

    public String getMiddleName() {
        return this.middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return this.notes;
    }

    public String getS() {
        return this.s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RearrangeCode that = (RearrangeCode) o;
        return this.id == that.id &&
                Objects.equals(this.firstName, that.firstName) &&
                Objects.equals(this.middleName, that.middleName) &&
                Objects.equals(this.lastName, that.lastName) &&
                Objects.equals(this.phone, that.phone) &&
                Objects.equals(this.email, that.email) &&
                Objects.equals(this.notes, that.notes) &&
                Objects.equals(this.ordersById, that.ordersById);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.middleName, this.lastName, this.phone, this.email, this.notes, this.ordersById);
    }

    public Collection<Order> getOrdersById() {
        return this.ordersById;
    }
    public void setOrdersById(Collection<Order> ordersById) {
        this.ordersById = ordersById;
    }

    private class Order {
    }
}
