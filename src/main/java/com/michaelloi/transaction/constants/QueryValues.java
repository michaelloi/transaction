package com.michaelloi.transaction.constants;

public class QueryValues extends com.michaelloi.common.constants.QueryValues {
    public static final String insertTransaction =
        "INSERT INTO public.tbl_transaction(" +
        "transactionid, "+
        "transactiontype, "+
        "transactionfromccy, "+
        "transactionfromamount, "+
        "transactiontoccy, "+
        "transactiontoamount, "+
        "transactionprice, "+
        "transactiontotalprice, "+
        "transactiondate, "+
        "accountno, "+
        "issuccess)"+
        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

}
