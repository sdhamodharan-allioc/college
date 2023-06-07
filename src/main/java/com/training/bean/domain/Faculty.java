package com.training.bean.domain;

public class Faculty {

    private FacultyAddress address;

    public FacultyAddress getAddress() {
        return address;
    }

    public void setAddress(FacultyAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "FacultyAddress{" +
                "address=" + address +
                '}';
    }
}
