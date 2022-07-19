<%@include file="../shared/header.jspf" %>
<div class="container pt-3">
    <div class="row>">
            <div class="col-sm-2"></div>
            <div class="col-sm-8">
                    <div class="card">
                    <div class="card-header">New PetType</div>
                    <div class="card-body">
                        <form class="form-floating" action="/pettypes/create" method="POST">
                        <div class="form-floating mb-3">
                        <label for="name">PetType Name : </label>
                        <input id="name" name="name" class="form-control" placeholder="name">
                        </div>
                        <div class="btn-group float-right mt-3" role="group">
                        <button type="submit" class="btn btn-primary" >Save</button>
                        <a href="/pettypes/list" class="btn btn-secondary ml-2" role="button" aria-pressed="true"><span>Cancel</span></a>
                         <!--button type="button" class="btn btn-secondary ml-2">Cancel</button-->
                          </div>
                          </form>
                    </div>
                    </div>
            </div>
            <div class="col-sm-2"></div>
    </div>
 </div>
<%@include file="../shared/footer.jspf" %>