# javaOpenApi
达达开放平台接口java版demo ***[查看接口文档](http://newopen.imdada.cn/#/development/file/index?_k=isjh9o)***

## 使用说明（以新增订单为例）
### 1.配置相关信息(***AppConstant***文件)
<br>

```java
public class AppConstant {
    public final static String ONLINE_HOST = "https://newopen.imdada.cn";
    public final static String QA_HOST = "http://newopen.qa.imdada.cn";
    public final static String FORMAT = "json";
    public final static String V = "1.0";
    public final static String SOURCE_ID = "";
    public final static String QA_SOURCE_ID = "73758";
    public final static String APP_KEY = "";
    public final static String APP_SECRET = "";
}
```
### 2.初始化一个配置文件

```java
// isOnline 判断是否是测试环境，会有不同的域名等
boolean isOnline = false
AppConfig appConfig = new AppConfig(isOnline);
```

### 3.domain文件新建一个model,并初始化

```java
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
```

### 4.新建一个service，并初始化

```java
// service主要有2个参数，一个是url， 一个是业务参数
OrderAddService orderService = new OrderAddService(orderAddModel.toJson());
```

### 5.初始化客户端，并调用rpc

```java
DadaRequestClient dadaClient = new DadaRequestClient(orderService, appConfig);
return dadaClient.callRpc();
```
