<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Medical Record System</title>
</head>

<body>

<h1>Medical Record System</h1>

<form action="MedicalServlet" method="post">

    Patient ID:
    <input type="text" name="patientId"><br><br>

    Name:
    <input type="text" name="name"><br><br>

    Age:
    <input type="text" name="age"><br><br>

    Medical History:
    <input type="text" name="medicalHistory"><br><br>

    Diagnosis:
    <input type="text" name="diagnosis"><br><br>

    Treatment:
    <input type="text" name="treatment"><br><br>

    <input type="submit" value="Submit">

</form>

</body>
</html>