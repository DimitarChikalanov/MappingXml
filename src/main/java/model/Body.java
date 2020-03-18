package model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@XmlAccessorType(XmlAccessType.FIELD)
public class Body {
    @JacksonXmlProperty(localName = "getSubscriptionStatusResponse")
  private SubscriptionStatusResponse subscriptionStatusResponse;

  public Body() {
  }

    public SubscriptionStatusResponse getSubscriptionStatusResponse() {
        return subscriptionStatusResponse;
    }

    public void setSubscriptionStatusResponse(SubscriptionStatusResponse subscriptionStatusResponse) {
        this.subscriptionStatusResponse = subscriptionStatusResponse;
    }
}
