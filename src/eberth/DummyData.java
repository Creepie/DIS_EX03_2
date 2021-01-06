package eberth;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mario Eberth
 * this class is to create DummyData objects
 */
@XmlRootElement
public class DummyData {

    /**
     * mText provides the given name
     */
    @XmlElement
    String mText;
    /**
     * mTime provides the given time
     */
    @XmlElement
    long mTime;

    /**
     * empty constructor
     */
    DummyData(){}

    /**
     * constructor
     * @param _name represent the name
     * @param _time represent the time
     */
    DummyData(String _name, long _time){
     mText = _name;
     mTime = _time;
    }

    /**
     * creates a human readable form of the object
     * @return a human readable string of the object
     */
    @Override
    public String toString() {
        return "DummyData{" +
                "mText='" + mText + '\'' +
                ", mTime=" + mTime +
                '}';
    }
}
