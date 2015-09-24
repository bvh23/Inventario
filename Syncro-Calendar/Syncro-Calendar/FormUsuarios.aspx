<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="FormUsuarios.aspx.cs" Inherits="Syncro_Calendar.FormUsuarios" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script language="javascript" type="text/javascript">
    
        
    </script>
</head>
<body>
    <div class="container">
    
    <div class="panel panel-primary">
        <div class="panel-body">
            <form id="form1" runat="server">
    <div class="container" align="right">
 
&nbsp;<h2 align="center">Administración de Usuarios</h2></br></br>
 
        <asp:Button ID="btnCrear" runat="server" onclick="btnCrear_Click" 
            Text="Administrar" />
&nbsp;
        &nbsp &nbsp &nbsp&nbsp &nbsp &nbsp</div>

<div class="container">
  <h3>Usuarios registrados en el sistema</h3>
    <asp:GridView ID="DV_Ver" runat="server" Width="737px">
    </asp:GridView>
    <br />
    <br />
    <asp:Button ID="btnMostrar" runat="server" onclick="btnMostrar_Click" 
        Text="Mostrar" />
</div>
    </form>
        </div>
    </div>
    </div>
</body>
</html>
