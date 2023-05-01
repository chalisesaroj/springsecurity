<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>EMI Calculator</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <style>
      .form-background {
        background-color: #f8f9fa;
      }
    </style>
  </head>
  <body>
    <div class="container mt-5">
      <div class="row">
        <div class="col-md-5 form-background">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title mb-4">EMI Calculator</h5>
              <form action="emicalculator" method="post">
                <div class="form-group">
                  <label for="loanamt">Loan Amount</label>
                  <input type="text" class="form-control" id="loanamt" name="loanamt" required>
                </div>
                <div class="form-group">
                  <label for="loanperiod">Loan Period</label>
                  <div class="input-group">
                    <input type="text" class="form-control" id="loanperiod" name="loanperiod" required>
                    <div class="input-group-append">
                      <span class="input-group-text">Years</span>
                    </div>
                    <input type="text" class="form-control" id="lpm" name="lpm" required>
                    <div class="input-group-append">
                      <span class="input-group-text">Months</span>
                    </div>
                  </div>
                </div>
                <div class="form-group">
                  <label for="interestrate">Interest Rate</label>
                  <div class="input-group">
                    <input type="text" class="form-control" id="interestrate" name="interestrate" required>
                    <div class="input-group-append">
                      <span class="input-group-text">%</span>
                    </div>
                  </div>
                </div>
                <button type="submit" class="btn btn-primary">Calculate</button>
              </form>
            </div>
          </div>
        </div>
        <div class="col-md-6">
        <%
  String[][] myArray = (String[][])session.getAttribute("detailvalue");
%>
       <table>
       <tr>
       <th>Month</th><th>Interest</th><th>Principle Deducted</th><th>EMI </th><th>Remaining Balance</th>
  <%
    for(int i=0; i<myArray.length; i++) {
      out.print("<tr>");
      for(int j=0; j<myArray[i].length; j++) {
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
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
 
 <style>
 table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}

th {
  background-color: #f2f2f2;
  font-weight: bold;
}
 </style> </body>
</html>
