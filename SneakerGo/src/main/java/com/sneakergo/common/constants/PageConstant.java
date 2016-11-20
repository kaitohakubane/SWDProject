package com.sneakergo.common.constants;

/**
 * Created by Hung on 11/18/2016.
 */
public class PageConstant {
    public static final String REDIRECT = "redirect:";

    /**
     * For page request constant
     */

    // Home
    public static final String ROOT_PATH_URL = "/";

    public static final String ADMIN_ROOT_PATH_URL = "/admin";

    public static final String HOME_PAGE_URL = "/admin/home";

    // Login
    public static final String LOGIN_PAGE_URL = "/login";
    public static final String GET_ACCOUNT_URL = "/admin/account/get-account";

    // Product
    public static final String PRODUCT_PAGE_URL = "/admin/product";
    public static final String CREATE_PRODUCT_URL = "/admin/product/create";
    public static final String EDIT_PRODUCT_URL = "/admin/product/edit";
    public static final String REMOVE_PRODUCT_URL = "/admin/product/remove";
    public static final String SEARCH_PRODUCT_URL="/admin/product/search";

    // Bill
    public static final String BILL_PAGE_URL = "/admin/bill-management";
    public static final String UPDATE_BILL_URL = "/admin/bill-management/update";
    public static final String REMOVE_BILL_URL = "/admin/bill-management/remove";

    public static final String VIEW_BILL_PAGE_URL = "/api/bill";

    // Bill Detail
    public static final String BILL_DETAIL_PAGE_URL = "/admin/bill-detail";

    // Sale
    public static final String SALE_PAGE_URL = "/admin/sale-management";
    public static final String CREATE_SALE_URL = "/admin/sale-management/create";
    public static final String EDIT_SALE_URL = "/admin/sale-management/edit";
    public static final String REMOVE_SALE_URL = "/admin/sale-management/remove";

    // Import Product
    public static final String IMPORT_PRODUCT_PAGE_URL = "/admin/import-product";
    public static final String CREATE_IMPORT_PRODUCT_URL = "/admin/import-product/create";
    public static final String EDIT_IMPORT_PRODUCT_URL = "/admin/import-product/edit";
    public static final String REMOVE_IMPORT_PRODUCT_URL = "/admin/import-product/remove";

    // Report
    public static final String DAILY_REPORT_PAGE_URL = "/admin/report/daily";
    public static final String MONTHLY_REPORT_PAGE_URL = "/admin/report/monthly";
    public static final String CURRENT_WAREHOUSE_CONSUMER_REPORT_URL = "/admin/report/daily/warehouse-consumer";
    public static final String GET_ALL_BILL_DAILY_REPORT_URL = "/admin/report/daily/sale/get-bill";
    public static final String MONTHLY_IMPORT_PRODUCT_REPORT_URL = "/admin/report/monthly/import-product";
    public static final String REVENUE_REPORT_URL = "/admin/report/monthly/revenue";

    /**
     * For jsp page constant
     */

    // Home
    public static final String HOME_PAGE = "dashboard";

    // Login
    public static final String LOGIN_PAGE = "login-page";

    // Product
    public static final String PRODUCT_PAGE = "product-page";

    // Bill
    public static final String BILL_PAGE = "bill-management-page";

    // Sale
    public static final String SALE_PAGE = "sale-management-page";

    // Import Product
    public static final String IMPORT_PRODUCT_PAGE = "import-product-page";

    // Report
    public static final String DAILY_REPORT_PAGE = "daily-report-page";
    public static final String MONTHLY_REPORT_PAGE = "monthly-report-page";

}
