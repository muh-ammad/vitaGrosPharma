<%@include file="../shared/header.jspf" %>
<div class="container pt-3">
          <div class="row>">
              <div class="col-sm-8">
                  <div class="card">
                    <div class="card-header">New Pet</div>
                    <div class="card-body">
                    <dl class="row">
                      <dt class="col-sm-4">Owner :</dt>
                      <dd class="col-sm-8"><c:out value="${owner.firstName} ${owner.lastName}"/></dd>
                    </dl>
                          <form:form class="form-floating" action="/owners/${owner.id}/pets/create" method="POST" modelAttribute="pet" >
                          <div class="form-floating mb-3">
                          <label for="firstname">Name : </label>
                          <form:input path="name" class="form-control" placeholder="name" />
                          <form:errors path="name"/>
                          </div>
                          <div class="form-floating mb-3">
                          <label for="lastname">Date of Birth : </label>
                          <form:input path="dateOfBirth" class="form-control" type="date"  />
                          </div>
                          <div class="form-floating mb-3">
                          <label for="type">Type : </label>
                          <br>
                          <form:select path="petType" class="form-control" >
                            <c:forEach items="${types}" var="type" varStatus="loop">
                              <form:option value="${type.name}">
                                  ${type.name}
                              </form:option>
                            </c:forEach>
                          </form:select>
                          <form:errors path="petType"/>
                          </div>
                    <div class="btn-group float-right mt-3" role="group">
                        <button type="submit" class="btn btn-primary" >Save</button>
                        <a href="/owners/show/${owner.id}" class="btn btn-secondary ml-2" role="button" aria-pressed="true"><span>Cancel</span></a>
                    </div>
                        </form:form>
                    </div>
                  </div>
              </div>
          </div>
  </div>
<%@include file="../shared/footer.jspf"%>