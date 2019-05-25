<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-3.4.0.min.js" type="text/javascript"></script>

<title>Insert title here</title>
</head>
<body>
    <h2>Jersey RESTful Web Application!</h2>
    <p><a href="webapi/myresource">Jersey resource</a>
    <p>Visit <a href="http://jersey.java.net">Project Jersey website</a>
    for more information on Jersey!
    
    
    
    <div class="container">    
    <h2>Shipping Details</h2>   
     <form action="">      
     <div class="form-group">        
     <label for="email">ID:</label>        
     <input type="nic" class="form-control" id="nic" pattern="[0-9]" placeholder="Enter ID" name="email" required="required">     
      </div> 
      <br>
       <div class="form-group">        
     <label for="email">Name:</label>                                                                                                                                             
     <input type="emails" class="form-control" id="email" placeholder="Enter name" name="email" required="required">     
      </div>
      <br>
       <div class="form-group">        
     <label for="email">Address:</label>        
     <input type="emails" class="form-control" id="email" placeholder="Enter address" name="email" required="required">     
      </div>
      <br>
       <div class="form-group">        
     <label for="email">Telephone no:</label>        
     <input type="tel" class="form-control" id="mobile" pattern="^\d{4}-\d{3}-\d{4}$" placeholder="Enter telephone no" name="email"required="required">     
      </div>
      
        <button type="submit" onclick=validateForm() "btn btn-default">Submit</button>  
        </form>
        
        
</body>
</html>
