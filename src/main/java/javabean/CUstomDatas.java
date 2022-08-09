package javabean;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Sakura
 * @date 2022年08月03日 14:41:15
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class CUstomDatas {
    //CustomData
    @XmlElement(name = "CustomData")
    private List<CUstomData> CustomData = new ArrayList<>();
}
