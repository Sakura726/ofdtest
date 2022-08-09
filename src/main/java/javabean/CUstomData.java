package javabean;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author Sakura
 * @date 2022年08月03日 14:43:45
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class CUstomData {
    @XmlAttribute(name = "Name")
    private String Name;
    @XmlValue
    private String value;

}
