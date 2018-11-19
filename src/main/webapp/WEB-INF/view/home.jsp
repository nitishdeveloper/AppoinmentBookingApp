<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<div class="container" >
<!-- Start form container -->
<div class="container">
<div class="row">
 <div class="col-md-5" style="border:1px solid gray; margin-top:20px; margin-left:300px; border-radius:5px;">
    <div class="form-area">  
        <form:form action="bookappointment.html" modelAttribute="appoinment" role="form">
        <br style="clear:both">
                    <h3 style="margin-bottom: 25px; text-align: center;">Appointment Form</h3>
    				<div class="form-group">
						<input type="text" class="form-control" id="name" name="patientName" placeholder="Fullname" required>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="telephone" name="telephone" placeholder="Mobile Number" required>
					</div>
					<div class="form-group">
					<select id="gender"  name="gender" class="form-control">
      						<option>Gender</option>
      						<option value="Male">Male</option>
      						<option value="Female">Female</option>
    				</select>
    				</div>
					
					<div class="form-group">
					<textarea class="form-control" id="address" name="address">Full Address</textarea>
					</div>
					<div class="form-group">
						<select id="department"  name="department" class="form-control" required>
      						<option>Select Department</option>
      						<c:forEach items="${departments}" var="depart">
      						 <option value="${depart.departmentName}">${depart.departmentName}</option>
      						</c:forEach>
    				</select>
					</div>
					
					<div class="form-group">
						<input type="date" class="form-control" id="appdate" name="appointmentDate" placeholder="Appointment Date" required>
					</div>
					
					<div class="form-group">
						<input type="text" class="form-control" id="subject" name="appointmentFee" placeholder="Appointment Fee" required>
					</div>
					
					<div class="form-group">
						<select id="paymentMode"  name="paymentSource" class="form-control" required>
      						<option>Payment Mode</option>
      						<option value="Online">Online</option>
      						<option value="Offline">Offline</option>
    				</select>
    				</div>
       		<center> <input type="submit" class="btn btn-primary pull-right" value="Book Now"></center>
        </form:form>
    </div>
</div>
</div>
</div><!-- End of form container -->


</div>
<br>