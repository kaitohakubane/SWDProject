//package com.shoppee.model;
//
//import com.shoppee.common.constants.SQLParamConstant;
//import com.shoppee.entity.FlotPieChart;
//import com.shoppee.entity.MorisAreaChart;
//import org.hibernate.Criteria;
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
///**
// * Created by Administrator on 10/10/2016.
// */
//@Repository
//public class ReportModel implements ReportModelInterface {
//
//    @Autowired
//    SessionFactory sessionFactory;
//
//    private Session getSession() {
//        return sessionFactory.getCurrentSession();
//    }
//
//    @Override
//    public List<FlotPieChart> findImportProductInMonth(int month, int year) {
//        Query query = getSession().createSQLQuery(SQLParamConstant.GET_ALL_IMPORT_PRODUCT_IN_MONTH).setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//        query.setParameter("month", month);
//        query.setParameter("year", year);
//        return query.list();
//    }
//
//    @Override
//    public List<FlotPieChart> staticWarehouseConsumer() {
//        Query query = getSession().createSQLQuery(SQLParamConstant.GET_ALL_CURRENT_PRODUCT_IN_WAREHOUSE).setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//        return query.list();
//    }
//
//    @Override
//    public List<MorisAreaChart> getRevenueByYear(int year) {
//        Query query = getSession().createSQLQuery(SQLParamConstant.GET_REVENUE_EACH_MONTH).setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//        query.setParameter("year", year);
//        return query.list();
//    }
//}
