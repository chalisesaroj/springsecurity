<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>

<%@ page import="com.example.demo.Nepalidatedatabase"%>

<%
Nepalidatedatabase myData = new Nepalidatedatabase();
%>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"
	type="text/javascript"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"
	type="text/javascript"></script>
</head>
<body>
	<div class="container">
		<h1>Date-Converter</h1>
		<p>Instantly Convert date from BS to AD and vice versa. Thank you</p>
	
		<div class="row">
			<div class="col-sm-6" style="background-color: yellow;">
			<h2> AD to BS Converter</h2>
				<form action="englishtonepalidateconvert" method="post">

					<select id="engyear" name="engyear" style="width: 100px">
					<option value="">Select Year</option>

						<script type="text/javascript">
							for (var i = 1944; i <= 2034; i++) {
								document.write("<option value='" + i + "'>" + i
										+ "</option>");
							}
						</script>
					</select> <select id="engmonth" name="engmonth" style="width: 100px">
						<option value="">Select Month</option>
						<option value="01">January</option>
						<option value="02">February</option>
						<option value="03">March</option>
						<option value="04">April</option>
						<option value="05">May</option>
						<option value="06">June</option>
						<option value="07">July</option>
						<option value="08">August</option>
						<option value="09">September</option>
						<option value="10">October</option>
						<option value="11">November</option>
						<option value="12">December</option>
					</select> <select id="engday" name="engday">
					<option value="">Select Day</option>
						<script src="dayselectenglish.js" type="text/javascript">
							
						</script>

					</select> <input type="submit" value="convert">

				</form>
				${nepalidate}
			</div>


			<div class="col-sm-6" style="background-color: pink;">
				<h2> BS to AD Converter</h2>
				<form action="nepalitoenglishdateconvert" method="post">

					<select id="nepyear" name="nepyear" style="width: 100px">
						<option value="">Select Year</option>
						<script type="text/javascript">
							for (var i = 2000; i <= 2090; i++) {
								document.write("<option value='" + i + "'>" + i
										+ "</option>");
							}
						</script>
					</select> <select id="nepmonth" name="nepmonth" style="width: 100px">
						<option value="">Select Month</option>
						<option value="01">Baisakh</option>
						<option value="02">Jestha</option>
						<option value="03">Asadh</option>
						<option value="04">Shrawan</option>
						<option value="05">Bhadra</option>
						<option value="06">Ashoj</option>
						<option value="07">Kartik</option>
						<option value="08">Mangsir</option>
						<option value="09">Poush</option>
						<option value="10">Magh</option>
						<option value="11">Falgun</option>
						<option value="12">Chaitra</option>
					</select> <select id="nepday" name="nepday" style="width: 100px">
						<option value="">Select day</option>
						<script src="dayselect.js" type="text/javascript">				
						</script>
					</select> <input type="submit" value="convert">

				</form>
				${englishdate}

			</div>
		</div>
	</div>
	<hr>
	</body>
</html>