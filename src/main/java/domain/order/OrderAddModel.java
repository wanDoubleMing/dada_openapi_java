package domain.order;

import com.alibaba.fastjson.annotation.JSONField;
import domain.BaseModel;

import java.math.BigDecimal;

/**
 * DATE: 18/9/2
 *
 * @author: wan
 */
public class OrderAddModel extends BaseModel {

    @JSONField(name = "shop_no")
    private String shopNo;

    @JSONField(name = "origin_id")
    private String originId;

    @JSONField(name = "city_code")
    private String cityCode;

    @JSONField(name = "cargo_price")
    private BigDecimal cargoPrice;

    @JSONField(name = "is_prepay")
    private Integer isPrepay;

    @JSONField(name = "receiver_name")
    private String receiverName;

    @JSONField(name = "receiver_address")
    private String receiverAddress;

    @JSONField(name = "receiver_lat")
    private BigDecimal receiverLat;

    @JSONField(name = "receiver_lng")
    private BigDecimal receiverLng;

    private String callback;

    @JSONField(name = "receiver_phone")
    private String receiverPhone;

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public BigDecimal getCargoPrice() {
        return cargoPrice;
    }

    public void setCargoPrice(BigDecimal cargoPrice) {
        this.cargoPrice = cargoPrice;
    }

    public Integer getIsPrepay() {
        return isPrepay;
    }

    public void setIsPrepay(Integer isPrepay) {
        this.isPrepay = isPrepay;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }


    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public BigDecimal getReceiverLat() {
        return receiverLat;
    }

    public void setReceiverLat(BigDecimal receiverLat) {
        this.receiverLat = receiverLat;
    }

    public BigDecimal getReceiverLng() {
        return receiverLng;
    }

    public void setReceiverLng(BigDecimal receiverLng) {
        this.receiverLng = receiverLng;
    }
}
