package com.sneakergo.common.constants;

/**
 * Created by thanh on 16/9/2016.
 */
public class SQLParamConstant {
    public static final String GET_REVENUE_EACH_MONTH = "SELECT DATE_FORMAT(date,'%Y-%m') AS period, sum(totalPrice) AS revenue " +
            "FROM Bill " +
            "WHERE status = 'Finished' AND enabled = true AND YEAR(date) = :year GROUP BY MONTH(date)";

    public static final String GET_STOCK_RECORDS = "SELECT s.stockID as stockID, p.productID as productID,s.quantity" +
            " as quantity, a.size as size, p.productName as productName " +
            "FROM attribute a,stock s, product p " +
            "WHERE a.attributeID=s.attributeID AND s.productID=p.productID ORDER BY s.quantity ASC";

    public static final String COUNT_ALL_STOCK_QUANTITY_OF_PRODUCT = "SELECT COUNT(stockID) " +
            "FROM Stock Where productID =:productID";

    public static final String GET_ALL_BILL_IN_TIME = "SELECT b.billID as billID, a.accountID as accountID, a.name as accountName, b.date as date, b.totalPrice as totalPrice,b.enabled as enabled " +
            "FROM bill b, account a " +
            "WHERE b.accountID=a.accountID AND b.date>=:fromDate AND b.date<=:toDate " +
            "ORDER BY b.date DESC";

    public static final String GET_ALL_SALE_IN_TIME = "SELECT s.saleID as saleID, p.productName as productName, s.salePercent as salePercent, s.fromDate as fromDate, s.toDate as toDate, s.enabled as enabled " +
            "FROM sale s, product p " +
            "WHERE s.productID=p.productID AND s.fromDate<=:date AND s.toDate>=:date";

    public static final String GET_ALL_IMPORT_IN_TIME = "SELECT i.importID as importID, p.productName as productName, " +
            "a.size as size, i.quantity as quantity, i.price as price, " +
            "i.importDate as importDate, i.Supplier as supplier " +
            "FROM import i,stock s,product p,attribute a " +
            "WHERE i.stockID=s.stockID AND s.productID=p.productID AND s.attributeID=a.attributeID " +
            "AND i.importDate>=:fromDate AND i.importDate<=:toDate";
}
