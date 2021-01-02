package eberth;

import javax.jws.WebService;

@WebService
public interface ISimpleInterface {
    String saySomething();
    DummyData getData(String _name);
}
