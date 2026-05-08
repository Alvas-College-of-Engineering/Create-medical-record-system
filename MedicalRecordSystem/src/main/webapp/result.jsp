<%@ page import="model.PatientRecord" %>

<%
PatientRecord r =
    (PatientRecord) request.getAttribute("record");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient Medical Record</title>
</head>

<body>

<h1>Complete Patient Medical Information</h1>

<p>Patient ID: <%= r.getPatientId() %></p>
<p>Name: <%= r.getName() %></p>
<p>Age: <%= r.getAge() %></p>
<p>Medical History: <%= r.getMedicalHistory() %></p>
<p>Diagnosis: <%= r.getDiagnosis() %></p>
<p>Treatment: <%= r.getTreatment() %></p>

</body>
</html>