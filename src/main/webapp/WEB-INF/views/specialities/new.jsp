<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../shared/header.jspf" %>
<div class="container pt-3">
<form class="form-floating" action="/specialities/create" method="POST"> 
<div class="form-floating mb-3">
<label for="name">Speciality Name : </label>
<input id="name" name="name" class="form-control" placeholder="name"> 
</div>
<div class="btn-group mt-3" role="group">
<button type="submit" class="btn btn-primary" >Save</button>
 <button type="button" class="btn btn-secondary ml-2">Cancel</button>
  </div>
  </form>
  </div>
  <%@include file="../shared/footer.jspf" %>