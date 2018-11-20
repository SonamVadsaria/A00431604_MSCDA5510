function validateFields() {
	var result = true;
	for (var i = 0; i < document.forms[0].length - 1; i++) {
		if (document.forms[0][i].value == null
				|| document.forms[0][i].value.trim() == "") {
			result = false;
			alert("Enter all inputs fields");
			break;
		} else if (document.forms[0][i].value.indexOf(";") > -1
				|| document.forms[0][i].value.indexOf(":") > -1
				|| document.forms[0][i].value.indexOf("@") > -1
				|| document.forms[0][i].value.indexOf("#") > -1
				|| document.forms[0][i].value.indexOf("$") > -1
				|| document.forms[0][i].value.indexOf("%") > -1
				|| document.forms[0][i].value.indexOf("^") > -1
				|| document.forms[0][i].value.indexOf("*") > -1
				|| document.forms[0][i].value.indexOf("+") > -1
				|| document.forms[0][i].value.indexOf("?") > -1
				|| document.forms[0][i].value.indexOf("<") > -1
				|| document.forms[0][i].value.indexOf(">") > -1) {
			result = false;
			alert("Enter non special characters");
			break;
		}
	}
	return result;
}