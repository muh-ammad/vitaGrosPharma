<%@include file="../shared/header.jspf" %>
<div class="container pt-3">
            <div class="row>">
                <div class="col-sm-8">
                    <div class="card">
                    <div class="card-header"> New/Update Owner
                    </div>
                    <div class="card-body">
                        <form:form class="form-floating" action="/owners/create" method="POST" modelAttribute="owner" >
                        <div class="form-floating mb-3"> 
                        <label for="firstname">Owner FirstName : </label>
                        <form:input path="firstName" class="form-control" placeholder="firstname"/>
                        <input  name="id" type="hidden"  value="${owner.id}">
                        </div>
                        <div class="form-floating mb-3">
                        <label for="lastname">Owner LastName : </label>
                        <form:input path="lastName" class="form-control" placeholder="lastname"/>
                        </div>
                        <div class="form-floating mb-3">
                        <label for="address">Address : </label>
                        <form:input path="address" class="form-control" placeholder="address"/>
                        </div>
                        <div class="form-floating mb-3">
                        <label for="city">City : </label>
                        <form:input path="city" class="form-control" placeholder="city"/>
                        </div>
                        <div class="form-floating mb-3">
                        <label for="telephone">Telephone : </label>
                        <form:input path="telephone" class="form-control" placeholder="telephone"/>
                        </div>
                        <div class="btn-group float-right mt-3" role="group">
                        <button type="submit" class="btn btn-primary" >Save</button>
                        <a href="/owners/list" class="btn btn-secondary ml-2" role="button" aria-pressed="true"><span>Cancel</span></a>
                         <!--button type="button" class="btn btn-secondary ml-2">Cancel</button-->
                          </div>
                          </form:form>
                    </div>
                    </div>
                </div>
           </div>
  </div>
<%@include file="../shared/footer.jspf"%>