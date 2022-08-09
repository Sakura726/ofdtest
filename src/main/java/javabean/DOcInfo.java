package javabean;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sakura
 * @date 2022年08月03日 15:16:59
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class DOcInfo {
    // DocID   CustomDatas
    @XmlElement(name = "DocID")
    private String DocID;
    @XmlElement(name = "CustomDatas")
    private CUstomDatas CustomDatas;
}


