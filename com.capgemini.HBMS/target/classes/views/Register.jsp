<!DOCTYPE h tml>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>ROBIN ROOMS</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
	  body {
	    font: 400 15px/1.8 Lato, sans-serif;
	    color: #777;
	    position:absolute;
	    left:300px;
	    right:300px;
	  }
		h3, h4 {
		    margin: 10px 0 30px 0;
		    letter-spacing: 10px;      
		    font-size: 20px;
		    color: #111;
		  }
	  .btn {
	    padding: 10px 20px;
	    background-color: #333;
	    color: #f1f1f1;
	    border-radius: 0;
	    transition: .2s;
	  }
	 
	  .modal-header, h4, .close {
	    background-color: #333;
	    color: #fff !important;
	    text-align: center;
	    font-size: 30px;
	  }
	  .modal-header, .modal-body {
	    padding: 20px 30px;
	  }
  </style>
</head>
<body>
 <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal"></button>
          <h4><span class="glyphicon glyphicon-lock "></span> Register</h4>
        </div>
        <div class="modal-body">
          <form  action="Register" method="post">
        	  
            <div class="form-group">
              
             <label for="userid" class="text-info">User Id:<sup>*</sup></label><br>
                                <input type="text" name="ui" id="userid" class="form-control" placeholder="User Id" maxlength="10" required>
            </div>
            <div class="form-group">
              <label for="password" class="text-info">Password:<sup>*</sup></label><br>
                                <input type="password" name="pass" id="password" class="form-control" placeholder="Password" maxlength="5" required>
            </div>
            <div class="form-group">
              
             <label for="email" class="text-info">Email:<sup>*</sup></label><br>
                                <input type="text" name="email" id="email" class="form-control" placeholder="Name" maxlength="10" required>
            </div>
            <div class="form-group">
              
             <label for="username" class="text-info">User name:<sup>*</sup></label><br>
                                <input type="text" name="un" id="usersname" class="form-control" placeholder="Name" maxlength="10" required>
            </div>
             <div class="form-group">
              
             <label for="mobilenumber" class="text-info">Mobile Number<sup>*</sup></label><br>
                                <input type="text" name="mn" id="mobile" class="form-control" placeholder="Name" maxlength="10" required>
            </div>
            <div class="form-group">
              
             <label for="address" class="text-info">Address:<sup>*</sup></label><br>
                                <input type="text" name="address" id="address" class="form-control" placeholder="Name" maxlength="10" required>
            </div>
              <input type="submit" class="btn btn-block " value="Register">
                <span class="glyphicon glyphicon-ok"></span>
          </form>
        </div>
        <div class="modal-footer">
       
          <p><a href="loginjsp.jsp">CANCEL</a></p>
         
        </div>
      </div>
    </div>
  </div>
</div>
</body>
</html>