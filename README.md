# 🐱 Challenge - JEE and Java Server Pages (II) 🐱
In this challenge, we will validate our knowledge of using Java Server Pages (JSP) and handling forms.

To tackle this challenge, you will need to apply everything learned in units 8, 9, and 10 of this module. We recommend keeping the material handy in case you have any doubts.

Read through the entire document before starting the individual development of this challenge to ensure you achieve the maximum score and focus your efforts effectively.

Time Allocation: 2 hours.

# 😸 Description 😸
In this challenge, we will develop a new Dynamic Java Web Project. The main feature will be creating a data form with an option to select a hotel room. We will then capture the information, including user data, and display the output showing the cost per day and the type of room.

For this, we will rely on JSP for data visualization, form handling, and request information reception.

# 📋 Requirements 📋
Using the Eclipse IDE, you must create a new Dynamic Web Project called "Desafío2". This project should be deployed under the Apache Tomcat 9 web server.

Once the project is created, you need to set up the structure as follows:

# JSP Creation:

/index.jsp
/procesa.jsp
/assets/html/footer.jsp
/assets/html/head.jsp
/assets/html/header.jsp
/assets/css/styles.css
Java Classes:

/cl/desafiolatam/model/habitacion.java
/cl/desafiolatam/business/HabitacionBusiness.java
The Room Object (Habitación) must be able to include the following attributes:

private int id;
private String nombre;
private String descripcion;
private String imagen;
private int precio;
private int habitaciones;
private int metraje;
All processes related to the object and the system must be housed in the "HabitacionBusiness" class.

Finally, the views index.jsp and proceso.jsp will be responsible for displaying the required information, which is:

Name: e.g., Arturo Erasmo
Surname: e.g., Vidal Pardo
Email: e.g., arturo.vidal@anfp.cl
Payment Method: e.g., Cash
Days: e.g., 2 days
Check-in Date: e.g., January 5, 2023
Total Amount to Pay: e.g., CL$ 160000
The form should be structured as follows:

html
Copiar código
<form method="post" action="procesa.jsp">
  <input type="radio" name="idhabitacion" value="1">
  <input type="text" class="form-control" id="nombre" name="nombre">
  <input type="text" class="form-control" id="apellido" name="apellido">
  <input type="text" class="form-control" id="email" name="email">
  <select id="medio_pago" name="medio_pago" class="form-select"></select>
  <select id="dias" name="dias" class="form-select"></select>
  <select id="fecha_entrada" name="fecha_entrada" class="form-select"></select>
  <button type="submit" class="btn btn-primary">Enviar Solicitud de Compra</button>
</form>
🐾 Important 🐾
You can create any functions you deem necessary for data visualization purposes.

# 🎯 Tasks 🎯
Task 1: Create a new Dynamic Java Web Project named "Desafio2".

Points: 1
Task 2: Create the required package structure, classes, and JSP as specified in points 1 and 2.

Points: 3
Task 3: Create the necessary functions in the HabitacionBusiness class.

Points: 3
Task 4: Display the output information as required in point 4.

Points: 3
# Good luck and success! 🎯
