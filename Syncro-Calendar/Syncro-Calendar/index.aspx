<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="index.aspx.cs" Inherits="Syncro_Calendar.index" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
    <title></title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script>
			
            
              $(document).ready(function(){
                 $('#myModal').modal({
                  show: true,
                 })
              });
             
</script>
    <style type="text/css">
        form div center .container
        {
            position:relative;
            top:20%;    
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div class="modal fade" id="myModal" role="dialog" style="background:#FF6600; background-color:transparent">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header" style="background:black">
                        <center>
                            <h2 style="font-weight:bold; color:White;"> Bienvenidos</h2>
                        </center>
                    </div>
                    <div class="modal-body">
                        <center>
                            
                            <img src="img/syncrocalendar.jpg" style="width:300px;"/>
                            
                                                                 
                        </center>
                    </div>
                </div>
            </div>
        </div>
    <div>
    </div>
            <center>
                <div class="container">
                
                <div class="panel panel-primary">
                    <div class="panel-heading">Login</div>
                    <div class="panel-body">
                        Usuario:<asp:TextBox ID="txtuser" class="form-control" runat="server" placeholder="Ingrese su usuario mayor"></asp:TextBox>
                        <br>
                        Contraseña:<asp:TextBox ID="txtpass" class="form-control" runat="server" placeholder="Ingrese su contraseña"></asp:TextBox>
                        <br>
                        <asp:Button ID="btningresar" runat="server" class="btn btn-primary btn-lg" 
                            Text="Ingresar" onclick="btningresar_Click" />
                    </div>
                    <div class="panel-footer">Campo usuario esta compuesto de primer nombre.primer apellido</div>
                </div>
            </center>
            </div>
        </div>
    </form>
</body>
</html>
