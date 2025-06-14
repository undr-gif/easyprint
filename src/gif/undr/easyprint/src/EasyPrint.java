package gif.undr.easyprint.src;

public class EasyPrint implements AnsiColors {
    private boolean colorize;

    public EasyPrint(boolean colorize) {
        this.colorize = colorize;
    }

    public void out(Object val) {
        System.out.println(val);
    }

    public void write(Object val) {
        System.out.print(val);
    }

    public void err(Object val) {
        if(colorize) {
            System.out.println(ANSI_RED + "[ERR] > " + val + ANSI_RESET);
        } else {
            System.out.println("[ERR] > " + val);
        }
    }

    public void log(Object val) {
        if(colorize) {
            System.out.println(ANSI_GREEN + "[LOG] > " + val + ANSI_RESET);
        } else {
            System.out.println("[LOG] > " + val);
        }
    }

    public void red(Object val) {
        System.out.println(ANSI_RED + val + ANSI_RESET);
    }

    public void green(Object val) {
        System.out.println(ANSI_GREEN + val + ANSI_RESET);
    }

    public void yellow(Object val) {
        System.out.println(ANSI_YELLOW + val + ANSI_RESET);
    }

    public void blue(Object val) {
        System.out.println(ANSI_BLUE + val + ANSI_RESET);
    }

    public void purple(Object val) {
        System.out.println(ANSI_PURPLE + val + ANSI_RESET);
    }

    public void cyan(Object val) {
        System.out.println(ANSI_CYAN + val + ANSI_RESET);
    }

    public void white(Object val) {
        System.out.println(ANSI_WHITE + val + ANSI_RESET);
    }

    public void black(Object val) {
        System.out.println(ANSI_BLACK + val + ANSI_RESET);
    }
}
