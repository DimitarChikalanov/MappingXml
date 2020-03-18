import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.Envelop;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class XmlMapping {
  private ObjectMapper mapper;

  public XmlMapping() {
    mapper = new XmlMapper();
  }

  public Envelop Mapper(byte[] xml) throws IOException {
    Envelop envelop = null;
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    mapper.setDateFormat(dateFormat);
    envelop = mapper.readValue(xml, Envelop.class);
    return envelop;
  }

}
