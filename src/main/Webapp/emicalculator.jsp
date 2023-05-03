<!DOCTYPE html>
<html>
<%
String[][] myArray = (String[][]) session.getAttribute("detailvalue");
%>
<head>
<link rel="icon" type="image/png" href="/static/favicon.ico">

  <title>EMI Calculator</title>
</head>


<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">





<body>

	<h1 style="color: white; text-align: center; background-color: #4169e1">EMI-Calculator</h1>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-5 form-background">
				<div class="card">
					<div class="card-body">
						<form action="emicalculator" method="post">
							<div class="form-group">
								<label for="loanamt">Loan Amount</label> <input type="text"
									class="form-control" id="loanamt" name="loanamt"
									value="${loanamt}" required>
							</div>
							<div class="form-group">
								<label for="loanperiod">Loan Period</label>
								<div class="input-group">
									<input type="text" class="form-control" id="loanperiod"
										name="loanperiod" value="${loanperiod}" required>
									<div class="input-group-append">
										<span class="input-group-text">Years</span>
									</div>
									<input type="text" class="form-control" id="lpm" name="lpm"
										value="${lpm}" required>
									<div class="input-group-append">
										<span class="input-group-text">Months</span>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label for="interestrate">Interest Rate</label>
								<div class="input-group">
									<input type="text" class="form-control" id="interestrate"
										name="interestrate" value="${interestrate}" required>
									<div class="input-group-append">
										<span class="input-group-text">%</span>
									</div>
								</div>
							</div>
							<button type="submit" class="btn btn-primary">Calculate</button>
						</form>

					</div>

				</div>

				<div id="pie-chart"></div>
				<script>
					
				</script>
				<script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
				<script>
					const principal = document.getElementById('loanamt').value;
					const years = document.getElementById('loanperiod').value;
					const month = document.getElementById('lpm').value;

					const EMI =
				<%=myArray[0][3]%>
					const installment = parseInt(years) * 12 + parseInt(month);
					const totalpayment = installment * EMI;
					const totalinterest = totalpayment - principal;
					const principalpercent = principal / totalpayment * 100;
					const interestpercent = totalinterest / totalpayment * 100;

					console.log(principal);
					console.log(EMI);
					console.log(installment);
					console.log(totalpayment);
					console.log(totalinterest);
					console.log(principalpercent);
					console.log(interestpercent);

					// create description variable with HTML content
					const description = "LOAN EMI: " + EMI + "<br>" + "<br>"
							+ "Interest Payable: " + totalinterest + "<br>"
							+ "<br>" + "Total Payment(Principal+ Interest): "
							+ totalpayment + "<br>";

					var data = [ {
						values : [ principalpercent, interestpercent ],
						labels : [ 'Principle Amount', 'Interest paid' ],
						type : 'pie'
					} ];

					var layout = {
						title : 'Break-up of total Payment',
						width : 400,
						height : 400,
						annotations : [ {
							text : description,
							x : -0.3,
							y : -0.28,
							align : 'center',
							showarrow : false
						} ]
					};

					Plotly.newPlot('pie-chart', data, layout);
				</script>

			</div>
			<div class="col-md-7">


				<table>
					<tr>
						<th>Month</th>
						<th>Interest</th>
						<th>Principle Deducted</th>
						<th>EMI</th>
						<th>Remaining Balance</th>
						<%
						for (int i = 0; i < myArray.length; i++) {
							out.print("<tr>");
							for (int j = 0; j < myArray[i].length; j++) {
								out.print("<td>" + myArray[i][j] + "</td>");
							}
							out.print("</tr>");
						}
						%>
					
				</table>


			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

	<style>
.form-background {
	background-color: #f8f9fa;
}

.h1 {
	text-align: center;
	background-color: #f8f9fa;
}

table {
	border-collapse: collapse;
	width: 90%;
	margin-bottom: 1rem;
	margin-left: 60px;
	fonit-size: 10;
}

tr:nth-child(odd) {
	background-color: beige;
}

tr:nth-child(odd):hover {
	background-color: powderblue;
}

tr:hover {
	background-color: powderblue;
}

th {
	padding: 5px 5px;
	background-color: #4169e1;
	color: white;
	text-align: center;
	border: 1px solid #ddd;
}

td {
	border: 1px solid #ddd;
	padding: 5px 5px;
	text-align: center;
	margin: 0px font-size:25px;
	min-width: 15%;
	margin: auto auto auto auto margin:0px
}
</style>
</body>
</html>
