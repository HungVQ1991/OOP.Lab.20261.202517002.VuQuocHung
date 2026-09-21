package org.example.custom;

public class Pair {
    private double first;
    private double second;
    public Pair() {
    }
    public Pair(double _first, double _second) {
        first = _first;
        second = _second;
    }
    public double getFirst() { return first; }
    public double  getSecond() { return  second; }
    public void setFirst(double _first) { first = _first; }
    public void setSecond(double _second) { second = _second; }
}
