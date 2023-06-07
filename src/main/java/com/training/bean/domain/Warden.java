package com.training.bean.domain;

public class Warden {
    private License license;

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "Warden{" +
                "license=" + license +
                '}';
    }
}
