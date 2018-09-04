package service.order;

import config.UrlConstant;
import service.BaseService;

/**
 * DATE: 18/9/3
 *
 * @author: wan
 */
public class OrderAddService extends BaseService {

    public OrderAddService(String params){
        super(UrlConstant.ORDER_ADD_URL, params);
    }
}
