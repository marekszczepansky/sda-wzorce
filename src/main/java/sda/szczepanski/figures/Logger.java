package sda.szczepanski.figures;

public class Logger {
    private static final Logger instance = new Logger();

    public static Logger getInstance(){
        return instance;
    }

    public void writeLine(String line) {
        System.out.println(line);
    }
}
