package javabean;

import lombok.Data;

import javax.xml.bind.annotation.*;



/**
 * @author Sakura
 * @date 2022年08月02日 15:46:18
 */
@Data
@XmlRootElement(namespace = "http://www.ofdspec.org/2016", name = "OFD")
@XmlAccessorType(XmlAccessType.FIELD)
public class OFD {
   // xml文件根节点  根节点属性：DocType Version  String类型 XmlAttribute
    @XmlAttribute(name ="DocType")
    private String DocType;
    @XmlAttribute(name ="Version")
    private String Version;

    // 下一个节点 DocBody 里面还有节点 再定义一个这个类 继续拆解 XmlElement 子节点
    @XmlElement(name = "DocBody")
    private DOcBody DocBody;




    /*@XmlAttribute(name = "DocType")
    public String DocType;
    @XmlAttribute(name = "Version")
    public String Version;

    public DocBody DocBody;



    @XmlAccessorType(XmlAccessType.FIELD)
    public static class DocBody {
        public DocInfo DocInfo;
        public String DocRoot;
        public String Signatures;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class DocInfo {
        public String DocID;
        public String Creator;
        public String Author;
        public String CreationDate;
        public CustomDatas CustomDatas;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class CustomDatas {
        public List<CustomData> CustomData = new ArrayList<>();
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class CustomData {
        @XmlAttribute(name = "Name")
        public String Name;
        @XmlValue
        public String Value;
    }
*/

}
