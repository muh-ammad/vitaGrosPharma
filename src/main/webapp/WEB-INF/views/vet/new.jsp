<%@include file="../shared/header.jspf" %>
<div class="container pt-3">
            <div class="row>">
                <div class="col-sm-8">
                    <div class="card">
                    <div class="card-header">New Veterinarian</div>
                    <div class="card-body">
                        <form:form class="form-floating" action="/vets/create" method="POST" modelAttribute="vet" >
                        <div class="form-floating mb-3">
                        <label for="firstname">Vet FirstName : </label>
                        <form:input path="firstName" class="form-control" placeholder="firstname"/>
                        </div>
                        <div class="form-floating mb-3">
                        <label for="lastname">Vet LastName : </label>
                        <form:input path="lastName" class="form-control" placeholder="lastname"/>
                        </div>
                        <div class="form-floating mb-3">
                        <label for="speciality">Specialities : </label>
                        <br>
                        <form:select path="specialities" class="form-control" >
                          <c:forEach items="${specialities}" var="speciality" varStatus="loop">
                            <form:option value="${speciality}">
                                ${speciality.name}
                            </form:option>
                          </c:forEach>
                        </form:select>
                        </div>
                        <div class="btn-group float-right mt-3" role="group">
                        <button type="submit" class="btn btn-primary" >Save</button>
                        <a href="/vets/list" class="btn btn-secondary ml-2" role="button" aria-pressed="true"><span>Cancel</span></a>
                         <!--button type="button" class="btn btn-secondary ml-2">Cancel</button-->
                          </div>
                          </form:form>
                    </div>
                    </div>
                </div>
           </div>
  </div>
<%@include file="../shared/footer.jspf"%>