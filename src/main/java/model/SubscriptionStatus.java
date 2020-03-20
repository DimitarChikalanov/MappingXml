package model;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;
import java.util.Date;


@XmlAccessorType(XmlAccessType.FIELD)
public class SubscriptionStatus   {

  @JacksonXmlProperty(localName = "subscriptionType")
  private ItemType itemType;

  @JacksonXmlProperty(localName = "subscriptionStatus")
  private ItemStatus itemStatus;

  @JacksonXmlProperty(localName = "subscriptionPurchaseDate")
  private Date subscriptionPurchaseDate;

  @JacksonXmlProperty(localName = "subscriptionEndDate")
  private Date subscriptionEndDate;

  @JacksonXmlProperty(localName = "subscriptionFirstPurchaseID")
  private String purchaseId;

  @JacksonXmlProperty(localName = "countryCode")
  private String countryCode;

  @JacksonXmlProperty(localName = "localCurrencyCode")
  private String currency;

  @JacksonXmlProperty(localName = "localPrice")
  private BigDecimal localPrice;

  @JacksonXmlProperty(localName = "supplyPrice")
  private BigDecimal supplyPrice;

  @JacksonXmlProperty(localName = "itemID")
  private String itemId;

  @JacksonXmlProperty(localName = "freeTrial")
  private boolean freeTrial;

  @JacksonXmlProperty(localName = "latestOrderId")
  private String latestOrderId;

  @JacksonXmlProperty(localName = "subscriptionFirstPaymentDate")
  private Date subscriptionFirstPaymentDate;

  @JacksonXmlProperty(localName = "totalNumberOfTieredPayment")
    private Integer totalNumberOfRenewalPayment;

    @JacksonXmlProperty(localName = "realMode")
    private Boolean more;

  public SubscriptionStatus() {}

  public ItemType getItemType() {
    return itemType;
  }

  public void setItemType(ItemType itemType) {
    this.itemType = itemType;
  }

  public ItemStatus getItemStatus() {
    return itemStatus;
  }

  public void setItemStatus(ItemStatus itemStatus) {
    this.itemStatus = itemStatus;
  }

  public Date getSubscriptionPurchaseDate() {
    return subscriptionPurchaseDate;
  }

  public void setSubscriptionPurchaseDate(Date subscriptionPurchaseDate) {
    this.subscriptionPurchaseDate = subscriptionPurchaseDate;
  }

  public Date getSubscriptionEndDate() {
    return subscriptionEndDate;
  }

  public void setSubscriptionEndDate(Date subscriptionEndDate) {
    this.subscriptionEndDate = subscriptionEndDate;
  }

  public String getPurchaseId() {
    return purchaseId;
  }

  public void setPurchaseId(String purchaseId) {
    this.purchaseId = purchaseId;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public BigDecimal getLocalPrice() {
    return localPrice;
  }

  public void setLocalPrice(BigDecimal localPrice) {
    this.localPrice = localPrice;
  }

  public BigDecimal getSupplyPrice() {
    return supplyPrice;
  }

  public void setSupplyPrice(BigDecimal supplyPrice) {
    this.supplyPrice = supplyPrice;
  }

  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public Boolean getFreeTrial() {
    return freeTrial;
  }

  public void setFreeTrial(String freeTrial) {
    this.freeTrial = freeTrial.equalsIgnoreCase("Y")?true:false;
  }

  public String getLatestOrderId() {
    return latestOrderId;
  }

  public void setLatestOrderId(String latestOrderId) {
    this.latestOrderId = latestOrderId;
  }

  public Date getSubscriptionFirstPaymentDate() {
    return subscriptionFirstPaymentDate;
  }

  public void setSubscriptionFirstPaymentDate(Date subscriptionFirstPaymentDate) {
    this.subscriptionFirstPaymentDate = subscriptionFirstPaymentDate;
  }

  public Integer getTotalNumberOfRenewalPayment() {
    return totalNumberOfRenewalPayment;
  }

  public void setTotalNumberOfRenewalPayment(Integer totalNumberOfRenewalPayment) {
    this.totalNumberOfRenewalPayment = totalNumberOfRenewalPayment;
  }

  public Boolean getMore() {
    return more;
  }

  public void setMore(String more) {
    this.more = more.equalsIgnoreCase("Y")?true:false;
  }

  @Override
  public String toString() {
    return "SubscriptionStatus{"
        + "itemType="
        + itemType
        + ", itemStatus="
        + itemStatus
        + ", subscriptionPurchaseDate="
        + subscriptionPurchaseDate
        + ", subscriptionEndDate="
        + subscriptionEndDate
        + ", purchaseId='"
        + purchaseId
        + '\''
        + ", countryCode='"
        + countryCode
        + '\''
        + ", currency='"
        + currency
        + '\''
        + ", localPrice="
        + localPrice
        + ", supplyPrice="
        + supplyPrice
        + ", itemId='"
        + itemId
        + '\''
        + ", freeTrial="
        + freeTrial
        + ", latestOrderId='"
        + latestOrderId
        + '\''
        + ", subscriptionFirstPaymentDate="
        + subscriptionFirstPaymentDate
        + ", totalNumberOfRenewalPayment="
        + totalNumberOfRenewalPayment
        + ", more='"
        + more
        + '\''
        + '}';
  }
}
