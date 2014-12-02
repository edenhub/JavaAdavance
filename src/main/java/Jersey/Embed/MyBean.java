package Jersey.Embed;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Created by adam on 2014/12/2.
 */
@XmlRootElement
public class MyBean {
    @XmlElement
    private String name;
    @XmlElement
    private int age;

    public MyBean(){}

    public MyBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @XmlTransient
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
