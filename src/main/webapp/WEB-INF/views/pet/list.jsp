<%@include file="../shared/header.jspf" %>
<div class="container pt-3">
      <div class="row mb-3">
         <div class="col-sm-8"><h4 class="">Pets</h4></div>
         <div class="col-sm-4 text-right">    
         <!--a href="/pets/new" class="btn btn-primary active" role="button" aria-pressed="true"><span>Add Pet</span></a-->
             <!--button type="button" class="btn btn-primary float-right">
                <a href="/specialities/new" style="color:white;" class="btn btn-primary btn-lg active" role="button" aria-pressed="true"><span>Add Speciality</span></a>
             </button-->
         </div>
    </div>
 <div class="table-responsive-sm">
    <table class="table table-striped table-sm table-bordered">
        <thead class="thead-dark">
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Birth Date</th>
                <th scope="col">Type</th>
                <!--th scope="col" style="text-align:right;">Actions</th-->
            </tr>
        </thead>
        <tbody>
        <c:forEach var="pet" items="${pets}">
            <tr>
                <td><a href="#" style="color:green;"><c:out value="${pet.name}" /></a></td>
                <td><c:out value="${pet.dateOfBirth}"/></td>
                <td><c:out value="${pet.petType.name}"/></td>
                
<%--                  <td style="text-align:right;">
                    <button type="button" class="btn btn-success"><a href="vets/${pet.name}" style="color:white;">Detail</a></button>
                    <button type="button" class="btn btn-secondary"><a href="vets/update/${pet.name}" style="color:white;">Update</a></button>
                    <button type="button" class="btn btn-danger"><a href="vets/delete/${pet.name}" style="color:white;">Delete</a></button>
                 </td> --%>
            </tr>
        </c:forEach>
        </tbody>
    </table>  
 </div>
</div>
<%@include file="../shared/footer.jspf" %>