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

    public static final String ADMIN_ROOT_PATH_URL = "/admincp";

    public static final String HOME_PAGE_URL = "/admincp/home";

    // Login
    public static final String LOGIN_PAGE_URL = "/login";

    //Account
    public static final String ACCOUNT_LOGIN_PAGE_URL = "/api/account/login";
    public static final String ACCOUNT_REGISTER_PAGE_URL = "/api/account/register";
    public static final String ACCOUNT_UPDATE_PAGE_URL = "/api/account/update";
    public static final String ACCOUNT_CHANGE_PASS_PAGE_URL = "/api/account/change-password";

    public static final String GET_ACCOUNT_URL = "/admincp/account/get-account";

    // Product
    public static final String PRODUCT_PAGE_URL = "/admin/product";
    public static final String CREATE_PRODUCT_URL = "/admincp/product/create";
    public static final String EDIT_PRODUCT_URL = "/admincp/product/edit";
    public static final String REMOVE_PRODUCT_URL = "/admincp/product/remove";

    public static final String LIST_PRODUCT_URL = "/api/product";
    public static final String TYPE_PRODUCT = "/api/type-product";
    public static final String GET_PRODUCT = "/api/get-product";
    public static final String SHOW_PRODUCT = "/api/show-product";
    public static final String SEARCH_PRODUCT = "/api/search-product";

    // Category (Type)
    public static final String TYPE_PAGE_URL = "/admincp/type";
    public static final String CREATE_TYPE_URL = "/admincp/type/create";
    public static final String EDIT_TYPE_URL = "/admincp/type/edit";
    public static final String REMOVE_TYPE_URL = "/admincp/type/remove";

    public static final String LIST_TYPE_URL = "/api/type";

    // Bill
    public static final String BILL_PAGE_URL = "/admincp/bill";
    public static final String UPDATE_BILL_URL = "/admincp/bill/update";
    public static final String REMOVE_BILL_URL = "/admincp/bill/remove";

    public static final String VIEW_BILL_PAGE_URL = "/api/bill";

    // Bill Detail
    public static final String BILLDETAIL_PAGE_URL = "/admincp/billdetail";
    public static final String SAVE_BILLDETAIL_URL = "/api/billdetail/create";

    // Sale
    public static final String SALE_PAGE_URL = "/admincp/sale";
    public static final String CREATE_SALE_URL = "/admincp/sale/create";
    public static final String EDIT_SALE_URL = "/admincp/sale/edit";
    public static final String REMOVE_SALE_URL = "/admincp/sale/remove";

    // Import Product
    public static final String IMPORT_PRODUCT_PAGE_URL = "/admincp/import-product";
    public static final String CREATE_IMPORT_PRODUCT_URL = "/admincp/import-product/create";
    public static final String EDIT_IMPORT_PRODUCT_URL = "/admincp/import-product/edit";
    public static final String REMOVE_IMPORT_PRODUCT_URL = "/admincp/import-product/remove";

    // Report
    public static final String DAILY_REPORT_PAGE_URL = "/admincp/report/daily";
    public static final String MONTHLY_REPORT_PAGE_URL = "/admincp/report/monthly";
    public static final String CURRENT_WAREHOUSE_CONSUMER_REPORT_URL = "/admincp/report/daily/warehouse-consumer";
    public static final String GET_ALL_BILL_DAILY_REPORT_URL = "/admincp/report/daily/sale/get-bill";
    public static final String MONTHLY_IMPORT_PRODUCT_REPORT_URL = "/admincp/report/monthly/import-product";
    public static final String REVENUE_REPORT_URL = "/admincp/report/monthly/revenue";

    /**
     * For jsp page constant
     */

    // Home
    public static final String HOME_PAGE = "home-page";

    // Login
    public static final String LOGIN_PAGE = "login-page";

    // Product
    public static final String PRODUCT_PAGE = "productPage";

    // Category (Type)
    public static final String TYPE_PAGE = "type-page";

    // Bill
    public static final String BILL_PAGE = "bill-page";

    // Sale
    public static final String SALE_PAGE = "sale-page";

    // Import Product
    public static final String IMPORT_PRODUCT_PAGE = "import-product-page";

    // Report
    public static final String DAILY_REPORT_PAGE = "daily-report-page";
    public static final String MONTHLY_REPORT_PAGE = "monthly-report-page";

}
