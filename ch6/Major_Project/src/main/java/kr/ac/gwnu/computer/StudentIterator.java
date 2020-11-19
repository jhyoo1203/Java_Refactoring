package kr.ac.gwnu.computer;

import java.util.Iterator;

public class StudentIterator implements Iterator {

    private Major major;
    private int index;

    public StudentIterator(Major major) {
        this.major = major;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        if(this.index < major.getNumberOfStudent()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        // TODO Auto-generated method stub
        Student temp = major.getStudentAt(this.index + 1);
        this.index++;
        return temp;
    }
}
