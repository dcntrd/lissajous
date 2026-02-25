package net.decentered.stuff.lissajous.panel;

public interface ParameterChangedListener {
    void xChanged(double x);
    void yChanged(double y);
    void phaseChanged(double phase);
}
