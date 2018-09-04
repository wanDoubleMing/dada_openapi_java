import client.DadaApiResponse;
import client.DadaRequestClient;
import config.AppConfig;
import domain.merchant.ShopAddModel;
import domain.order.OrderAddModel;
import service.CityCodeService;
import service.merchant.ShopAddService;
import service.order.OrderAddService;
import utils.JSONUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * DATE: 18/9/4
 *
 * @author: wan
 */
public class example {

    private static DadaApiResponse addOrder() {
        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig(false);

        // 2.初始化model
        OrderAddModel orderAddModel = new OrderAddModel();
        orderAddModel.setShopNo("11664071");
        orderAddModel.setOriginId(String.valueOf(System.currentTimeMillis()));
        orderAddModel.setCityCode("021");
        orderAddModel.setCargoPrice(BigDecimal.valueOf(111));
        orderAddModel.setIsPrepay(0);
        orderAddModel.setReceiverName("测试达达");
        orderAddModel.setReceiverAddress("隆宇大厦");
        orderAddModel.setReceiverLat(BigDecimal.valueOf(31.228623));
        orderAddModel.setReceiverLng(BigDecimal.valueOf(121.587172));
        orderAddModel.setReceiverPhone("13622219090");
        orderAddModel.setCallback("http://newopen.qa.imdada.cn");

        // 3.初始化service
        OrderAddService orderService = new OrderAddService(orderAddModel.toJson());

        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(orderService, appConfig);
        return dadaClient.callRpc();


    }

    private static DadaApiResponse addShop() {

        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig(false);

        // 2.初始化model
        ShopAddModel shopAddModel = new ShopAddModel();
        shopAddModel.setOriginShopId("testShop-090402");
        shopAddModel.setStationName("测试门店090402");
        shopAddModel.setBusiness(2);
        shopAddModel.setCityName("上海");
        shopAddModel.setAreaName("浦东新区");
        shopAddModel.setStationAddress("隆宇大厦");
        shopAddModel.setLng(BigDecimal.valueOf(121.587173));
        shopAddModel.setLat(BigDecimal.valueOf(31.228624));
        shopAddModel.setContactName("测试达达2");
        shopAddModel.setPhone("13812344322");

        // 3.初始化service (门店新增比较特殊,是一个批量新增接口)
        List<ShopAddModel> shopAddList = new ArrayList<ShopAddModel>();
        shopAddList.add(shopAddModel);
        ShopAddService shopAddService = new ShopAddService(JSONUtil.toJson(shopAddList));


        // 4.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(shopAddService, appConfig);
        return dadaClient.callRpc();
    }


    private static DadaApiResponse queryCityCode(){
        // 1.初始化配置(isOnline表示是否测试环境)
        AppConfig appConfig = new AppConfig(false);

        // 2.初始化service
        CityCodeService cityCodeService = new CityCodeService("");

        // 3.初始化客户端
        DadaRequestClient dadaClient = new DadaRequestClient(cityCodeService, appConfig);
        return dadaClient.callRpc();
    }

    public static void main(String[] args) {
        DadaApiResponse resp = queryCityCode();
        System.out.println(JSONUtil.toJson(resp));
    }
}
