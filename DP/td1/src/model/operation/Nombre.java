package model.operation;

public interface Nombre {
    void addDigit(int digit);

    Object calculer();
    void setValue(Object calculer);
    boolean isNull();
}
