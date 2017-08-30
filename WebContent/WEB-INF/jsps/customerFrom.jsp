<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table tr th {
	background: #ccc;
	font-family: courier new;
	font-size: 24px;
}

table tr td, input, select, textarea {
	font-family: arial;
	font-size: 21px;
}
</style>

</head>
<body>

<form name="customerForm" action="saveDetails" method="POST">
		<table align='center' cellspacing='0' border='1' width='70%'
			cellpadding='8'>
			<thead>
				<tr>
					<th colspan='2'>New User Please Register</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td width='32%'><label for='regId'>Customer Id</label></td>
					<td><input type='text' required
						title='Min 2 Char Alphabets Allowed' name='customerID' value=''
						id='regName' /></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><input type='text' name='customerFirstName' id='regFirst' /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type='text' value='' name='customerLastName' id='regLast' /></td>
				</tr>
				<tr>
					<td>Middle initial</td>
					<td><input type='text' name='customerMiddleName' id='regMiddle' /></td>
				</tr>
				<tr>
					<td>Street</td>
					<td><input type='text' name='customerStreet' id='regStreet' /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type='text' name='customerCity' id='regCity' /></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type='text' name='customerState' id='regState' /></td>
				</tr>
				<tr>
					<td>Zip</td>
					<td><input type='text' name='customerZip' id='regZip' /></td>
				</tr>
				<tr>
					<td>phone</td>
					<td><input type='text' name='customerPhone' id='regPhone' /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type='text' name='customerEmail' id='regEmail' /></td>
				</tr>
				<tr>
					<td>Pasword</td>
					<td><input type='Password' value='' name='customerPassword' id='regPwd' />
					</td>
				</tr>


			</tbody>
			<tfoot>
				<tr>
					<td colspan='2' align='right'><input type='submit'
						name='submit' value='Sign Up Here' /> <input type='reset'
						name='can' value='Refresh !' /></td>
				</tr>
			</tfoot>
		</table>
	
	</form>
</body>

</html>