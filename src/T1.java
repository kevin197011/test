public class T1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        C1 c = new C1("hello");
        factory(c);
    }

    public static void factory(I1 i1) {
        boolean b = i1.check();
        System.out.println(b);
    }
}

interface I1 {
    boolean check();
}

abstract class Demo01 {
    public abstract void func01(String s);

    public abstract boolean func02(int i);
}

class C2 extends Demo01 {
    @Override
    public void func01(String s) {
        System.out.println(s);
    }

    @Override
    public boolean func02(int i) {
        return false;
    }
}

class C1 implements I1 {
    final private String s;

    public C1(String s) {
        this.s = s;
    }

    public boolean check() {
        return !"".equals(this.s);
    }
}
