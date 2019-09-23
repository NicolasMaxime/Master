package model.operation;

public class NombreEntier implements Nombre {
    int value;

    public NombreEntier(int value) {
        this.value = value;
    }

    public NombreEntier(Nombre ne){
        this.value = (int)ne.calculer();
    }

    public void setValue(Object value){
        this.value = (int)value;
    }

    public Object calculer() {
        return value;
    }

    public boolean isNull(){
        boolean ret = false;
        if (value == 0)
            ret = true;
        return ret;
    }

    @Override
    public String toString() {
        return value + "";
    }

    @Override
    public void addDigit(int digit) {
        value = value * 10 + digit;
    }
}
