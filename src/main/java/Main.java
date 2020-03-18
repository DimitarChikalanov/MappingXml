import model.Envelop;
import model.SubscriptionStatus;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
  public static void main(String[] args) throws IOException {

    XmlMapping mapping = new XmlMapping();

    byte[] xml = ( "<?xml version=\"1.0\"?>\n"
            + "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"
            + "  <soap:Body>\n"
            + "    <ns2:getSubscriptionStatusResponse xmlns:ns2=\"http://ws.iap.samsung.com/\">\n"
            + "      <output>\n"
            + "        <subscriptionPurchaseDate>2020-03-06 13:29:34</subscriptionPurchaseDate>\n"
            + "        <subscriptionEndDate>2020-03-06 15:29:34</subscriptionEndDate>\n"
            + "        <subscriptionType>Item_Type_Auto_Recurring_Subscription</subscriptionType>\n"
            + "        <subscriptionStatus>ACTIVE</subscriptionStatus>\n"
            + "        <subscriptionFirstPurchaseID>88299e92b252a708cd3b29a290a8465305cfe51e6a31fc581513f1a5620cf38b</subscriptionFirstPurchaseID>\n"
            + "        <countryCode>BGR</countryCode>\n"
            + "        <localCurrencyCode>BGN</localCurrencyCode>\n"
            + "        <localPrice>8.880</localPrice>\n"
            + "        <supplyPrice>8.880</supplyPrice>\n"
            + "        <itemID>MONTHLY_PREMIUM</itemID>\n"
            + "        <freeTrial>N</freeTrial>\n"
            + "        <realMode>N</realMode>\n"
            + "        <latestOrderId>P20200306BG33350176</latestOrderId>\n"
            + "        <totalNumberOfTieredPayment>0</totalNumberOfTieredPayment>\n"
            + "        <currentPaymentPlan>R</currentPaymentPlan>\n"
            + "        <totalNumberOfRenewalPayment>12</totalNumberOfRenewalPayment>\n"
            + "        <subscriptionFirstPaymentDate>2020-03-06 13:29:34</subscriptionFirstPaymentDate>\n"
            + "      </output>\n"
            + "    </ns2:getSubscriptionStatusResponse>\n"
            + "  </soap:Body>\n"
            + "</soap:Envelope>\n" ).getBytes(StandardCharsets.UTF_8);
   Envelop envelop = mapping.Mapper(xml);
  //  System.out.println(envelop.getBody().getSubscriptionStatusResponse().getSubscriptionStatus().toString());
  }
}
