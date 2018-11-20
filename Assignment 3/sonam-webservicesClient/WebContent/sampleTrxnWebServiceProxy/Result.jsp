<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleTrxnWebServiceProxyid" scope="session" class="com.dpenny.sonam.mcda5510.service.TrxnWebServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleTrxnWebServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleTrxnWebServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleTrxnWebServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.dpenny.sonam.mcda5510.service.TrxnWebService getTrxnWebService10mtemp = sampleTrxnWebServiceProxyid.getTrxnWebService();
if(getTrxnWebService10mtemp == null){
%>
<%=getTrxnWebService10mtemp %>
<%
}else{
        if(getTrxnWebService10mtemp!= null){
        String tempreturnp11 = getTrxnWebService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String trxnID_1id=  request.getParameter("trxnID16");
        int trxnID_1idTemp  = Integer.parseInt(trxnID_1id);
        java.lang.String getTransaction13mtemp = sampleTrxnWebServiceProxyid.getTransaction(trxnID_1idTemp);
if(getTransaction13mtemp == null){
%>
<%=getTransaction13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getTransaction13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 18:
        gotMethod = true;
        String ID_2id=  request.getParameter("ID21");
        int ID_2idTemp  = Integer.parseInt(ID_2id);
        String nameOnCard_3id=  request.getParameter("nameOnCard23");
            java.lang.String nameOnCard_3idTemp = null;
        if(!nameOnCard_3id.equals("")){
         nameOnCard_3idTemp  = nameOnCard_3id;
        }
        String cardNumber_4id=  request.getParameter("cardNumber25");
            java.lang.String cardNumber_4idTemp = null;
        if(!cardNumber_4id.equals("")){
         cardNumber_4idTemp  = cardNumber_4id;
        }
        String cardType_5id=  request.getParameter("cardType27");
            java.lang.String cardType_5idTemp = null;
        if(!cardType_5id.equals("")){
         cardType_5idTemp  = cardType_5id;
        }
        String unitPrice_6id=  request.getParameter("unitPrice29");
        double unitPrice_6idTemp  = Double.parseDouble(unitPrice_6id);
        String quantity_7id=  request.getParameter("quantity31");
        int quantity_7idTemp  = Integer.parseInt(quantity_7id);
        String totalPrice_8id=  request.getParameter("totalPrice33");
        double totalPrice_8idTemp  = Double.parseDouble(totalPrice_8id);
        String expDate_9id=  request.getParameter("expDate35");
            java.lang.String expDate_9idTemp = null;
        if(!expDate_9id.equals("")){
         expDate_9idTemp  = expDate_9id;
        }
        java.lang.String createTransaction18mtemp = sampleTrxnWebServiceProxyid.createTransaction(ID_2idTemp,nameOnCard_3idTemp,cardNumber_4idTemp,cardType_5idTemp,unitPrice_6idTemp,quantity_7idTemp,totalPrice_8idTemp,expDate_9idTemp);
if(createTransaction18mtemp == null){
%>
<%=createTransaction18mtemp %>
<%
}else{
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(createTransaction18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
}
break;
case 37:
        gotMethod = true;
        String ID_10id=  request.getParameter("ID40");
        int ID_10idTemp  = Integer.parseInt(ID_10id);
        String nameOnCard_11id=  request.getParameter("nameOnCard42");
            java.lang.String nameOnCard_11idTemp = null;
        if(!nameOnCard_11id.equals("")){
         nameOnCard_11idTemp  = nameOnCard_11id;
        }
        String cardNumber_12id=  request.getParameter("cardNumber44");
            java.lang.String cardNumber_12idTemp = null;
        if(!cardNumber_12id.equals("")){
         cardNumber_12idTemp  = cardNumber_12id;
        }
        String cardType_13id=  request.getParameter("cardType46");
            java.lang.String cardType_13idTemp = null;
        if(!cardType_13id.equals("")){
         cardType_13idTemp  = cardType_13id;
        }
        String unitPrice_14id=  request.getParameter("unitPrice48");
        int unitPrice_14idTemp  = Integer.parseInt(unitPrice_14id);
        String quantity_15id=  request.getParameter("quantity50");
        int quantity_15idTemp  = Integer.parseInt(quantity_15id);
        String totalPrice_16id=  request.getParameter("totalPrice52");
        int totalPrice_16idTemp  = Integer.parseInt(totalPrice_16id);
        String expDate_17id=  request.getParameter("expDate54");
            java.lang.String expDate_17idTemp = null;
        if(!expDate_17id.equals("")){
         expDate_17idTemp  = expDate_17id;
        }
        java.lang.String updateTransaction37mtemp = sampleTrxnWebServiceProxyid.updateTransaction(ID_10idTemp,nameOnCard_11idTemp,cardNumber_12idTemp,cardType_13idTemp,unitPrice_14idTemp,quantity_15idTemp,totalPrice_16idTemp,expDate_17idTemp);
if(updateTransaction37mtemp == null){
%>
<%=updateTransaction37mtemp %>
<%
}else{
        String tempResultreturnp38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(updateTransaction37mtemp));
        %>
        <%= tempResultreturnp38 %>
        <%
}
break;
case 56:
        gotMethod = true;
        String id_18id=  request.getParameter("id59");
        int id_18idTemp  = Integer.parseInt(id_18id);
        java.lang.String removeTransaction56mtemp = sampleTrxnWebServiceProxyid.removeTransaction(id_18idTemp);
if(removeTransaction56mtemp == null){
%>
<%=removeTransaction56mtemp %>
<%
}else{
        String tempResultreturnp57 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(removeTransaction56mtemp));
        %>
        <%= tempResultreturnp57 %>
        <%
}
break;
case 61:
        gotMethod = true;
        String id_19id=  request.getParameter("id64");
        int id_19idTemp  = Integer.parseInt(id_19id);
        java.lang.Object[] getAllTransactions61mtemp = sampleTrxnWebServiceProxyid.getAllTransactions(id_19idTemp);
if(getAllTransactions61mtemp == null){
%>
<%=getAllTransactions61mtemp %>
<%
}else{
        String tempreturnp62 = null;
        if(getAllTransactions61mtemp != null){
        java.util.List listreturnp62= java.util.Arrays.asList(getAllTransactions61mtemp);
        tempreturnp62 = listreturnp62.toString();
        }
        %>
        <%=tempreturnp62%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>