package design.oberserver.excercies2;

public class EmployeeObserver extends Observer2 {
    public EmployeeObserver(Subject2 subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("EmployeeObserver state changed:"+subject.getState());
    }
}
