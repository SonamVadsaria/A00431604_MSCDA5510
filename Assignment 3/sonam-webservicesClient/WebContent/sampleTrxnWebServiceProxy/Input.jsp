<%@page contentType="text/html;charset=UTF-8"%>
<HTML>
<HEAD>
<TITLE>Inputs</TITLE>
</HEAD>
<BODY>
<H1>Inputs</H1>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

boolean valid = true;

if(methodID != -1) methodID = Integer.parseInt(method);
switch (methodID){ 
case 2:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 5:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">endpoint:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="endpoint8" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 10:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 13:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">trxnID:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="trxnID16" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 18:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">ID:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="ID21" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">nameOnCard:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="nameOnCard23" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">cardNumber:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="cardNumber25" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">cardType:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="cardType27" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">unitPrice:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="unitPrice29" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">quantity:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="quantity31" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">totalPrice:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="totalPrice33" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">expDate:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="expDate35" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 37:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">ID:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="ID40" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">nameOnCard:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="nameOnCard42" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">cardNumber:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="cardNumber44" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">cardType:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="cardType46" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">unitPrice:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="unitPrice48" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">quantity:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="quantity50" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">totalPrice:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="totalPrice52" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">expDate:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="expDate54" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 56:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">id:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="id59" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 61:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">id:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="id64" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 1111111111:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">URLString:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="url1111111111" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 1111111112:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
}
if (valid) {
%>
Select a method to test.
<%
}
%>

</BODY>
</HTML>
