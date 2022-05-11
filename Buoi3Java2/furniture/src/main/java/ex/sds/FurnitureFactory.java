package ex.sds;

public class FurnitureFactory {

    public Table createTable() {
        return new Table("", 0, 0);
    }

    public Table createTable(String sn, double initValue, double decayFactor) {
        return new Table(sn, initValue, decayFactor);
    }

    public Chair createChair() {
        return new Chair("", 0, 0);
    }

    public Chair createChair(String sn, double initValue, double decayConstant) {
        return new Chair(sn, initValue, decayConstant);
    }

}
