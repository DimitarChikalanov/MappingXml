import model.Envelop;
import model.SubscriptionStatus;
import org.junit.*;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MappingTest {
  private XmlMapping xmlMapping = new XmlMapping();
  private SubscriptionStatus sb;
  private Envelop ep;


  @Test
  public void run() throws IOException {
    byte[] xml =
        ("<?xml version=\"1.0\"?>\n"
                + "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"
                + "  <soap:Body>\n"
                + "    <ns2:getSubscriptionStatusResponse xmlns:ns2=\"http://ws.iap.samsung.com/\">\n"
                + "      <output>\n"
                + "        <subscriptionPurchaseDate>2020-03-05 13:47:39</subscriptionPurchaseDate>\n"
                + "        <subscriptionEndDate>2020-03-05 15:57:39</subscriptionEndDate>\n"
                + "        <subscriptionType>Item_Type_Auto_Recurring_Subscription</subscriptionType>\n"
                + "        <subscriptionStatus>CANCEL</subscriptionStatus>\n"
                + "        <subscriptionFirstPurchaseID>afee6d580002db0f2c023a56e5fb4cf0dc81824f705a3de3d3107d48c86f5724</subscriptionFirstPurchaseID>\n"
                + "        <countryCode>BGR</countryCode>\n"
                + "        <localCurrencyCode>BGN</localCurrencyCode>\n"
                + "        <localPrice>8.880</localPrice>\n"
                + "        <supplyPrice>8.880</supplyPrice>\n"
                + "        <itemID>MONTHLY_PREMIUM</itemID>\n"
                + "        <freeTrial>N</freeTrial>\n"
                + "        <realMode>N</realMode>\n"
                + "        <latestOrderId>P20200305BG33328638</latestOrderId>\n"
                + "        <cancelSubscriptionDate>2020-03-05 15:57:39</cancelSubscriptionDate>\n"
                + "        <cancelSubscriptionReason>2</cancelSubscriptionReason>\n"
                + "        <totalNumberOfTieredPayment>0</totalNumberOfTieredPayment>\n"
                + "        <currentPaymentPlan>R</currentPaymentPlan>\n"
                + "        <totalNumberOfRenewalPayment>13</totalNumberOfRenewalPayment>\n"
                + "        <subscriptionFirstPaymentDate>2020-03-05 13:47:39</subscriptionFirstPaymentDate>\n"
                + "      </output>\n"
                + "    </ns2:getSubscriptionStatusResponse>\n"
                + "  </soap:Body>\n"
                + "</soap:Envelope>\n")
            .getBytes(StandardCharsets.UTF_8);
    ep = xmlMapping.Mapper(xml);

  }
}
