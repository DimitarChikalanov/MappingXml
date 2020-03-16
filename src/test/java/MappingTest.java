import model.SubscriptionStatus;
import org.junit.*;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MappingTest {
  private XmlMapping xmlMapping;
  private SubscriptionStatus sb;

  @Test
  public void Run() throws IOException {
      byte[] XML =
              ("<?xml version=\"1.0\"?>\n"
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
                      + "      </output>\n" )
                      .getBytes(StandardCharsets.UTF_8);
    xmlMapping = new XmlMapping();
    sb = xmlMapping.Mapper(XML);
   Assert.assertEquals("MONTHLY_PREMIUM", sb.getItemId());
    Assert.assertEquals("N", sb.getFreeTrial());
  }
}
