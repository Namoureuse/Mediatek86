<h1>Petit calcul :</h1>
<hr />
<?php
if (isset($_POST["txtVal1"])) {
  // invocation du service web
  $service = new SoapClient("http://localhost:8080/Calcul/CalculWS?wsdl") ;
  // récupération des valeurs post
  $param->val1 = intval($_POST["txtVal1"]) ;
  $param->val2 = intval($_POST["txtVal2"]) ;
  // appel de la méthode du web service
  $result = $service->somme($param) ;
  // affichage du résultat
  echo $param->val1." + ".$param->val2." = ".$result->return ;
}
?>
<hr />
<form method="POST" action="index.php">
  <input type="text" name="txtVal1" />+
  <input type="text" name="txtVal2" />=
  <input type="submit" value="somme" />
</form>