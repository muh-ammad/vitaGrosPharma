<%@include file="../shared/header.jspf" %>
    <div class="container pt-3">
      <div class="row">
         <div class="col-sm-8"><h4 class="">Veterinarians</h4></div>
         <div class="col-sm-4 text-right">    
         <a href="/vets/new" class="btn btn-primary active" role="button" aria-pressed="true"><span>Add Veterinarian</span></a>
             <!--button type="button" class="btn btn-primary float-right">
                <a href="/specialities/new" style="color:white;" class="btn btn-primary btn-lg active" role="button" aria-pressed="true"><span>Add Speciality</span></a>
             </button-->
         </div>
    </div>
 <h2></h2>
 <div class="table-responsive-sm">
    <table class="table table-striped table-sm table-bordered">
        <thead class="thead-dark">
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Specialities</th>
                <th scope="col" style="text-align:right;">Actions</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="vet" items="${vets}">
            <tr>
                <td><a href="#" style="color:green;"><c:out value="${vet.fullName}" /></a></td>
                
                <td>
                <c:forEach var="speciality" items="${vet.specialities}">
                <c:out value="${speciality}"/>
                </c:forEach>
                </td>
                
                 <td style="text-align:right;">
                    <button type="button" class="btn btn-success"><a href="vets/${vet.id}" style="color:white;">Detail</a></button>
                    <button type="button" class="btn btn-secondary"><a href="vets/update/${vet.id}" style="color:white;">Update</a></button>
                    <button type="button" class="btn btn-danger"><a href="vets/delete/${vet.id}" style="color:white;">Delete</a></button>
                 </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>  
    </div>
    </div>
<%@include file="../shared/footer.jspf" %>