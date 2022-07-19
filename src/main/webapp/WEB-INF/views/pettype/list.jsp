<%@include file="../shared/header.jspf"%>
<div class="container pt-3">
        <div class="row">
            <div class="col-sm-8"><h4 class="">Pet Types</h4></div>
            <div class="col-sm-4 text-right">    
            <a href="/pettypes/new" class="btn btn-primary active" role="button" aria-pressed="true"><span>Add PetType</span></a>
                <!--button type="button" class="btn btn-primary float-right">
                    <a href="/specialities/new" style="color:white;" class="btn btn-primary btn-lg active" role="button" aria-pressed="true"><span>Add Speciality</span></a>
                </button-->
            </div>
        </div>
 <h2></h2>
 <div class="table-responsive-sm">
    <table class="table table-striped table-sm mb-4">
        <thead class="thead-dark">
            <tr>
                <th>Name</th>
                <th style="text-align:right;">Actions</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="petType" items="${petTypes}">
            <tr>
                <td><c:out value="${petType.name}" /></td>
                    <td style="text-align:right;">
                        <button type="button" class="btn btn-success"><a href="pettypes/${petType.name}" style="color:white;">Detail</a></button>
                        <button type="button" class="btn btn-secondary"><a href="pettypes/update/${petType.name}" style="color:white;">Update</a></button>
                        <button type="button" class="btn btn-danger"><a href="pettypes/delete/${petType.name}" style="color:white;">Delete</a></button>
                    </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>  
    </div>
</div>
<%@include file="../shared/footer.jspf"%>