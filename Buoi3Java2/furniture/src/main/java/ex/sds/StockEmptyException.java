package ex.sds;

public class StockEmptyException extends Throwable {
    public StockEmptyException() {
        super("no furnlture in shop");
    }
}
