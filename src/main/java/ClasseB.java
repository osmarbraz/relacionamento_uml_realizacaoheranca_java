
public class ClasseB extends ClasseA implements InterfaceC {

    private int b;
    private int c;

    public ClasseB() {
        super();
        setB(0);
        setC(0);
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int getC() {
        return c;
    }

    @Override
    public void setC(int c) {
        this.c = c;
    }
}
