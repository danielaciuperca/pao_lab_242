package logging;

public class Main {
    public static void main(String[] args) {
        // 1st way to obtain an instance of an interface
        MyFileLogger myFileLogger = new MyFileLogger();
        myFileLogger.log("There was a NullPointer exception in the main method");
        myFileLogger.logInfo("The main method was called");
        myFileLogger.logError("The app crashed");
    }
}
