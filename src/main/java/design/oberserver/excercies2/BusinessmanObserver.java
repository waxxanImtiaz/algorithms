package design.oberserver.excercies2;

import design.oberserver.Subject;

public class BusinessmanObserver extends Observer2 {
    public BusinessmanObserver(Subject2 subject2){
        this.subject = subject2;
        this.subject.attach(this);

    }

    @Override
    public void update() {
        System.out.println("BusinessmanObserver state changed: "+this.subject.getState());
    }
}
