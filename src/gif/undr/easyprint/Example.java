package gif.undr.easyprint;
import gif.undr.easyprint.src.EasyPrint;
public class Example {

    private static EasyPrint console = new EasyPrint(true);
    private static EasyPrint consoleNoColor = new EasyPrint(false);

    public static void main(String[] args) {
        console.log("Hello world!");
        console.err("Error");
        // Using no colorize EasyPrint console
        consoleNoColor.log("Hello world!");
        consoleNoColor.err("Error");

        console.black("Black");
        console.blue("Blue");
        console.cyan("Cyan");
        console.green("Green");
        console.purple("Purple");
        console.red("Red");
        console.white("White");
        console.yellow("Yellow");
    }
}
