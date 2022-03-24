<?php
header('Content-Type: application/json');

function reponse($code, $message, $result=""){
	$retour = array(
		'code' => $code,
		'message' => $message,
		'result' => $result
	);
	echo json_encode($retour, JSON_UNESCAPED_UNICODE);
}

$table = "";
if(isset($_REQUEST['table'])) {
	$table = $_REQUEST['table'];
}
$id = "";
if(isset($_REQUEST['id'])) {
	$id = $_REQUEST['id'];
}

if($_SERVER['REQUEST_METHOD'] === 'GET'){
	// traitements de récupération
	reponse('200', 'OK', "GET table=$table id=$id");
}else if($_SERVER['REQUEST_METHOD'] === 'POST'){
	// traitements d'ajout
	reponse('200', 'OK', "POST table=$table id=$id");
}else if($_SERVER['REQUEST_METHOD'] === 'PUT'){
	// traitements de modification
	reponse('200', 'OK', "PUT table=$table id=$id");
}else if($_SERVER['REQUEST_METHOD'] === 'DELETE'){
	// traitements de suppression
	reponse('200', 'OK', "DELETE table=$table id=$id");
}
