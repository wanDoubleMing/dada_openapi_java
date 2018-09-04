package service;

import config.UrlConstant;

/**
 * DATE: 18/9/4
 *
 * @author: wan
 */
public class CityCodeService extends BaseService {

    public CityCodeService(String params){
        super(UrlConstant.CITY_CODE_URL, params);
    }
}
