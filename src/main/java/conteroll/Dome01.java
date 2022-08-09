package conteroll;


import com.sun.xml.internal.ws.server.provider.SyncProviderInvokerTube;
import javabean.OFD;
import jdk.internal.util.xml.impl.Input;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.zip.ZipFile;

/**
 * @author Sakura
 * @date 2022年08月02日 14:59:55
 */
public class Dome01 {

    public void getFile() throws Exception {
      /*  String url = "src/main/resources/百望云增值税发票.ofd";
        File ofdfile = new File(url);
        ZipFile zipFile = new ZipFile(ofdfile);
        // 1. 读取OFD.xml文件

        InputStream inputStream = zipFile.getInputStream(zipFile.getEntry("OFD.xml"));*/

        String url = "src/main/java/img/OFD.xml";
        InputStream is = new FileInputStream(url);

        JAXBContext jc = JAXBContext.newInstance(OFD.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        OFD odf = (OFD)unmarshaller.unmarshal(is);

        System.out.println(odf);

    }
}
