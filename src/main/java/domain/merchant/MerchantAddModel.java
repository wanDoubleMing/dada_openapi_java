package domain.merchant;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * DATE: 18/9/3
 *
 * @author: wan
 */
public class MerchantAddModel {

    private String mobile;

    @JSONField(name = "city_name")
    private String cityName;

    @JSONField(name = "enterprise_name")
    private String enterpriseName;

    @JSONField(name = "enterprise_name")
    private String enterpriseAddress;

    @JSONField(name = "enterprise_name")
    private String contactName;

    @JSONField(name = "enterprise_name")
    private String contactPhone;

    private String email;
}
