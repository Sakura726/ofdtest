package javabean;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @author Sakura
 * @date 2022年08月03日 15:15:31
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class DOcBody {
    //节点有 DocInfo DocRoot Signatures
    @XmlElement(name="DocInfo")
    private DOcInfo DocInfo;
    @XmlElement(name="DocRoot")
    private String DocRoot;
    @XmlElement(name="DocRoot")
    private String Signatures;



}
