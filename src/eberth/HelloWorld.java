package eberth;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "eberth.ISimpleInterface")
public class HelloWorld implements ISimpleInterface{

    @Override
    @WebMethod
    public String saySomething(){
        return "Hello World";
    }

    @Override
    @WebMethod
    public DummyData getData(String _name){
        return new DummyData(_name, System.currentTimeMillis());
    }
}


