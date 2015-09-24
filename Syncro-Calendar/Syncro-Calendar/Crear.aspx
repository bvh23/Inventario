<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Crear.aspx.cs" Inherits="Syncro_Calendar.Crear" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
  <title>Registro de Usuarios</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
   
</head>
<body>

    <form id="form1" runat="server">

<div class="container">
  <h2>Ingrese todos los campos</h2></br>
    <asp:Label ID="Label1" runat="server" Text="Cedula:"></asp:Label>
    <br />
    <asp:TextBox ID="txtCedula" runat="server" Width="604px"></asp:TextBox>
    <br />
    </br>
    <div class="form-group">
      <label for="Nombres">Nombres y Apellidos:</label>&nbsp;
        <asp:TextBox ID="txtNombres" runat="server" Width="611px"></asp:TextBox>
    </div>
    <div class="form-group">
      <label for="pwd">Usuario:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="txtUsuario" runat="server" Width="610px"></asp:TextBox>
    </div>
    <div class="form-group">
      <label for="pwd">Contraseña:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="txtContrasena" runat="server" Width="609px"></asp:TextBox>
    </div>
    <div class="form-group">
      <label for="pwd">Confirme su Contraseña:</label>&nbsp;
        <asp:TextBox ID="txtConfirmacion" runat="server" Width="576px"></asp:TextBox>
    </div>
    <div class="form-group">
      <label for="pwd">Área de Trabajo:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <asp:TextBox ID="txtArea" runat="server" Width="602px"></asp:TextBox>
    </div>
</div>
&nbsp;<asp:Button ID="btnGuardar" runat="server" onclick="btnRegistrar_Click" 
        Text="Registrar" />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:Button ID="btnModificar" runat="server" onclick="btnModificar_Click" 
        Text="Modificar" />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <asp:Button ID="btnEliminar" runat="server" onclick="btnEliminar_Click" 
        Text="Eliminar" />
    <br />
    <br />
    <asp:TextBox ID="txtCedulaElim" runat="server"></asp:TextBox>
    </form>
    <br />
    </form>

</body>
</html>
