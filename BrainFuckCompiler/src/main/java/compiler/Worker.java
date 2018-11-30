package compiler;

import compiler.commands.Command;

public class Worker {
    private Command greater;
    private Command less;
    private Command plus;
    private Command minus;
    private Command dot;

    public Worker(Command greater, Command less, Command plus, Command minus, Command dot) {
        this.greater = greater;
        this.less = less;
        this.plus = plus;
        this.minus = minus;
        this.dot = dot;
    }

    public void doGreater() {
        greater.execute();
    }
    public void doLess() {
        less.execute();
    }
    public void doPlus() { plus.execute(); }
    public void doMinus() {
        minus.execute();
    }
    public void doDot() {
        dot.execute();
    }
}
