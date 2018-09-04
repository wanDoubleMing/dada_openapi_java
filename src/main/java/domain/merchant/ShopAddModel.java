package domain.merchant;

import com.alibaba.fastjson.annotation.JSONField;
import domain.BaseModel;

import java.math.BigDecimal;

/**
 * DATE: 18/9/2
 *
 * @author: wan
 */
public class ShopAddModel extends BaseModel {

    @JSONField(name = "origin_shop_id")
    private String originShopId;

    @JSONField(name = "station_name")
    private String stationName;

    private Integer business;

    @JSONField(name = "city_name")
    private String cityName;

    @JSONField(name = "area_name")
    private String areaName;

    @JSONField(name = "station_address")
    private String stationAddress;

    private BigDecimal lng;

    private BigDecimal lat;

    @JSONField(name = "contact_name")
    private String contactName;

    private String phone;

    public String getOriginShopId() {
        return originShopId;
    }

    public void setOriginShopId(String originShopId) {
        this.originShopId = originShopId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getBusiness() {
        return business;
    }

    public void setBusiness(Integer business) {
        this.business = business;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getStationAddress() {
        return stationAddress;
    }

    public void setStationAddress(String stationAddress) {
        this.stationAddress = stationAddress;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
