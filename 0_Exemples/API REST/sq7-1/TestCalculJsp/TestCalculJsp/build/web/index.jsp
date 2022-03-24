<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Test CalculWS</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>
            <h1>Petit calcul :</h1>
            <%-- start web service invocation --%><hr/>
            <%
            try {
                webservice.CalculWS_Service service = new webservice.CalculWS_Service();
                webservice.CalculWS port = service.getCalculWSPort();
                if(request.getParameter("txtVal1") != null){
                    int val1 = Integer.parseInt(request.getParameter("txtVal1")) ;
                    int val2 = Integer.parseInt(request.getParameter("txtVal2")) ;                    
                    int result = port.somme(val1, val2);
                    out.println(val1+" + "+val2+" = "+result);
                }
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
            %>
            <%-- end web service invocation --%><hr/>
        
            <form action="index.jsp" method="POST">
                <input type="text" name="txtVal1" value="" />+
                <input type="text" name="txtVal2" value="" />=
                <input type="submit" value="somme" />
            </form>            
        </div>
    </body>
</html>
