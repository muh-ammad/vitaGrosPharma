
<%@ include file="../shared/header.jspf" %>
<div class="container pt-3">
<div class="row">
   <div class="card">
    <div class="card-header">
        <div class="card-title">Owner Information : </div>
    </div>
        <div class="card-body">
                <dl class="row">
                    <dt class="col-sm-3">Name</dt>
                    <dd class="col-sm-9"><c:out value="${owner.firstName} ${owner.lastName}"/></dd>
                    <dt class="col-sm-3">Address</dt>
                    <dd class="col-sm-9"><c:out value="${owner.address}"/></dd>
                    <dt class="col-sm-3">City</dt>
                    <dd class="col-sm-9"><c:out value="${owner.city}"/></dd>
                    <dt class="col-sm-3">Telephone</dt>
                    <dd class="col-sm-9"><c:out value="${owner.telephone}"/></dd>
                </dl>
        </div>
    </div>
</div>
<div class="row pb-3">
        <div class="col-sm-8">
            <div class="btn-group float-left mt-3" role="group">
            <a href="/owners/edit/${owner.id}" class="btn btn-primary ml-2" role="button" aria-pressed="true"><span>Edit Owner</span></a>
            <a href="/owners/${owner.id}/pets/new" class="btn btn-primary ml-2" role="button" aria-pressed="true"><span>Add Pet</span></a>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="btn-group float-left mt-3" role="group">
            <a href="/owners/list" class="btn btn-danger ml-2" role="button" aria-pressed="true"><span>Back</span></a>
            </div>
        </div>
</div>
<div class="row">
    <div class="card">
    <div class="card-header">
        <div class="card-title">Pets & Visits : </div>
    </div>
        <div class="card-body">
        <div class="row">
            <div class="col-sm-7">
            <c:forEach var="pet" items="${owner.pets}">
              <dl class="row">
                    <dt class="col-sm-6">Name</dt>
                    <dd class="col-sm-6"><c:out value="${pet.name}"/></dd>
                    <dt class="col-sm-6">Date of Birth</dt>
                    <dd class="col-sm-6"><c:out value="${pet.dateOfBirth}"/></dd>
                    <dt class="col-sm-6">Type</dt>
                    <dd class="col-sm-6"><c:out value="${pet.petType.name}"/></dd>
                </dl>
                <hr>
            </c:forEach>
            </div>
            <div class="col-sm-5">
              <dl class="row">
                    <dt class="col-sm-4">Visit Date</dt>
                    <dt class="col-sm-8">Description</dt>
                </dl>
                <c:forEach var="visit" items="${pet.visits}">
                <dl class="row">
                    <dd class="col-sm-4"><c:out value="${visit.visitDate}"/></dd>
                    <dd class="col-sm-8"><c:out value="${visit.description}"/></dd>
                </dl>
                <hr>
                </c:forEach>
                <dl class="row">
                    <dd class="col-sm-4"><a href="/owners/${owner.id}/pets/edit"><span>Edit Pet</span></a></dd>
                    <dd class="col-sm-8"><a href="/owners/${owner.id}/pets/new"><span>Add Visit</span></a></dd>
                </dl>
            </div>
        </div>
        </div>
    </div>
</div>
</div>


