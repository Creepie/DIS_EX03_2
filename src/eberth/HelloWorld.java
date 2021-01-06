package eberth;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author Mario Eberth
 * this is the implementation ob the webService which implements the {@link ISimpleInterface}
 */
@WebService(endpointInterface = "eberth.ISimpleInterface")
public class HelloWorld implements ISimpleInterface{

    /**
     * this method returns a test String
     * @return Hello World for testing the functionality
     */
    @Override
    @WebMethod
    public String saySomething(){
        return "Hello World";
    }

    /**
     * this method returns a dummyData
     * @param _name is the given name
     * @return a dummyData with the given Name
     */
    @Override
    @WebMethod
    public DummyData getData(String _name){
        return new DummyData(_name, System.currentTimeMillis());
    }
}


