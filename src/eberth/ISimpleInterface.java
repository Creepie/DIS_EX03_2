package eberth;

import javax.jws.WebService;

/**
 * this interface provides 2 methods
 */
@WebService
public interface ISimpleInterface {
    /**
     * this method creates a test String
     * @return the test String
     */
    String saySomething();

    /**
     * this method creates a DummyData
     * @param _name is the given name
     * @return a dummyData with the given name
     */
    DummyData getData(String _name);
}
