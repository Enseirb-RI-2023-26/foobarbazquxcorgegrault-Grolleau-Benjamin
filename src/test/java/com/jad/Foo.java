package com.jad;

import java.util.ArrayList;

public class Foo {
    private Bar bar;
    private ArrayList<Baz> bazs = new ArrayList<>();
    private Qux qux;
    private Corge corge;
    private ArrayList<Grault> graults = new ArrayList<>();

    public Foo(Bar bar) {
        this.bar = bar;
        this.qux = new Qux();
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(Corge corge) {
        this.corge.setFoo(null);
        this.corge = corge;
    }

    public Bar getBar() {
        return this.bar;
    }

    public void addBaz(Baz baz) {
        this.bazs.add(baz);
    }

    public ArrayList<Baz> getBazs() {
        return this.bazs;
    }

    public Qux getQux() {
        return this.qux;
    }

    public void addGrault() {
        this.graults.add(new Grault(this));
    }

    public ArrayList<Grault> getGraults() {
        return this.graults;
    }
}
