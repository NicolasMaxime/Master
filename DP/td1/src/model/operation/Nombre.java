package model;

public interface Nombre {
    void addDigit(int digit);

    Object calculer();
    void setValue(Object calculer);
    boolean isNull();
}
