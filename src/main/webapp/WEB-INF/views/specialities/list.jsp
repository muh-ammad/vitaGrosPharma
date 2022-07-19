<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../shared/header.jspf" %>
    <div class="container pt-3">
      <div class="row">
         <div class="col-sm-8"><h4 class="">Specialities</h4></div>
         <div class="col-sm-4 text-right">    
         <a href="/specialities/new" class="btn btn-primary active" role="button" aria-pressed="true"><span>Add Speciality</span></a>
             <!--button type="button" class="btn btn-primary float-right">
                <a href="/specialities/new" style="color:white;" class="btn btn-primary btn-lg active" role="button" aria-pressed="true"><span>Add Speciality</span></a>
             </button-->
         </div>
    </div>
 <h2></h2>
 <div class="table-responsive-sm">
    <table class="table table-striped mb-4">
        <thead class="thead-dark">
            <tr>
                <th style="width: 150px;">Name</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="speciality" items="${specialities}">
            <tr>
                <td><c:out value="${speciality.name}" /></td>
                                <td class="float-right">
                            <button type="button" class="btn btn-success"><a href="specialities/${speciality.name}" style="color:white;">Detail</a></button>
                            <button type="button" class="btn btn-secondary"><a href="specialities/update/${speciality.name}" style="color:white;">Update</a></button>
                            <button type="button" class="btn btn-danger"><a href="specialities/delete/${speciality.name}" style="color:white;">Delete</a></button>
                        </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>  
    </div>
    </div>
<%@include file="../shared/footer.jspf" %>