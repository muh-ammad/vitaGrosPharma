<%@include file="../shared/header.jspf" %>
<div class="container pt-3">
      <div class="row mb-3">
         <div class="col-sm-8"><h4 class="">Owners</h4></div>
         <div class="col-sm-4 text-right">  
         <a href="/owners/new" class="btn btn-primary float-right" role="button" aria-pressed="true"><span>Add Owner</span></a>
            <form class="form-inline">
            <div class="input-group w-100 mr-1">
                <label class="sr-only" for="inlineFormInputName2">Name</label>
                <input type="text" class="form-control mb-2 mr-sm-2" id="inlineFormInputName2" placeholder="Search owner">
                <button type="submit" class="btn btn-primary mb-2">Find</button>
             </div>   
            </form>  
         </div>
    </div>
 <div class="table-responsive-sm">
    <table class="table table-striped table-sm table-bordered">
        <thead class="thead-dark">
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Adress</th>
                <th scope="col">City</th>
                <th scope="col">Telephone</th>
                <th scope="col">Pets</th>
                <th scope="col" style="text-align:right;">Actions</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="owner" items="${owners}">
            <tr>
                <td><a href="#" style="color:green;"><c:out value="${owner.firstName} ${owner.lastName}" /></a></td>
                <td><c:out value="${owner.address}"/></td>
                <td><c:out value="${owner.city}"/></td>
                <td><c:out value="${owner.telephone}"/></td>
                <td>
                    <c:forEach var="pet" items="${owner.pets}">
                    <c:out value="${pet.name}"/>
                    </c:forEach>
                </td>
                 <td style="text-align:right;">
                    <button type="button" class="btn btn-success"><a href="/owners/show/${owner.id}" style="color:white;">Detail</a></button>
                    <button type="button" class="btn btn-secondary"><a href="/owners/edit/${owner.id}" style="color:white;">Update</a></button>
                    <button type="button" class="btn btn-danger"><a href="/owners/delete/${owner.id}" style="color:white;">Delete</a></button>
                 </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>  
 </div>
</div>
<%@include file="../shared/footer.jspf" %>