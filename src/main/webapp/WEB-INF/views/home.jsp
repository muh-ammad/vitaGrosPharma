<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="shared/header.jspf" %>
<div class="jumbotron jumbotron-fluid">
    <div class="container">
      <h1 class="display-4">Welcome</h1>
        <p class="lead">VitaGros Pharma is a veterinary clinic that is an establishment of care for animals<p/>
            <!--hr class="my-4"-->
        <p>It offers care for your pets as well as the possibility to visit them</p>
        <img src="<c:url value ="/resources/images/pets.jpeg"/>"  alt="image" style="height: 200px;width: 600px; display: block; margin: 10px;" />
    </div>
  </div>
<%@include file="shared/footer.jspf"%>
