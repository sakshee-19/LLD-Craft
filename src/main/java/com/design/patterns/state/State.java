package head.first.state.pattern;

import java.io.Serializable;

public interface State extends Serializable {
    void insertCoin();
    void ejectCoin();
    void dispense();
    void turnCrank();
    String getName();
}
