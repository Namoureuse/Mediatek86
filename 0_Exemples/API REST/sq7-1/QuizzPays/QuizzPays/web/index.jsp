<%!
// d�clarations globales � la page
org.oorsprong.websamples.CountryInfoService service ;
org.oorsprong.websamples.CountryInfoServiceSoapType port ;
%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Quizz des Pays</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
        // invocation du Web Service
        try {
        service = new org.oorsprong.websamples.CountryInfoService();
        port = service.getCountryInfoServiceSoap();
        %>        
        <div>
            <h1>Quizz des Pays</h1>
            <hr />
            <%
            String rang = request.getParameter("txtRang") ;    
            if(rang != null){
                int rangPays = Integer.parseInt(rang);
                String capitaleSaisie = request.getParameter("txtCapitale") ; 
                String monnaieSaisie = request.getParameter("txtMonnaie") ; 
                // r�cup�ration des bonnes r�ponses
                String codePays = port.listOfCountryNamesByName().getTCountryCodeAndName().get(rangPays).getSISOCode() ;
                String capitale = port.capitalCity(codePays) ;
                String monnaie = port.countryCurrency(codePays).getSName() ;   
                // test de la r�ponse
                if(capitaleSaisie.equals(capitale) && monnaieSaisie.equals(monnaie)){
                    out.println("BRAVO !!!");
                }else{
                    out.println("ERREUR !!! la capitale est "+capitale+" et la monnaie est "+monnaie);
                }
            }
            %>
            <hr />
            <form action="index.jsp" method="POST">
                <table>
                    <tr>                        
                        <td>Pays : </td>
                        <td>
                            <%-- start web service invocation --%>
                            <%
                            // TODO process result here
                            org.oorsprong.websamples.ArrayOftCountryCodeAndName result = port.listOfCountryNamesByName();
                            // nombre de pays
                            int nbPays = result.getTCountryCodeAndName().size();
                            // g�n�ration d'un nombre al�atoire pour r�cup�rer un pays
                            int k = (int)(Math.random()*nbPays);
                            // affichage du nom du pays correspondant
                            out.println(result.getTCountryCodeAndName().get(k).getSName());
                            // rang du pays en champ cach� pour le r�cup�rer
                            out.println("<input type='hidden' name='txtRang' value='"+k+"' />") ;
                            %>
                            <%-- end web service invocation --%>

                        </td>
                    </tr>
                    <tr>
                        <td>Capitale : </td>
                        <td><input type="text" name="txtCapitale" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>Monnaie : </td>
                        <td><input type="text" name="txtMonnaie" value="" size="30" /></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td><input type="submit" value="Tester" /></td>
                    </tr>
                </table>
            </form>
        </div>
<%
}catch(Exception ex){
out.println("Acc�s au Web Service indisponible") ;
}
%>                            
    </body>
</html>
