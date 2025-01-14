public class Main {
    public static void main(String[] args) {

        InfoLogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logger.log(LogProcessor.INFO,"Please info this");
        logger.log(LogProcessor.ERROR,"Please Error this");
    }
}