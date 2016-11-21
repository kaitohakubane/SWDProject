package com.sneakergo.common.constants;

/**
 * Created by thanh on 16/9/2016.
 */
public class SQLParamConstant {
    public static final String GET_ALL_IMPORT_PRODUCT_IN_MONTH = "SELECT p.productName AS label, ip.importQuantity AS data " +
            "FROM ImportProduct AS ip, product AS p " +
            "WHERE p.productId = ip.productId AND ip.enabled = true AND MONTH(ip.importDate) = :month AND YEAR(ip.importDate) = :year";
    public static final String GET_ALL_CURRENT_PRODUCT_IN_WAREHOUSE = "SELECT productName AS label, quantity AS data " +
            "FROM Product " +
            "WHERE enabled = true";

    public static final String GET_REVENUE_EACH_MONTH = "SELECT DATE_FORMAT(date,'%Y-%m') AS period, sum(totalPrice) AS revenue " +
            "FROM Bill " +
            "WHERE status = 'Finished' AND enabled = true AND YEAR(date) = :year GROUP BY MONTH(date)";

    public static final String GET_ALL_BILL_BY_DAY = "SELECT billId, date, totalPrice from Bill WHERE status = " +
            "'Finished' AND enabled = true AND DAY(date) = :day AND MONTH(date) = :month AND YEAR(date) = :year";

    public static final String GET_STOCK_RECORDS = "SELECT s.stockID as stockID, p.productID as productID,s.quantity" +
            " as quantity, a.size as size, p.productName as productName " +
            "FROM attribute a,stock s, product p " +
            "WHERE a.attributeID=s.attributeID AND s.productID=p.productID ORDER BY s.quantity ASC";

    public static final String COUNT_ALL_STOCK_QUANTITY_OF_PRODUCT = "SELECT COUNT(stockID) " +
            "FROM Stock Where productID =:productID";
}
