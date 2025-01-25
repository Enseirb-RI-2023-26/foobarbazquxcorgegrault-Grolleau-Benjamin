package com.jad;

import java.util.ArrayList;

public class Foo {
    private Bar bar;
    private ArrayList<Baz> bazes = new ArrayList<>();
    private Qux qux;
    private Corge corge;
    private ArrayList<Grault> graults = new ArrayList<>();

    public Foo(Bar bar) {
        this.bar = bar;
        this.qux = new Qux();
    }

    public void addBaz(Baz baz) {
        this.bazes.add(baz);
    }

    public void addGrault() {
        this.graults.add(new Grault(this));
    }
}
