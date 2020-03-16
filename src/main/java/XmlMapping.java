import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.SubscriptionStatus;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class XmlMapping {
    private ObjectMapper mapper;

    public XmlMapping() {
        mapper = new XmlMapper();
    }


    public SubscriptionStatus Mapper(byte[] xml) throws IOException {
        SubscriptionStatus subscriptionStatus = null;
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      //  mapper.getDeserializationConfig().
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(dateFormat);
        subscriptionStatus = mapper.readValue(xml, SubscriptionStatus.class);

        return subscriptionStatus;
    }
}
