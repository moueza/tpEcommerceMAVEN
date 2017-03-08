<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>

<head>
<title>MENU Atelier</title>

</head>
<body>


	<h1>Hello World</h1>
	<s:form action="catalogue2panierAction">
		<s:submit method="toToPanier" value="Voir le panier" />
	</s:form>




<s:form action="listerCatalogueAction">
		<s:submit method="afficherCatalogue" value="Afficher catalogue" />
	</s:form>





	<!-- 	https://struts.apache.org/docs/iterator.html -->
	<ul>
		<s:iterator value="#metierService.listerCatalogue">
			<li><s:property value="ref" />
				<s:property value="nom" />
				<s:property value="pxUnitr" /></li>
		</s:iterator>
	</ul>


</body>


</html>
