package logging;

public class DBLogger implements Logger {
    @Override
    public boolean isDebugEnabled() {
        return false;
    }

    @Override
    public void log(String message) {
        //logging in a database
    }
}
