package design.oberserver.excercies2;

import design.oberserver.Subject;

public class TestObserver {
    public static void main(String[] args) {
        Subject2 subject2 = new Subject2();

        BusinessmanObserver businessmanObserver = new BusinessmanObserver(subject2);
        EmployeeObserver employeeObserver = new EmployeeObserver(subject2);
        System.out.println("==========STATE 12 ");
        subject2.setState(12);
        System.out.println("===============STATE 14");
        subject2.setState(14);
    }
}
