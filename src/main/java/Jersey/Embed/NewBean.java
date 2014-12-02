package Jersey.Embed;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Created by lab on 14-12-2.
 */

@XmlRootElement
public class NewBean {

    private String argName;
    private int argAge;

    public NewBean(){}

    public NewBean(String argName, int argAge) {
        this.argName = argName;
        this.argAge = argAge;
    }

//    @XmlTransient
    public String getArgName() {
        return argName;
    }

    public void setArgName(String argName) {
        this.argName = argName;
    }

//    @XmlTransient
    public int getArgAge() {
        return argAge;
    }

    public void setArgAge(int argAge) {
        this.argAge = argAge;
    }

    @Override
    public String toString() {
        return "NewBean{" +
                "argName='" + argName + '\'' +
                ", argAge=" + argAge +
                '}';
    }
}
