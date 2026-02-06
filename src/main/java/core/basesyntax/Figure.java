package core.basesyntax;

public abstract class Figure {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    abstract void printInfo();
}
